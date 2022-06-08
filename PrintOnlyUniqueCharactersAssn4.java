package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class PrintOnlyUniqueCharactersAssn4 {

	public static void main(String[] args) {

		String input = "babu";
		char[] inp = input.toCharArray();
		System.out.println(inp);
		Set<Character> set = new TreeSet<Character>();
		for(int i=0; i<inp.length; i++)
		{
			if(set.contains(inp[i]))
			{set.remove(inp[i]);}
			else
			{set.add(inp[i]);
			}
		}

		System.out.println(set);

	}

}
