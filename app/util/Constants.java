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
package util;

public class Constants {
	/*
	 * Starting here is the migration from calling API1.1 to API1.3
	 */

	// API 1.3 URL
	public static final String NEW_API_URL = "http://einstein.sv.cmu.edu:9000/";

	// API Call format
	public static final String FORMAT = "json";
	
	// sensor type
	public static final String NEW_GET_SENSOR_TYPES = "getAllSensorTypes/";
	public static final String NEW_ADD_SENSOR_TYPE = "addSensorType";
	public static final String NEW_DELETE_SENSOR_TYPE = "deleteSensorType/";
	public static final String NEW_EDIT_SENSOR_TYPE = "updateSensorType";

	// sensor
	public static final String NEW_GET_SENSORS = "getAllSensors/";
	public static final String NEW_ADD_SENSOR = "addSensor";
	public static final String NEW_DELETE_SENSOR = "deleteSensor/";
	public static final String NEW_EDIT_SENSOR = "updateSensor";
	
	// device type
	public static final String NEW_GET_DEVICE_TYPES = "getAllDeviceTypes/";
	public static final String NEW_ADD_DEVICE_TYPE = "addDeviceType";
	public static final String NEW_DELETE_DEVICE_TYPE = "deleteDeviceType/"; 
	public static final String NEW_EDIT_DEVICE_TYPE = "updateDeviceType/"; // add the trailing slash!

	// device
	public static final String NEW_GET_DEVICES = "getAllDevices/";
	public static final String NEW_ADD_DEVICE = "addDevice";
	public static final String NEW_DELETE_DEVICE = "deleteDevice/";
	public static final String NEW_EDIT_DEVICE = "updateDevice/"; // add the trailing slash!

	// sensor category
	public static final String NEW_GET_SENSOR_CATEGORY = "getAllSensorCategories/";
	public static final String NEW_ADD_SENSOR_CATEGORY = "addSensorCategory";
	public static final String NEW_DELETE_SENSOR_CATEGORY = "deleteSensorCategory/";
	public static final String NEW_EDIT_SENSOR_CATEGORY = "updateSensorCategory";
	
	// get last minute reading from all devices
	// Caution! Now it calls System.currentTimeMillis(), it is not a pure constant
	public static final String NEW_GET_LAST_MINUTE_DEVICE_READINGS = "getLastMinuteReadingsFromAllDevices/";

	// get sensor reading 
	public static final String NEW_GET_SENSOR_READING_IN_RANGE = "getSensorReadingInRange/"; 
	public static final String NEW_GET_SENSOR_READING = "getSensorReading/"; 
	public static final String NEW_GET_LATEST_SENSOR_READING_IN_ALL_DEVICES ="getLatestReadingsFromAllDevices/";
	
	
}
