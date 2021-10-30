package kalkulator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); // skener koji cita sa standardnog ulaza
		String str;
		
		do {
			str = scanner.nextLine();
			
		} while(!str.equals("kraj"));
	}

}
