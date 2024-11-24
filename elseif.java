package com.besant.packages.operators;

public class elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day = "Thursday";

		
		if (day == "Monday") {
		System.out.println("It is a Monday");
				
			}
		
		else if (day == "Tuesday") {
		System.out.println("It is a Tuesday");
				
			}
		else if (day == "Wednesday") {
		System.out.println("It is a Wednesday");
				
			}
		else if (day == "Thursday") {
		System.out.println("It is a Thursday");
				
			}
		else if (day == "Friday") {
		System.out.println("It is a Friday");
				
			}
		else if (day == "Saturday") {
			System.out.println("It is a Saturday");
					
				}
		else {
			System.out.println("Sunday");
					
				}
		

		
		
//nested if
		
		int age = 20;
		int height = 160;

		if (age == 18) {
			if(height >=160) {
				System.out.println("you are eligible");
			}
		}else {
			System.out.println("exit");
		}
		}
}



