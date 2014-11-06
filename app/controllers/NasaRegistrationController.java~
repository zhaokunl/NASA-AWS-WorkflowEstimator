/*
 * Copyright (c) 2013 Carnegie Mellon University Silicon Valley. 
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available
 * under the terms of dual licensing(GPL V2 for Research/Education
 * purposes). GNU Public License v2.0 which accompanies this distribution
 * is available at http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 * 
 * Please contact http://www.cmu.edu/silicon-valley/ if you have any 
 * questions.
 * 
 * */

package controllers;

import models.NasaRegistration;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import util.APICall;
import util.APICall.ResponseType;
import views.html.index;
import views.html.sensors;
import views.html.registration.*;
import views.html.estimator.*;
import util.*;
import util.EstimatorAPICalls;
import models.metadata.NasaRMdata;
import models.metadata.Sensor;

import java.util.*;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.JsonObject;

public class NasaRegistrationController extends Controller {
	//final static Form<Sensor> sensorForm = Form.form(Sensor.class);
	final static Form<NasaRegistration> userForm = Form
			.form(NasaRegistration.class);

	public static Result registrationForm() {
		return ok(registrationForm.render(userForm));
	}
	
	public static Result updateForm() {
		return ok(updateForm.render(userForm));
	}
	
	public static Result deleteForm(){
		return ok(delete.render(userForm));
	}
	
	public static Result adminPage(){
		return ok(adminPage.render(NasaRegistration.all()));
	}


	

	// Registration
	public static Result submit() {

		Map<String, String[]> regFormEncoded = request().body().asFormUrlEncoded();
		
		//Calling method to get values from the form
		JsonObject getJsonValues = new JsonObject();
		getJsonValues  = util.EstimatorGetValues.getMode(regFormEncoded, "submit");

		String urlStr = "http://einstein.sv.cmu.edu:9000/addContestUser";
		// Sample data
		try {
			EstimatorAPICalls.HttpUserReg(urlStr, getJsonValues, "register");
		}

		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
		}

		return redirect(routes.EstimateController.login());
	}
	
	public static Result update() {

		Form<NasaRegistration> filledForm = userForm.bindFromRequest();
		Map<String, String[]> regFormEncoded = request().body().asFormUrlEncoded();
		JsonObject getJsonValues = new JsonObject();
		
		getJsonValues  = util.EstimatorGetValues.getMode(regFormEncoded, "update");
		
		String urlStr = "http://einstein.sv.cmu.edu:9000/updateContestUser";

		try {
			EstimatorAPICalls.HttpUserReg(urlStr, getJsonValues, "update");
		}
		 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
		}

		return ok(tutorial.render());
	}
	
	public static Result delete() {

		Form<NasaRegistration> filledForm = userForm.bindFromRequest();
		Map<String, String[]> regFormEncoded = request().body().asFormUrlEncoded();
	
		JsonObject getJsonValues = new JsonObject();
		
		getJsonValues  = util.EstimatorGetValues.getMode(regFormEncoded, "delete");

		String urlStr = "http://einstein.sv.cmu.edu:9000/deleteContestUser";
		
		try {

			
			
			urlStr = urlStr + '/' + getJsonValues.get("userName").getAsString() + '/'
			       		+ getJsonValues.get("password").getAsString();
			
			EstimatorAPICalls.HttpUserReg(urlStr, getJsonValues, "delete");
						 		 
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
		}

		return redirect(routes.NasaRegistrationController.registrationForm());
	}
}
