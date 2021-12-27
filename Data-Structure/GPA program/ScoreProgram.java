package pratice_socre;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 성적 처리 프로그램
 * 1. 입력 ( 이름 , 국 , 영, 수 )
 * 2. 검색 (	이름 검색, 평균 검색 (50점 이상))
 * 3. 출력 ( 	전체 출력)
 */
public class ScoreProgram {
	private String name;
	private int korean;
	private int english;
	private int math;
	public ScoreProgram(String name, int k, int e, int m) {
		this.name = name;
		this.english = e;
		this.korean =k;
		this.math = m;
	}
	
	public String getName() {
		return name;
	}

	public int getKorean() {
		return korean;
	}

	public int getEnglish() {
		return english;
	}

	public int getMath() {
		return math;
	}

	public static void main(String[] args) {
		System.out.println("*****성적 처리 프로그램 *******");
		Scanner scanner = new Scanner(System.in);
		int choose_number = 0;
		int number = 0;
		ScoreProgram [] student = null;
		String []student_avg = null;	//평균
		while(choose_number != 4) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. 입력 | 2. 이름 & 평균 검색 | 3. 전체 출력 | 4. 종료");
			System.out.println("-------------------------------------------------");
			choose_number = scanner.nextInt();
				
			switch(choose_number) {
			case 1:
				System.out.println("입력할 학생의 인원 수를 입력세요");
				try {
					number = scanner.nextInt();
					student = new ScoreProgram[number];
					InputStudent input = new InputStudent(student,number);
					student_avg = new String[number];
					input.Insert();
				}catch(InputMismatchException e){
					System.out.println("인원 수를 입력해야합니다. 종료");
				}catch(Exception e) {}
				
				break;
			case 2:
				System.out.println("알고 싶은 학생의 이름을 입력하세요");
				if(number != 0) {
					String name = scanner.next();
					SerachName serach_name = new SerachName(student,number);
					serach_name.Search(name,student_avg);
				}else System.out.println("입력되어있는 학생이 없습니다. 입력부터 해주세요.");
				break;
			case 3 :
				System.out.println("\n[전체 출력]");
				if(number != 0) {
					for(int i = 0; i<number; i++) {
						System.out.printf("%d. 이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n\n",i+1, student[i].getName(),student[i].getKorean(),student[i].getEnglish(), student[i].getMath());
					}
				}else System.out.println("입력되어있는 학생이 없습니다. 입력부터 해주세요.");
				break;
			case 4:break;
			default:
				break;
			}
		}
		
		scanner.close();
	}
}
