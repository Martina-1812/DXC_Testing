package com.dxc.ex;

import java.util.ArrayList;

public class array {
	public void main(String args[]) {
		ArrayList<String>language=new ArrayList<>();
		
		//add elements in the array list
		language.add("Java");
		language.add("kotlin");
		language.add("C++");
		System.out.println("ArrayList:" + language);
		
		
		//change the element of array list
				language.set(2, "JavaScript");
				System.out.println("Modified ArrayList:" + language);
				}
	}
		
	

