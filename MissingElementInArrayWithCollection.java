package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInArrayWithCollection {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++)
		{
			list.add(arr[i]);
		}
        Collections.sort(list);
        for(int i=0; i<list.size(); i++)
        {
        	
        		if((list.get(i))==(list.get(i+1)-1))
        		{
        			continue;
        		}
        		else
        		{
        			System.out.println(list.get(i)+1);
        			break;
        		}
        	
        		
        }
	}

}
