package goorm;

import java.util.Arrays;
import java.util.Scanner;

public class algorithm3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 1;

		while (number == 1) {
			System.out.print("Input 6 Number : ");

			String input_number = scanner.nextLine();
			char[] input = input_number.toCharArray();
			Arrays.sort(input);

			if (continuous(0, input) || routine(0, input)) { // baby-gin 조건
				if (continuous(3, input))
					System.out.println("baby-gin !!!");
				else if (routine(3, input))
					System.out.println("baby-gin !!!");
			} else
				System.out.println("Lose");

			System.out.print("Play the game agin? <1-yes/2-no>: ");
			number = scanner.nextInt();
			scanner.nextLine(); // nextint 버퍼 비우기
		}
	}

	// 연속되는지 확인
	public static boolean continuous(int index, char[] input) {
		for (int i = index + 1; i < 6; i++) {
			if (input[i - 1] >= input[i]) {
				return false;
			}
		}
		return true;
	}

	// 반복수 확인
	public static boolean routine(int index, char[] input) {
		int first_number = input[index];
		for (int i = index; i < index + 3; i++) {
			if (input[i] != first_number) {
				return false;
			}
		}
		return true;
	}
}
