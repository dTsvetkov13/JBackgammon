package tests;

import structures.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> array= new ArrayList<Integer>();
		
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
       
        System.out.println("Current list: " + array);
        System.out.println("Checking if the list is empty or not: " + array.isEmpty());
        System.out.println("Checking if the list contains 5: " + array.contains(5));
        System.out.println("The size of the list is: " + array.size());
        array.removeFrom(3);
        System.out.println("The list after removing the number from index 3: " + array);
        array.insertAt(7, 3);
        System.out.println("The list after inserting number 7 at index 3: " + array);
        array.remove(1);
        System.out.println("The list after removing number 1: " + array);
        System.out.println("Getting the number at index 2: " + array.get(2));
        array.clear();
        System.out.println("Clearing the list!");
        System.out.println("Checking if the list is empty or not: " + array.isEmpty());
        
       

	}

}
