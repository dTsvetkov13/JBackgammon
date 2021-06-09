package tests;

import java.util.Arrays;
import java.util.Iterator;

import structures.ArrayList;

public class ArrayListTest 
{

	
	public static void main(String[] args) 
	{
		ArrayList<Integer> array = new ArrayList<Integer>();
		
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        
        
        Iterator<Integer> it = array.iterator();
        
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println("Checking if there is next object in the list: " + it.hasNext());
        System.out.println(it.next());
        System.out.println("Checking if there is next object in the list: " + it.hasNext());
        
        printElements(array);
        System.out.println("Checking if the list is empty or not: " + array.isEmpty());
        System.out.println("Checking if the list contains 5: " + array.contains(5));
        System.out.println("The size of the list is: " + array.size());
        array.removeFrom(3);
        System.out.println("The list after removing the number from index 3: ");
        printElements(array);
        array.insertAt(7, 3);
        System.out.println("The list after inserting number 7 at index 3: ");
        printElements(array);
        array.remove(1);
        System.out.println("The list after removing 1: ");
        printElements(array);
        System.out.println("Getting the number at index 2: " + array.get(2));
        array.clear();
        System.out.println("Clearing the list!");
        System.out.println("Checking if the list is empty or not: " + array.isEmpty());
       
	}
	
	private static void printElements(ArrayList<Integer> array)
	{
		for (int i = 0; i < array.size(); i++) 
	    {
	        Object value = array.get(i);

	        System.out.printf("Index = %d; Value = %s\n", i, value);
	    }
	}
	
	
}
