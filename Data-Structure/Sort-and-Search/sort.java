package sort;

import java.util.Arrays;
import java.util.Random;

public class Sort {
	private int [] random_num;
	public Sort() {
		random_num = new int[101];
		random_num = random_array(random_num);
	}
	public int[] random_array(int [] random) {
		int number =0;
		Random r = new Random();
		for(int i= 0; i<random_num.length;i++) {
			random[i] = (int)(r.nextInt(100)+1);
		}
		return random;
	}
	//버블 정렬
	public void bubble_sort(int [] number) {
		for(int i = number.length-1; i>=0; i--) {
			for(int  exchange= 0,tmp =0; exchange<i;exchange++) {
				if(number[exchange] > number[exchange+1]) {
					swap(number, exchange, exchange+1);
				}
			}
		}
		System.out.println("bubble sort =>  " + Arrays.toString(number));
	}
	//삽입 정렬
	public void insert_sort(int [] number) {
		for(int i = 1; i<number.length; i++) {
			for(int index = i-1, back_index = i; index >=0 && number[index] > number[back_index]; index--,back_index--) {
				swap(number, index, back_index);
			}
		}
		System.out.println("inset sort =>   " + Arrays.toString(number));
	}
	//퀵 정렬
	public int [] quick_sort(int [] number,int start, int end) {
		int part2 = partition(number, start,end);
	
		if(start < part2 -1) {
			quick_sort(number, start, part2-1);
		}
		if(part2 < end) {
			quick_sort(number, part2, end);
		}
		return number;
	}
	public int partition(int [] number, int start, int end) {
		int pivot = number[(start+end)/2];	//중간 값
		while(start <= end) {
			while(number[start]<pivot)start++;
			while(number[end] > pivot) end--;
			if(start <= end) {
				swap(number, start, end);
				start ++;
				end--;
			}
		}
		return start;
	}
	public void swap(int [] number, int first, int second) {
		int tmp = number[first];
		number[first] = number[second];
		number[second] = tmp;
	}
	
	public static void main(String[] args) {
		Sort s = new Sort();
		System.out.println("origin array : "+ Arrays.toString(s.random_num));
		//	버블 정렬
		s.bubble_sort(s.random_num);
		
		//	삽입 정렬
		s.insert_sort(s.random_num);
		
		//	퀵 정렬
		int [] quick_sort_array = s.quick_sort(s.random_num, 0, s.random_num.length-1);
		System.out.println("quick sort =>   " + Arrays.toString(quick_sort_array));
		
		}
		
	}
}
