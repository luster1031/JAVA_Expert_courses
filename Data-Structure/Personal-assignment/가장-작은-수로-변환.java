package goorm;

import java.util.Arrays;
import java.util.Scanner;

public class algorithm {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split("");

		Arrays.sort(input);
		for(int i = 0; i<input.length; i++) {
			if(!input[i].equals("0")) {
				String tmp = "";
				tmp = input[0];
				input[0] = input[i];
				input[i] = tmp;
				break;
			}
		}
		for (int i = 0; i < input.length; i++)
			System.out.print(input[i]);
	}
}
​
