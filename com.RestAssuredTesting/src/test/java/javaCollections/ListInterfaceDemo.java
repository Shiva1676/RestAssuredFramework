/**
 * 
 */
package javaCollections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections.bag.SynchronizedSortedBag;

/**
 * @author Lenovo
 *
 */
public class ListInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Object> list = new ArrayList<Object>();

		list.add("Mohan");
		list.add("Shiva");
		list.add("Ganesh");
		list.add("Kumar");
		list.add("Terapalli");

		// First Approach
		for (int i = 0; i < list.size(); i++) {

			System.out.println(i + " " + list.get(i));
		}

		System.out.println();
		System.out.println("");

		System.out.println("=========Using iterator interface==========");

		// Second Approach
		Iterator<Object> it = list.iterator();

		int count = 0;

		while (it.hasNext()) {

			System.out.println(count++ + " " + it.next());
		}

		System.out.println();
		System.out.println("");
		System.out.println("=========Using for each approach===========");

		int sum = 0;

		for (Object ele : list) {

			System.out.println(sum++ + " " + ele);
		}

		System.out.println();

		System.out.println("");

		System.out.println("========Changing list to array=========");

		Object[] arr = list.toArray();

		// System.out.println(arr.toString());
		int temp = 0;

		for (Object element : arr) {

			System.out.println(temp++ + " " + element);
		}

	}

}
