package StackQueue;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		int size = 0;
		
		while(number != 3) {
			System.out.println("1. stack | 2. Queue | 3. break");
			number =scanner.nextInt();
			if(number < 3) {
				System.out.println("배열의 MAX값? ");
				size = scanner.nextInt();
			}
			Memory st = new Stack(size);
			Memory q = new Queue(size);
			switch(number) {
				case 1:
					System.out.println("[stack]");
					st.Input_number(size);
					break;
				case 2:System.out.println("[Queue]");
					q.Input_number(size);				
					break;
				case 3 :
					System.out.println("멈춤");break;
				default:
					System.out.println("다른 값 넣음");
					break;
			}	
		}
	}
}
