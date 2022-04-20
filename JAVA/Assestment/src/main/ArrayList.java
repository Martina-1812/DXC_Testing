package main;

import java.util.List;

public class ArrayList {
	public static void main(String[] args) {
		//Creating list using the ArrayList
		List<Integer>number = new ArrayList<>();
		
		
	//Add element to the list	
	number.add(1);
	number.add(2);
	number.add(3);
	System.out.println("List:" + number);
	
	//Access element from the list
	int number = numbers.get(2);
	System.out.println("Accessed Element:" + number);
	
	
	//Remove element from the list
	int removedNumber = numbers.remove(1);
	System.out.println("Removed Element:" + removedNumber);
	
	}

}
