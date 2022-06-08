package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumWithCollectionsAssn3 {

	public static void main(String[] args) {
		int[] numbers = {4,6,7,2,3,1,9,10,8,8,6,2};

		Set<Integer> numSet = new TreeSet<Integer>();

		for(int i=0; i<numbers.length; i++)
		{numSet.add(numbers[i]);
		}
		System.out.println(numSet);

		ArrayList<Integer> list = new ArrayList<Integer>(numSet);
		for(int i =0; i<list.size(); i++)
		{
			if(list.get(i+1)!=(list.get(i)+1))
			{
				System.out.println(list.get(i+1));
				break;}
		}


		

	}

}
