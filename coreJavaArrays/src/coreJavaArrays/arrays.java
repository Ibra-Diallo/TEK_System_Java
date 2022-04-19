package coreJavaArrays;

import java.util.Arrays;

public class arrays {

	public static void main(String[] args) {
		
		//Answer to the first Question
		
		int[] numArray = new int[3];
		
		numArray[0] = 1;
		numArray[1]= 2;
		numArray[2] = 3;
		
		for(int i = 0; i <3; i++) {
			System.out.println("number at index "+ i+" is: "+ numArray[i]);
		}
		
		System.out.println("-------------------");
		
		//Answer to the second Question
		int[] arrayElement = {13, 5, 7, 68, 2};
		
		int midElement = (arrayElement.length) / 2;
		
		System.out.println("the middle index is: " + midElement);
		System.out.println("The element at the middle index is: " + arrayElement[midElement]);
		
		System.out.println("-------------------");
		
		//Answer to Question the third Question
		
		String[] arrayColour = {"red", "green", "blue", "yellow"};
		System.out.println("The length of the array is : "+ arrayColour.length);
		
		String[] arrayCopy = arrayColour.clone();
		System.out.println(Arrays.toString(arrayCopy));
		
		System.out.println("-------------------");
		
		//Answer to the fourth question
		
		int[] arrayNum = {1, 2, 3, 4, 5};
		
		System.out.println("the value at the first index is: "+ arrayNum[0]);
		System.out.println("The value at the last index is: "+ arrayNum[arrayNum.length -1]);
		
		System.out.println("-------------------");
		
		//Answer to the fifth question
		
		int[] arrayLoop = new int[5];
		
		for(int i = 0; i < arrayLoop.length; i++) {
			arrayLoop[i] = i * 2;
			System.out.println("Value at index "+i+" = "+ arrayLoop[i]);
		}
		
		System.out.println("-------------------");
		
		//Answer to the sixth question
		
		int[] arrayLoop2 = new int[5];
		int midIndex = (arrayLoop2.length / 2);
		System.out.println("The middle index is: "+midIndex);
		
		for(int i = 0; i < arrayLoop2.length; i++) {
			arrayLoop2[i] = i + 5;
			
			if(i == midIndex) {
				continue;
			}
			System.out.println("Value at index "+i+" is: "+ arrayLoop2[i]);
		}
		
		System.out.println("-------------------");
		
		// Answer to the seventh question
		
		String[] arrayElements2 = {"Naruto", "Sasuke", "Shikamaru","Luffy","Zoro"};
		String temp;
		int midInd = (arrayElements2.length / 2);
		System.out.println("The initial array is:\n");
		for(int i =0; i<arrayElements2.length; i++) {
			System.out.println("String at index "+i+" is "+ arrayElements2[i]);
		}	
		System.out.println("-------------------");
		temp = arrayElements2[0];
		arrayElements2[0] = arrayElements2[midInd];
		arrayElements2[midInd] = temp;
		System.out.println("The swapped array is\n");
		for(int i = 0; i < arrayElements2.length; i++) {
			System.out.println("String at index "+i+" is "+ arrayElements2[i]);
		}
		
		System.out.println("-------------------");
		
		//Answer to the eighth question 
		
		int[] ascSort = {4, 2, 9, 13, 1, 0};
		
		java.util.Arrays.sort(ascSort);
		for(int i =0; i<6; i++) {
			System.out.print(ascSort[i]+" ");
		}
		System.out.print("\n");
		System.out.println("The smallest number is "+ ascSort[0]);
		System.out.println("The largest number is "+ ascSort[ascSort.length-1]);
		
	}

}
