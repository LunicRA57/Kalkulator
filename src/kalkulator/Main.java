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
				if (!str.equals("kraj"))
					System.out.println("Invalid input");
				continue;
			}
			
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[2]);
			
			if(arr[1].equals("+")) add(a, b);
			if(arr[1].equals("-")) sub(a, b);
			
		} while(!str.equals("kraj"));
		
		
	}
	
	public static void add(int x, int y) {
		System.out.println(x + y);
	}
	
	public static void sub(int x, int y) {
		System.out.println(x - y);
	}

}
