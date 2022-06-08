package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import week1.day2.FindIntersection;

public class FindIntersectionWithCollectionAssn2 {

	public void findIntersection()
	{
		int[] a1 = {3,2,11,4,6,7};
		int[] a2 = {1,2,8,4,9,7};
		
		List<Integer> list1 = new ArrayList<Integer>();
		for(int i=0; i<a1.length; i++)
		{
			list1.add(a1[i]);
		}
		
//		Collections.sort(list1);
		
		List<Integer> list2 = new ArrayList<Integer>();
		for(int i = 0; i< a2.length; i++)
		{
			list2.add(a2[i]);
		}
		
//		Collections.sort(list2);
		list1.retainAll(list2);
		
		System.out.println(list1);
		
	}
	public static void main(String[] args) {
	FindIntersectionWithCollectionAssn2 fi = new FindIntersectionWithCollectionAssn2();
	fi.findIntersection();

	}

}
