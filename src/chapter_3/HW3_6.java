package chapter_3;
import java.util.*;

public class HW3_6 {

	private static Scanner input;
	private static Scanner year;
	private static Scanner month;
	private static Scanner day;

	public static void main(String[] args) {
		
//		3. A sequence of six tests, all scored out of 100, are to be given different
//		weightings in determining a final mark. Write a program fragment
//		that computes the appropriate weighted score for one test. The fragment
//		should first read values of testNumber and score. Using a
//		switch statement, it should then compute and print the appropriate
//		value of weightedScore using the weightings given in the following
//		table.
		
		
		int testNumber = (int)(Math.random()*(6-1+1));
		int weight;
		
		switch (testNumber){
			case 6: weight = 20;
					break;
			case 5: weight = 15;
					break;
			case 4: weight = 15;
					break;
			case 3: weight = 20;
					break;
			case 2: weight = 20;
					break;
			case 1: weight = 10;
					break;
			default: System.out.println ("Something is wrong");
					break;
		}
		
//		4. Write a program fragment that prints, as a word, the value of the last
//		digit of the int variable number. For example, if the value of number
//		is 547, the fragment should print
		
		input = new Scanner(System.in);
		System.out.println("Input an int : ");
		int x = input.nextInt();
		int i = x%10;
		
		switch (i){
			case 0: System.out.println("Zero");
			break;
			case 1: System.out.println("One");
			break;
			case 2: System.out.println("Two");
			break;
			case 3: System.out.println("Three");
			break;
			case 4: System.out.println("Four");
			break;
			case 5: System.out.println("Five");
			break;
			case 6: System.out.println("Six");
			break;
			case 7: System.out.println("Seven");
			break;
			case 8: System.out.println("Eight");
			break;
			case 9: System.out.println("Nine");
			break;
		}
		
//		5. Write a program that reads a date in numeric form as a year followed
//		by a month followed by a day and then prints the date as one might
//		on a cheque.
		
		year = new Scanner(System.in);
		System.out.println("Input an int for year XXXX : ");
		int y = year.nextInt();
		month = new Scanner(System.in);
		System.out.println("Input an int for month XX: ");
		int m = month.nextInt();
		day = new Scanner(System.in);
		System.out.println("Input an int for the day XX: ");
		int d = day.nextInt();
		
		
		switch (m){
		}
		
	}
}
