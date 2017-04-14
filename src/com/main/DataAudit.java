package com.main;

import java.io.File;

import com.main.util.Utils;

import pojos.SubjectDetail;
import pojos.SubjectDetailStatus;

public class DataAudit {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utils utils=new Utils();
	    SubjectDetailStatus detailStatus=	utils.getJsonData();
		File files[]=utils.getAllFileName();
		getFileMismatchNamesConcepts(detailStatus,files);
		getFileMismatchNamesNumeric(detailStatus,files);
	}

	static void getFileMismatchNamesConcepts(SubjectDetailStatus detailStatus,File files[]){
		boolean isFileAvailable=false;
		SubjectDetail detail=detailStatus.getData(); 
		int topicCount=0;
		System.out.println("count of concepts="+detail.getConceptsList().size());
		for(int i=0;i<detail.getConceptsList().size();i++){
			topicCount=topicCount+detail.getConceptsList().get(i).getTopicDetail().size();
			for(int j=0;j<detail.getConceptsList().get(i).getTopicDetail().size();j++)
			{
				isFileAvailable=false;
				for (int k = 0; k < files.length; k++) {
				      if (files[k].isFile()) {
				    	  
				    	  if(Utils.getSubstring(files[k].getName()).
				    			  equals(Utils.getSubstringAfterRemove_FS(detail.getConceptsList().get(i).getTopicDetail().
				    					  get(j).getTopicFileName()))){
				    		  isFileAvailable=true;
				    		  /*System.out.println("File =" + detail.getConceptsList().get(i).getTopicDetail().
			    					  get(j).getTopicFileName()+ ": "+files[k].getName()); */ 
				    	  }
				     
				      }
				}
				if(!isFileAvailable){
					   System.out.println("ConceptsFile " + detail.getConceptsList().get(i).getTopicDetail().
		    					  get(j).getTopicFileName());
				}
			}
		}
		System.out.println("count of topic="+topicCount);
	}
	static void getFileMismatchNamesNumeric(SubjectDetailStatus detailStatus,File files[]){
		boolean isFileAvailable=false;
		SubjectDetail detail=detailStatus.getData(); 
		int topicCount=0;
		System.out.println("count of numericals="+detail.getNumericalsList().size());
		for(int i=0;i<detail.getNumericalsList().size();i++){
			
			topicCount=topicCount+detail.getNumericalsList().get(i).getTopicDetail().size();
			for(int j=0;j<detail.getNumericalsList().get(i).getTopicDetail().size();j++)
			{
				isFileAvailable=false;
				for (int k = 0; k < files.length; k++) {
				      if (files[k].isFile()) {
				    	  
				    	  if(Utils.getSubstring(files[k].getName()).
				    			  equals(Utils.getSubstringAfterRemove_FS(detail.getNumericalsList().get(i).getTopicDetail().
				    					  get(j).getTopicFileName()))){
				    		  isFileAvailable=true;
				    		  /*System.out.println("File =" + detail.getConceptsList().get(i).getTopicDetail().
			    					  get(j).getTopicFileName()+ ": "+files[k].getName()); */ 
				    	  }
				     
				      }
				}
				if(!isFileAvailable){
					   System.out.println("Numerical File " + Utils.getSubstringAfterRemove_FS(detail.getNumericalsList().get(i).getTopicDetail().
		    					  get(j).getTopicFileName()));
				}
			}
		}
		
		System.out.println("count of topic="+topicCount);
	}
}
