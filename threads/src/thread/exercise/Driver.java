package thread.exercise;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		int start, end, delay;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter start number");
		String input = keyboard.nextLine();
		start = Integer.parseInt(input);
		
		System.out.println("Enter end number");
		input = keyboard.nextLine();
		end = Integer.parseInt(input);
		
		System.out.println("Enter delay in seconds");
		input = keyboard.nextLine();
		delay = Integer.parseInt(input)*1000;
		
		Runnable runnable = new PrintNumbers(start, end, delay);
		
		Thread thread = new Thread(runnable);
		thread.start();
		
		System.out.println("Waiting for numbers to be printd");
		
	}

}
