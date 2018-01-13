package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList<String> strings = new ArrayList();
		String s = new String();
		//   Don't forget to import the ArrayList class
		
		//2. Add five Strings to your list
		strings.add("a");
		strings.add("b");
		strings.add("c");
		strings.add("d");
		strings.add("e");
		
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < strings.size(); i++)
		{
			s = strings.get(i);
			System.out.println(s);
		}
		//4. Print all the Strings using a for-each loop
		for(String s2 : strings)
		{
			System.out.println(s2);
		}
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i < strings.size(); i++)
		{
			if(i%2 == 1)
			{
			s = strings.get(i);
			System.out.println(s);
			}
		}
		//6. Print all the Strings in reverse order.
		for(int i = 0; i < strings.size(); i++)
		{
			s = strings.get(strings.size() - i);
			System.out.println(s);
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i = 0; i < strings.size(); i++)
		{
			s = strings.get(i);
			if(s.contains("e"))
			{
				System.out.println(s);
			}
		}
	}
}
