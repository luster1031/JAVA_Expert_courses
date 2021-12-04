
package Quiz;
import java.util.*;
public class Problem07 {
	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);
		String agin = "n";
		int random_num;
		int input_num;
		while(!agin.equals("y")) {
			System.out.println("시작");
			random_num = (int)(Math.random()*100)+1;
			input_num = 0;
			while(input_num != random_num){
				input_num= scanner.nextInt();
				if(input_num < random_num)System.out.println("더 높게");
				else if(input_num > random_num)System.out.println("더 낮게");
				else break;
			}
			System.out.println("맞았습니다.");
			System.out.println("게임을 종료하시겠습니까?(y/n)");
			agin = scanner.next();
		}
	}
}
