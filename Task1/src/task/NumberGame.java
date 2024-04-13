package task;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		boolean play=true;
		int score=0;
//		Scanner input=new Scanner(System.in);
		do {
			int rand=(int) ((Math.random() * (101 - 1)) + 1);
			System.out.println("Random number: "+rand);
			for(int i=0;i<3;i++) {
				System.out.println("Guess the Number(Attempt):"+(i+1)+", Range:(1-100)"+", Number of Attempts: 3");
				int n=input.nextInt();
				if(n==rand) {
					System.out.println("Guess is Correct");
					if(i==0) {
						score=100;
					} 
					else if(i==1) {
						score=50;
					}
					else if(i==2){
						score=25;
					}
					System.out.println("Your Score is "+score);
					break;
					
				}
				else {
					if(n>=rand+50)
						System.out.println("Guess is too High");
					else if(n<=rand-50) {
						System.out.println("Guess is too Low");
					}
				}
			}
			System.out.println("Want to play again(true or false)?");
			boolean decision=input.nextBoolean();
			if(decision) {
				play=true;
			}
			else {
				play=false;
			}
		}
		while(play);
		System.out.println("Thanks for Playing!");
	}

}
