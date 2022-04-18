package main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int num, otherNum, age; // variable decleration
		num = 10;			// assigning value to num.
		otherNum = 7;		//assigning value to otherNum.
		age = 12;
		
		Scanner userInput = new Scanner(System.in);//Calling for a user input.
		
		boolean isEven = num % 2 ==0; //setting a boolean condition.
		
		// if statements
	/*	if(otherNum < num) {
			System.out.println( num+ " is bigger than " + otherNum);
		}
	
		// if & else statements.
		if(isEven) {
			System.out.println("True");
		}
		
		if(age < 18) {
			System.out.println("Sorry you're not old enough to buy this game");
		}
		else {
			System.out.println("You can buy this game");
		}
		*/
		/*System.out.println("Hi, What's your name?");
		String firstName = userInput.nextLine();
		
		System.out.println("What's your age?");
		int userAge = userInput.nextInt();
		
		if(userAge > 17) {
			System.out.println(firstName +" you may pass");
		}else {
			System.out.println("Sorry, "+firstName+" you're not old enough.");
		}
		
		userInput.close(); */
		
		// Switch statements
		
	/*	int day = 5;
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		  default:
			  System.out.println("Looking forward to the wekend.");
		}
		*/
		//While loop
		/*int i = 0;
		while (i < 5) {
		  System.out.println(i);
		  i++;
		}*/
		
		// Do while loop
		/*int i = 0;
		do {
		  System.out.println(i);
		  i++;
		}
		while (i < 5); */
		
		//For Loop
		for (int i = 0; i < 5; i++) {
			  System.out.println(i);
			}
		

}
}