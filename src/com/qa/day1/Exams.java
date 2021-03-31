package com.qa.day1;

public class Exams {
	static int physics;
	static int chemistry;
	static int biology;
	static int total;
	static int percentage;

	public static void displayResults() {
		total = physics + chemistry + biology;
		
		String result = "PHYSICS: " + physics + "\n" // \n new line charachter
					+ "CHEMISTRY:" + chemistry + "\n" 
				+"BIOLOGY: " + biology + "\n"
				+ "TOTLA:" + total + "/450";
		System.out.println(result);
	}
	
	public static void displayTotalAsPercentage() {
		total = physics + chemistry + biology;
		
		System.out.println("PERCENTAGE: " + (total*100/450) + "%");
	}
}
