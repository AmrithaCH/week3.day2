package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesWithCollectionsAssn2 {

	public void removeDupWithSet()
	{		String text = "We learn java basics as part of java sessions in java week1";
	String[] split = text.split(" ");
	
	Set<String> set = new TreeSet<String>();

	for(int i =0; i<split.length; i++)
	{
		if(set.contains(split[i]))
		{
			set.remove(split[i]);
		}
		else
		{
			set.add(split[i]);				
		}					
	}
	System.out.println(set);		
	}



	public static void main(String[] args) 
	{	
		RemoveDuplicatesWithCollectionsAssn2 rem = new RemoveDuplicatesWithCollectionsAssn2();
		rem.removeDupWithSet();

	}

}
