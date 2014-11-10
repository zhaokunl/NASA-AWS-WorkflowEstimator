package controllers;

import static play.data.Form.form;

import models.NasaRegistration;
import java.io.*;

import models.AWSClient;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;
import play.mvc.Result;
import views.html.estimator.*;

public class Application extends Controller {

	public static Result index(String email, String vfile, String dataset) {
		return ok(index.render(email, vfile, dataset));
	}

	public static Result estimate1() {
		// get the file from the user's upload
		MultipartFormData body = request().body().asMultipartFormData();
		FilePart picture = body.getFile("file");

		String workingDir = System.getProperty("user.dir");
		if (picture != null) {
			String fileName = picture.getFilename();
			String contentType = picture.getContentType();
			File file = picture.getFile();

			// create new file with the same name under tmpfiles/
			File newfile = new File(workingDir + "/tmpfiles/" + fileName);
			InputStream inStream;
			try {
				// copy files
				inStream = new FileInputStream(file);
				OutputStream outStream = new FileOutputStream(newfile);
				byte[] buffer = new byte[1024];
				int length;
				// copy the file content in bytes
				while ((length = inStream.read(buffer)) > 0) {
					outStream.write(buffer, 0, length);
				}
				inStream.close();
				outStream.close();
				// upload the new file to s3
				AWSClient.upload(newfile, fileName);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {

				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ok(estimate1.render());
		} else {
			flash("error", "Missing file");

			return ok(estimate.render("", "", ""));
		}

	}

	public static Result estimate2() {
		return ok(estimate2.render());
	}

	public static Result estimate3() {
		return ok(estimate3.render());
	}

	public static Result tutorial() {
		return ok(tutorial.render());
	}

	public static Result accountSummary(String userName) {
		return ok(accountSummary.render(userName));
	}

	// -- Authentication
	public static class Login {


		public String username;
		public String password;

		public String validate() {
			if (username == null || password == null)
				return "Invalid username or password";


			return null;
		}

	}

	/** Login page. */

	public static Result login() {
		return ok(login.render(form(Login.class)));
	}

	/** Handle login form submission. */

	/** Handle login form submission. */
	public static Result authenticate() {
		Form<Login> loginForm = form(Login.class).bindFromRequest();
		/*
		 * if (loginForm.hasErrors()){ System.out.println("Test"); return
		 * badRequest(login.render(loginForm)); } else {
		 */
		session("username", loginForm.get().username);
		System.out.println("Email:" + loginForm.field("username").value());
		if (loginForm.get().username.equals("admin")) {
			System.out.println("Admin arena");
			// session("username", loginForm.field("username").value());
			return redirect(routes.NasaRegistrationController.adminPage());
		} else {
			// session("username", loginForm.field("username").value());
			String userName = NasaRegistration.getUserInfo(
					loginForm.field("username").value(),
					loginForm.field("password").value());
			System.out.println("Value:" + userName);
			if (userName != null) {
				System.out.println("passed get User info");
				return redirect(routes.Application
						.accountSummary(userName));
			} else
				return redirect(routes.Application.authenticate());
			// Retrieve value from API and check against userName and password.

		}

		// }
	}

	public static Result logout() {
		session().clear();
		flash("success", "You've been logged out");
		return redirect(routes.Application.index(null, null, null));
	}
}
