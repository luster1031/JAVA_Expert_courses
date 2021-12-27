package pratice_socre;

import java.util.Scanner;

public class InputStudent {
	private static ScoreProgram [] student;
	private static int number;
	public InputStudent(ScoreProgram[] student, int number) {
		this.student = student;
		this.number = number;
	}
	public void Insert() {
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i<number; i++) {
			System.out.println("이름, 국어, 영어, 수학 성적 입력");
			String name = scanner.next();
			int korea = scanner.nextInt();
			int english = scanner.nextInt();
			int math = scanner.nextInt();
			
			student[i] =  new ScoreProgram(name, korea, english, math);
		}
		
	}
}
