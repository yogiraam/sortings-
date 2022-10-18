package p1;

import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

import allLists.Employee;

public class StudentCollection {

	TreeSet<Student> allStudents=new TreeSet<>();
	 
	public void insertStudent(Student student)
	{
		allStudents.add(student);
	}
	public TreeSet<Student> getAllStudents() {
		return allStudents;
	}
	public void setAllStudents(TreeSet<Student> allStudents) {
		this.allStudents = allStudents;
	}
	public void printCollection(Collection<Student> collection, String tagLine) {

		System.out.println(" \n\n ===============  "+tagLine+"   ==========================\n");
		for (Student e : collection) {
			System.out.println(e);
		}
		
	}
	
	
	
	}//end of class
	

