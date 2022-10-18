package p1;

import java.util.Scanner;

public class TechnicalStudents extends Student {
	
		
	 public TechnicalStudents(String name, String stream) {
	        super(name, stream);
	     }
		    int praticalMarks;
		    int subjectiveMarks;
		 
	   
  public TechnicalStudents(String name, String stream, int praticalMarks, int subjectiveMarks) {
		    super(name, stream);
		    this.praticalMarks = praticalMarks;
		    this.subjectiveMarks = subjectiveMarks;
		}



		public int getPraticalMarks() {
		    return praticalMarks;
		}
		
		public void setPraticalMarks(int praticalMarks) {
		    this.praticalMarks = praticalMarks;
		}
		
		public int getSubjectiveMarks() {
		    return subjectiveMarks;
		}
		
		public void setSubjectiveMarks(int subjectiveMarks) {
		    this.subjectiveMarks = subjectiveMarks;
		}
		
		

@Override
public int calculateMarks() throws InvalidMarksException {
	 
	    if (subjectiveMarks<= 54) {
	    	this.subjectiveMarks = subjectiveMarks;
	    	
	    }
	    else if(subjectiveMarks>= 54)
	    {
	    	 InvalidMarksException marksException = new InvalidMarksException("marks is for max 60 not more than 90% :- "+subjectiveMarks);
		 		throw marksException; 
	    }
	   
	    return  subjectiveMarks+praticalMarks;
	}

}



	