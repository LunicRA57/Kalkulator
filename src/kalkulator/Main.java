package kalkulator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); // skener koji cita sa standardnog ulaza
		String str;
		
		do {
			str = scanner.nextLine();
			String[] arr = str.split(" ");
			
			if(arr.length != 3) {
				System.out.println("Invalid input");
				continue;
			}
			
		} while(!str.equals("kraj"));
	}

}
