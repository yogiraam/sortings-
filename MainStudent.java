package p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;

import p1.SortingBasedOnPracticalMarks;
import p1.StudentCollection;



public class MainStudent {
	 Scanner sc = new Scanner(System.in);
	    Scanner scStr = new Scanner(System.in);
	    StudentCollection server=new StudentCollection();
	   public static void main(String[] args) throws InvalidMarksException {
		   

MainStudent ms = new MainStudent();
		        while (true) {
		        	System.out.println("Enter any one option");
		            System.out.println("1. For Technical Students:");
		            System.out.println("2.  For Non-Technical Students");
		            System.out.println("3.  To display students");
		            System.out.println("4.  To sort based on practical marks");
		            System.out.println("5.  To sort based on total marks");
		            System.out.println("6.  To sort based on subject name");
                 switch (new Scanner(System.in).nextInt()) {

		           case 1:
		                ms.techincalStudentDetails();
		                break;

		           case 2:
		                ms.nonTechincalStudentDetails();
		                break;
		           case 3:
		        	   ms.displayStudents();
		        	   break;
                
		           case 4:
		        	   ms.onPracticalMarksSorting();
		        	   break;
		           case 5:
		        	   ms.sortingBasedOnTotalMarks();
		        	   break;
		           case 6:
		        	   ms.sortingBasedOnSubjectName();
		        	   break;
		            }
		       
		        }
		    }//end of main



 


private void displayStudents() {
	  TreeSet<Student> outputStudent=server.getAllStudents();
	  for (Student student : outputStudent) {
		  System.out.println(student);
		
	}
		
	}



public   void techincalStudentDetails() {
		        System.out.println("Enter name of the student:");
		        String name = scStr.nextLine();
		        System.out.println("Enter stream:");
		        String stream = scStr.nextLine();
		        System.out.println("Enter subjective marks out of 60:");
		        int subMarks = sc.nextInt();
		        System.out.println("Enter pratical marks out of 40:");
		        int practMarks = sc.nextInt();



		       Student stec = new TechnicalStudents(name, stream, subMarks, practMarks);
		        server.insertStudent(stec);
		           
						try {
							System.out.println("Technical marks:" + stec.calculateMarks());
						} catch (InvalidMarksException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} 
					
		      
		   
public void nonTechincalStudentDetails()  {
		        System.out.println("Enter name of the student:");
		        String name11 = scStr.nextLine();
		        System.out.println("Enter stream:");
		        String stream11 = scStr.nextLine();
		        System.out.println("Enter subject name");
		        String subjName=scStr.nextLine();
		        System.out.println("Enter subjective marks: ");
		        int subjectiveMarks = sc.nextInt();
		        Student nontec= new NonTechnicalStudents(name11, stream11,subjectiveMarks,subjName);
		        server.insertStudent(nontec);
		        
		       
					try {
						System.out.println("Non technical marks:" + nontec.calculateMarks());
					} catch (InvalidMarksException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				

				}
		    

public void onPracticalMarksSorting()

{
	//sorting based on marks
	List<Student> sortingBasedOnPraticalMarks = new ArrayList<>(server.allStudents);
		Collections.sort(sortingBasedOnPraticalMarks, new SortingBasedOnPracticalMarks());
      server.printCollection(sortingBasedOnPraticalMarks, " Print List of based  on pratical marks");
}
	

public void sortingBasedOnSubjectName() {

	//sorting based on subject name
	List<Student> sortingBasedOnSubjectName=new ArrayList<>();
	Collections.sort(sortingBasedOnSubjectName,new SortingBasedOnSubjectName());
	server.printCollection(sortingBasedOnSubjectName, " Print List of students based on Total marks");
	
	
}
public void sortingBasedOnTotalMarks() {
	// TODO Auto-generated method stub
	//sorting based on total marks
		List<Student> sortingBasedOnTotalMarks=new ArrayList<>();
		Collections.sort(sortingBasedOnTotalMarks,new SortingBasedOnTotalMarks());
	server.printCollection(sortingBasedOnTotalMarks, " Print List of students based on Total marks");
}
}

  
		
