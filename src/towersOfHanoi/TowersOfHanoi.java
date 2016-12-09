package towersOfHanoi;

import java.util.Scanner;

public class TowersOfHanoi {
	
	
	static int numDisks;
	static int num1;
	static int num2;
	static int num3;
	private static Scanner scanner;
	static boolean H1 = false;
	static boolean H2 = false;
	static boolean H3 = false;
	public static int [] size;
	
	
	public static void main(String[] args) {
	
		size [1] = 1;
		size [2] = 100;
		size [3] = 100;
	
	scanner = new Scanner (System.in);
	System.out.println("Input the number of Disks : ");
	numDisks = scanner.nextInt();
	
	num1 = numDisks;
	
	if (num1 )
	}
	
	public void legalMove(){
		
		if (H1 == false && H2 == false){
			
			if (size[1] < size[2] && size[1] < size[3]){
				
			}else if (size[2] < size[1] && size[2] < size[3]){
				
			}
			
		}
		if (H2 == false && H3 == false){
			
			if (size[3] < size[1] && size[3] < size[2]){
				
			}else if (size[2] < size[1] && size[2] < size[3]){
				
			}
			
		}
		if (H1 == false && H3 == false){
			
			if (size[3] < size[1] && size[3] < size[2]){
				
			}else if (size[1] < size[2] && size[1] < size[3]){
				
			}
			
		}
	}
}
