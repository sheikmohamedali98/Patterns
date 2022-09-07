package NesteLoopsNestedIf;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interviewProcess();

	}
	
	private static void interviewProcess() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your name");
		String name = scan.next();
		System.out.println("Enter Your age");
		int age = scan.nextInt();
		
		if(age<24&&age>18) {
			
			System.out.println("Enter your Know Language program");
			String language = scan.next().toUpperCase();
			if(language.equals("JAVA")) {
				System.out.println("your Select for 2 nd round ");
				//language known percentage is above 80%
				System.out.println("Enter your language Know Percentage");
				int percentage = scan.nextInt();
				if(percentage>80&&percentage<100) {
					System.out.println("congratulation Your Select to 3 rd Round");
					//same name you give with first IgnoreCase
					System.out.println("Enter your name:");
					String name2 = scan.next();
					if(name2.equalsIgnoreCase(name)) {
						System.out.println("Your Selected to Zoho");
					}else {
						System.out.println("Thank you for your valuable Time");
					}
					
					
				}else {
					System.out.println("prepare more well ,congratulation!!!");
				}
				
				
			}else {
				System.out.println("Thank you for your effect ,Better try again!!!");
			
			}
			
			
		}else {
		   System.out.println("your are not eligible for Interview");
		}
		
		
	}

}
