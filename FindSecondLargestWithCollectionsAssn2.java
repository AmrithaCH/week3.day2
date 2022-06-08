package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestWithCollectionsAssn2 {

	public static void main(String[] args) {

		int[] data = {3,2,11,4,6,7};
		List<Integer> set = new ArrayList<Integer>();
		for(int i=0; i<data.length; i++)
		{
			set.add(data[i]);
		}

		Collections.sort(set);
		System.out.println("Complete list: "+set);

		System.out.println("Second largest num: "+set.get(set.size()-2));


	}

}
