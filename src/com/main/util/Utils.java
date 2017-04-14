package com.main.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

import pojos.SubjectDetailStatus;

public class Utils {
	 
	public Utils() {
		// TODO Auto-generated constructor stub
	}
	public SubjectDetailStatus getJsonData(){
		 Gson gson = new Gson();

		    try {

		        BufferedReader br = new BufferedReader(
		            new FileReader("E:\\Magic marks/Applied Science/Engineering_Mechanics.txt"));

		        //convert the json string back to object
		        SubjectDetailStatus obj = gson.fromJson(br, SubjectDetailStatus.class);

		       // System.out.println(obj);
		        	return obj;
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		    return null;
	}
	
	
	public File[] getAllFileName(){
		File folder = new File("E:\\Magic marks/Applied Science/Applied-Science");
		File[] listOfFiles = folder.listFiles();

		    /*for (int i = 0; i < listOfFiles.length; i++) {
		      if (listOfFiles[i].isFile()) {
		        System.out.println("File " + listOfFiles[i].getName());
		      } else if (listOfFiles[i].isDirectory()) {
		        System.out.println("Directory " + listOfFiles[i].getName());
		      }
		    }*/
		return listOfFiles;
	}
	
	public static String getSubstring(String fileName){
		
		
		
		fileName = fileName.substring(0, fileName.lastIndexOf("."));
	
		    // Because extension is always after the last '.'
		   return fileName;
		
		
	}
public static String getSubstringAfterRemove_FS(String fileName){
		
		
		
		
		if(fileName.contains("_FS")){
			fileName = fileName.substring(0, fileName.lastIndexOf("_FS"));
		}
		if(fileName.contains("_FD")){
			fileName = fileName.substring(0, fileName.lastIndexOf("_FD"));
		}
		    // Because extension is always after the last '.'
		   return fileName;
		
		
	}
}
