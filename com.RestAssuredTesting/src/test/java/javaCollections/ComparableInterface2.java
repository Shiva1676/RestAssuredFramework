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
public class ComparableInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<StudentData1> list = new ArrayList<StudentData1>();

		StudentData1 data = new StudentData1(9, "Mohan", "Vizag");
		StudentData1 data1 = new StudentData1(2, "Shiva", "Vizag");
		StudentData1 data2 = new StudentData1(7, "Ganesh", "Vizag");
		StudentData1 data3 = new StudentData1(4, "Kumar", "Vizag");

		list.add(data);
		list.add(data1);
		list.add(data2);
		list.add(data3);

		Comparator<StudentData1> com = new Comparator<StudentData1>() {

			public int compare(StudentData1 o1, StudentData1 o2) {

				if (o1.rollNo > o2.rollNo)

					return 1;

				else
					return -1;

			}

		};

		Collections.sort(list, com);

		for (StudentData1 ele : list) {

			System.out.println(ele.rollNo + " " + ele.name + " " + ele.address);
		}

	}

}

class StudentData1 {

	int rollNo;

	String name;

	String address;

	StudentData1(int rollNo, String name, String address) {

		this.rollNo = rollNo;

		this.name = name;

		this.address = address;

	}

}
