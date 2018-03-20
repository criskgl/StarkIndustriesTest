package agc.parser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class Parser {
	 
	 @SuppressWarnings("unchecked")
	    public static void main(String[] args) {
	        JSONParser parser = new JSONParser();
	        
	        //arraylist para guardar en cada slot cada observación(Tiempo, gyro accel)
	        ArrayList<Dato> datos =  new ArrayList<Dato>();
	        
	        try {
	 
	            Object obj = parser.parse(new FileReader("entrada.json"));
	 
	            JSONObject jsonObject = (JSONObject) obj;

	            JSONArray dataList = (JSONArray) jsonObject.get("Data");
	            
	            System.out.println("\nData List:");
	            Iterator<JSONObject> iterator = dataList.iterator();
	            
	            while (iterator.hasNext()) {

	            	JSONObject objectOcurrence = iterator.next();
	                //guardamos cada ocurrencia de la observacion en un objeto dato
	            	Dato datoNow = new Dato(objectOcurrence);
	            	//guardamos el dato en nuestro arraylist de datos
	                datos.add(datoNow);
	                
	              
	            }
	 
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	       //System.out.println("PUTITA:"+datos.get(0));
	 }
}