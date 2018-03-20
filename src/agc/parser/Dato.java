package agc.parser;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.simple.JSONObject;
public class Dato {
	 /*atributos para cada dato*/
	 Date Time;
	 double GYRO_X;
	 double GYRO_Y;
	 double GYRO_Z;
	 double ACCEL_X;
	 double ACCEL_Y;
	 double ACCEL_Z;
	
	 public  Dato(JSONObject obj) throws ParseException{
		 
		 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss.SSS");
		
		 Date date = format.parse(obj.get("Time").toString());
		  Time = date;
		  GYRO_X = (double) obj.get("GYRO_X");
		  GYRO_Y =  (double) obj.get("GYRO_Y");
		  GYRO_Z =  (double) obj.get("GYRO_Z");
		  ACCEL_X =  (double) obj.get("ACCEL_X");
		  ACCEL_Y =  (double) obj.get("ACCEL_Y");
		  ACCEL_Z =  (double) obj.get("ACCEL_Z"); 
	 }
	 
}
