/**
 * 
 */
package javaCollections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 *
 */
public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList<Student> list= new ArrayList<Student>();
		
		List<Student> list= new ArrayList<Student>();
		
		Student student = new Student();
		
		student.rollNo = 1;
		
		student.name = "Abhishek";
		
		student.address = "Hyderabad";
		
		list.add(student);
		
		for(Student ele: list){
			
			System.out.println(ele.rollNo
					+ " "+ele.name + " "+ele.address);
		}
		
	}

}

class Student {

	int rollNo;
	String name, address;

}
