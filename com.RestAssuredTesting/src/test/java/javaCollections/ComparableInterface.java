/**
 * 
 */
package javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Lenovo
 *
 */
public class ComparableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<StudentData> list = new ArrayList<StudentData>();

		StudentData data = new StudentData(9, "Mohan", "Vizag");
		StudentData data1 = new StudentData(2, "Shiva", "Vizag");
		StudentData data2 = new StudentData(7, "Ganesh", "Vizag");
		StudentData data3 = new StudentData(4, "Kumar", "Vizag");

		list.add(data);
		list.add(data1);
		list.add(data2);
		list.add(data3);

		Collections.sort(list);

		for (StudentData ele : list) {

			System.out.println(ele.rollNo + " " + ele.name + " " + ele.address);
		}

	}

}

class StudentData implements Comparable<StudentData> {

	int rollNo;

	String name;

	String address;

	StudentData(int rollNo, String name, String address) {

		this.rollNo = rollNo;

		this.name = name;

		this.address = address;

	}

	public int compareTo(StudentData o) {

		if (this.rollNo > o.rollNo)
			return 1;
		else
			return -1;

	}

}
