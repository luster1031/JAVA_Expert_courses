package StackQueue;

import java.util.Scanner;

public class Stack extends Memory{

	public Stack(int size) {
		last = -1;
		arr = new int[size];
	}
	@Override
	public void Input_number(int size) {
		Scanner scanner = new Scanner(System.in);
		int number =0;
		while(number != 3) {
			System.out.println("1. push | 2. pop | 3. break");
			number = scanner.nextInt();
			switch(number) {
				case 1:
					System.out.printf("[stack push] : %d개 넣으세요.\n",size);
					for(int i = 0 ; i< size; i++) {
						Push(scanner.nextInt(), ++last);
					}
					break;
				case 2:
					System.out.println("[stack pop]");
					if(!isEmpty())
						System.out.printf("뺀거 : %d\n",Pop());
					else System.out.printf("뺄 것이 없습니다.\n");
					break;
				case 3:
					System.out.println("stack 나가기");
					break;
				default:System.out.println("다른 값 넣음");
					break;
			}
		}
	}
	@Override
	boolean isEmpty() {
		return last ==-1;
	}
	
	@Override
	int[] Push(int item, int index) {
		arr[index] = item;
		return arr;
	}

	@Override
	int Pop() {
		// TODO Auto-generated method stub
		return arr[last--];
	}

	
}
