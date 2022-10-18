package p1;

import java.util.Scanner;



public class NonTechnicalStudents extends Student{
	private int subjectiveMarks;
	private String subjectName;
	
	public NonTechnicalStudents(String name, String stream) {
		super(name, stream);
		// TODO Auto-generated constructor stub
	}
	public NonTechnicalStudents(String name, String stream,  int subjectiveMarks,String subjectName) {
	    super(name, stream);
	   
	    this.subjectiveMarks = subjectiveMarks;
	    this.subjectName=subjectName;
	}



	public void setSubjectiveMarks(int subjectiveMarks) {
	    this.subjectiveMarks = subjectiveMarks;
	}
	

	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	@Override
	public int calculateMarks() throws InvalidMarksException{
	
	    if(subjectiveMarks<=90)
	    {
	        this.subjectiveMarks = subjectiveMarks;
	        
	    }
	    else
	    {
	    InvalidMarksException marksException = new InvalidMarksException("marks is for max 90 not more than 90 :- "+subjectiveMarks);
		throw marksException; 
	    }
	    return subjectiveMarks;
	}

}