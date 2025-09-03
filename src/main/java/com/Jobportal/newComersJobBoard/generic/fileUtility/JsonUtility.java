package com.Jobportal.newComersJobBoard.generic.fileUtility;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonUtility {
	
	public String getDataFromJsonFile(String key) throws Throwable, Throwable
	{
		
		FileReader fileR=new FileReader(".confiAppData/appCommonData.json");
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(fileR);
		JSONObject map = (JSONObject)obj;
		String data = (String) map.get(key);
		
		return data;
		
	}
	public class JsonUtility1 {
		
		public String getDataFromJsonFile(String key1) throws Throwable, Throwable
		{
			
			FileReader fileR=new FileReader(".confiAppData/appCommonData1.json");
			JSONParser parser = new JSONParser();
			Object obj = parser.parse(fileR);
			JSONObject map = (JSONObject)obj;
			String data = (String) map.get(key1);
			
			return data;
			
		}
}
} 