package StackQueue;

public abstract class Memory {
	int[] arr;
	int last;
	final int MAX_SIZE = 100;
	
	abstract int[] Push(int item, int index);
	
	abstract boolean isEmpty();
	abstract int Pop();
	abstract void Input_number(int size);
}
