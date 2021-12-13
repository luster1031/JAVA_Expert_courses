package goorm;

import java.util.Scanner;

public class algorithm2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input X Number : ");
		int X = scanner.nextInt();
		System.out.println("Input Y Number : ");
		int Y = scanner.nextInt();
		int [] output = new int[Y-X];
		int count = 0;

		while(X <= Y) {
			if(check(X)) {
				output[count++] = X;	
			}
			X++;
		}
		
		for(int i = 0; i<count; i++) {
			System.out.printf("%d ",output[i]);
		}
		System.out.printf("\ncount : %d",count);
	}

	public static boolean check(int x) {
		String a = Integer.toString(x);
		for(int i= 1; i<a.length();i++) {
			if(a.charAt(i-1) >= a.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}
