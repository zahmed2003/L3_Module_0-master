package IntroToArrayLists;

import java.util.ArrayList;

public class LearningArrayLists {

	public static void addToArrayList(ArrayList testList, String string) 
	{
		testList.add(string);
		
	}

	public static ArrayList createArrayList() 
	{
		return new ArrayList();
	}

	public static int getNumberOfItems(ArrayList testList) {
		int num = 0;
		
		for(int i = 0; i < testList.size(); i++) {num +=1;}
		
		return num;
	}

	public static Object getItem(ArrayList testList, int i) 
	{
		return testList.get(i);
	}

	public static String iterateOver(ArrayList testList) 
	{
		String o = new String();
		
		for(int i = 0; i < testList.size(); i++)
		{
			o = o + testList.get(i);
		}
		
		return o;
	}

	public static int findItemOnList(ArrayList testList, String string) 
	{
		for(int i = 0; i < testList.size(); i++)
		{
			if(testList.get(i).equals(string)) {return i;}
		}
		
		return testList.size();
	}

	public static void replaceItem(ArrayList testList, int i, String string) {
		testList.add(i, string);
		testList.remove(i+1);
	}

	public static void insertItem(ArrayList testList, int i, String string) {
		testList.add(i, string);
		
	}

	public static ArrayList<Integer> createTypedArrayList() 
	{
		return new ArrayList<Integer>();
	}

	public static Object addAllInteger(ArrayList<Integer> testList) 
	{
		int sum = 0;
		
		for(int i = 0; i < testList.size(); i++)
		{
			sum += testList.get(i);
		}
		
		return sum;
	}

	public static ArrayList<String> createStringTypedArrayList() 
	{
		return new ArrayList<String>();
	}

	public static String addAllString(ArrayList<String> testList) 
	{
		String total = null;
		
		for(int i = 0; i < testList.size(); i++)
		{
			total += testList.get(i);
		}
		
		return total;
	}
	
	

}
