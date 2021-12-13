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
	//	이진 탐색
	public int binary_search(int [] number,int target) {
		int mid =0;
		int end = number.length;
		int start = 0;
		
		while(start <= end) {
			mid = (end + start)/2;
			if(number[mid] > target) {
				end = mid-1;
			}else if(number[mid] < target) {
				start = mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Sort s = new Sort();
		System.out.println("origin array : "+ Arrays.toString(s.random_num));

		//	퀵 정렬
		int [] quick_sort_array = s.quick_sort(s.random_num, 0, s.random_num.length-1);
		System.out.println("quick sort =>   " + Arrays.toString(quick_sort_array));
		
		//	이진 탐색
		int index = s.binary_search(quick_sort_array, 60);
		if(index != -1) {
			System.out.printf("%d은 %d번째 방에 있습니다.", 60,index );
		}else {
			System.out.printf("%d는 현재 array에 없습니다.",60);
		}
		
	}
}
