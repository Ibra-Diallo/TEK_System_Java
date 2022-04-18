package Loops;

public class Looping {

	public static void main(String[] args) {
		
		
		
		
		//Answer to the first Question
		for(int num = 1; num <= 10; num++) {
			System.out.println("number "+ num);
		}
		
		System.out.println("------------");
		
		//Answer to the second Question
		int count = 0;
		while(count <= 100) {
			System.out.println("count incremented by 10= "+count);
			count += 10;
		}
		
		System.out.println("------------");
		
		//Answer to fourth third Question
		
		for(int i = 1; i <= 100; i++) {
			if(i >=25 && i<=75){
				System.out.println("Out of range.");
				continue;
			}
			
			if(i % 5 ==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("------------");
		
		//Answer to the fifth Question
		for(int i = 1; i <= 100; i++) {
			if(i >50){
				System.out.println("Out of range.");
				continue;
			}
			
			if(i % 5 ==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("------------");
		
		// Answer to the sixth Question
		for(int p = 1; p <= 2; p++) {
			System.out.println("Week "+ p);
			for(int j = 1; j <= 5; j++) {
				System.out.println("Day "+ j);
			}
		}
		
		System.out.println("------------");
		
		//Answer to the eighth Question
		for(int m = 0; m <= 50; m++) {
			
		}

	}

}
