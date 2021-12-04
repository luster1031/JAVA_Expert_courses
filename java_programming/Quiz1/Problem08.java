package Quiz;
import java.util.*;
public class Problem08 {

	public static void main(String[] args) {
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		int money = 0;
		
		while(num != 4) {
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고| 4. 종료");
			System.out.print("선택 > ");
			num = scanner.nextInt();
		
			switch(num) {
			case 1:
				System.out.print("예금액>");
				money += scanner.nextInt();
				break;
			case 2:
				System.out.print("출금액>");
				money -= scanner.nextInt();
				break;
			case 3:
				System.out.println("잔고>"+ money);
				break;
			default : break;
			}			
		}	
		System.out.println("프로그램 종료");
	scanner.close();
	}
}
