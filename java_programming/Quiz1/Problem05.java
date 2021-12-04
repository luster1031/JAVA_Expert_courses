package Quiz;
import java.util.*;
public class Problem05 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int num;
		int max_num = 0;
		for(int i = 0; i<5; i++) {
			System.out.print("숫자 : ");
			num = scanner.nextInt();
			max_num = Math.max(num, max_num);
		}
		System.out.println("최대값은 " + max_num+"입니다.");
	}
}
