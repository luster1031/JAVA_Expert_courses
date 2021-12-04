package Quiz;
import java.util.*;

public class Problem06 {
	public static void main(String[] args) {
		
	}
	private static void problem06_A() {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int output = 0;
		if(num %2 == 0)
			for(int i = 1; i<=num; i++)
				if(i %2 == 0)output += i;
				else continue;
		else
			for(int i = 1; i<=num;i++)
				if(i %2 != 0)output+= i;
				else continue;
		System.out.println("결과값 : " + output);
	}
}
