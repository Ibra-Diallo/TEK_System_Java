package controlFlowExercice;

import java.util.Scanner;

public class coreJava {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		Scanner Days = new Scanner(System.in);
	//Variable Declaration.
		int firstNum = 7, secondNum = 15, thirdNum =15;
		int day = 5;
	//Answer to the first Question	
		if(firstNum < 10) {
			System.out.println("Less than 10.");
			firstNum++;
		}
		
	//Answer to the second Question
		if(firstNum < 10) {
			System.out.println("Less than 10.");
		} else {
			System.out.println("Greater than 10.");
		}
		
	//Answer to the third Question.
		if(secondNum < 10) {
			System.out.println("Less than 10");
			}else if(secondNum >10 && secondNum < 20) {
			System.out.println("Beetwen 10 and 20.");
			} else {
			System.out.println("Greater than or equal to 20.");
			}
	//Answer to the fourth Question
		if(thirdNum < 10 || thirdNum > 20 ) {
			System.out.println("Out of range.");
		}else {
			System.out.println("In range.");
		}
		
	//Answer to the fifth Question
		System.out.println("Enter your Grade.");
		int grade = userInput.nextInt();
		if(grade <0 || grade > 100) {
			System.out.println("Score out of range.");
		}else if(grade >= 90 && grade <= 100) {
			System.out.println("Your grade is: A");
		}else if(grade >= 80 && grade <= 89) {
			System.out.println("Your grade is: B");
		}else if(grade >= 70 && grade <= 79) {
			System.out.println("Your grade is: C");
		}else if(grade >= 60 && grade <= 69) {
			System.out.println("Your grade is: D");
		}else {
			System.out.println("Your grade is: F");
		}
		
		userInput.close();
		
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
		Days.close();

	}

}
