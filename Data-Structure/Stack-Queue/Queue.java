package StackQueue;

import java.util.Scanner;

public class Queue extends Memory{
	private int front;
	
	public Queue(int size) {
		this.front = 0;
		last = 0;
		arr = new int[size];
	}
	
	
	@Override
	boolean isEmpty() {
		return front == last;
	}
	public int[] Push(int item, int index) {
		arr[last++] = item;
		return arr;
	}
	@Override
	int Pop() {
		int number = arr[front];
		for(int i = front+1; i<last;i++) {
			arr[i-1] = arr[i];
		}
		front = 0;
		last--;
		return number;
	}
	@Override
	public void Input_number(int size) {
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		
		while(number != 3) {
			System.out.println("1. push | 2. pop | 3. break");
			number = scanner.nextInt();
			switch(number) {
				case 1:
					System.out.printf("[Queue push] : %d개 넣으세요.\n",size);
					for(int i = 0 ; i< size; i++) {
						Push(scanner.nextInt(), last);
					}
					break;
				case 2:
					System.out.println("[Queue pop]");
					if(!isEmpty())
						System.out.printf("뺀거 : %d\n",Pop());
					else System.out.printf("뺄 것이 없습니다.\n");
					break;
				case 3:
					System.out.println("큐 나가기");
					break;
			}
		}
	}
}
