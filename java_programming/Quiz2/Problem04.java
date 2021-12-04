package Proctice02;
import java.util.*;
public class Problem04 {
	public static void main(String[] args) {
		int num = 0;
		int number[] = new int[6];
		boolean check = true;
		for(int i = 0; i<6;) {
			num = (int)(Math.random()*100)+1;
			for(int j = 0;j<i;j++)
				if(number[j] == num) check = false;
			if(check) {
				number[i]= num;
				i++;
				System.out.print(num+ " ");
			}	
			check = true;
		}
		
	}
}
