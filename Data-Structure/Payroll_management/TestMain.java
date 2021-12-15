package payroll_management;
/*
 * 1. 직원
 * 	 1) 정규직
 * 		- 보너스 입력
 *   2) 비정규직
 *   	- 퇴사일 입력
 * 2. 매니저
 *   1) 검색
 *   2) 수정
 *   3) 삭제
 *   4) 전체출력
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	static ArrayList<Info> arr = new ArrayList<>();

	public static void main(String[] args) {
		String name = "";
		String iD = "";
		String address = "";
		String team = "";
		int salary = 0;
		int bonus = 0;
		int end_Date = 0;
		String tmpName = "";// 바꿀 이름
		String tmpID = ""; // 바꿀 아이디

		Scanner scan = new Scanner(System.in);
		Manager manager = new Manager();
		while (true) {
			System.out.println("[급여 관리 프로그램]");
			System.out.println("1.직원\t2.매니저\t3.종료");
			int state = scan.nextInt();
			// 1. 직원 입력
			if (state == 1) {

				System.out.println("\n[직원]	1.정규직	2.비정규직	  3.종료");
				int tmpInt = scan.nextInt();
				System.out.print("이름 : ");
				name = scan.next();
				System.out.print("사번 : ");
				iD = scan.next();
				System.out.print("주소 : ");
				address = scan.next();
				System.out.print("부서 : ");
				team = scan.next();
				System.out.print("급여 : ");
				salary = scan.nextInt();

				if (tmpInt == 1) {
					System.out.print("보너스 입력: ");
					bonus = scan.nextInt();
					Regular r = new Regular(name, iD, address, team, salary + bonus, bonus);
					arr.add(r);
				} else if (tmpInt == 2) {
					System.out.print("퇴사일 입력: ");
					end_Date = scan.nextInt();
					PartTime p = new PartTime(name, iD, address, team, salary, end_Date);
					arr.add(p);
				} else {
					continue;
				}

				// 2. 매니저
			} else if (state == 2) {
				while (true) {
					//	직원이 있을 경우에만
					if (arr.size() != 0) {
						System.out.println("\n[매니저]\n1.검색	2.수정	3.삭제	4.전체출력		5.종료");
						int mangeStaet = scan.nextInt();
						if (mangeStaet == 1) {
							System.out.println("[검색]\n이름, 사번 입력:");
							tmpName = scan.next();
							tmpID = scan.next();
							if (!manager.serach(arr, tmpName, tmpID)) {
								System.out.printf("이름 : %s, 사번 : %s라는 사람이 없습니다.", tmpName, tmpID);
							}

						} else if (mangeStaet == 2) {
							System.out.println("[수정]\n수정할 사람의 이름, 사번 입력:");
							tmpName = scan.next();
							tmpID = scan.next();
							System.out.print("바꿀 월급 입력: ");
							int tmpSal = scan.nextInt();
							if (!manager.tmpSal(arr, tmpName, tmpID, tmpSal)) {
								System.out.printf("이름 : %s, 사번 : %s라는 사람이 없습니다.", tmpName, tmpID);
							}

						} else if (mangeStaet == 3) {
							System.out.println("\n[삭제]\n이름, 사번 입력:");
							tmpName = scan.next();
							tmpID = scan.next();
							if (!manager.remove(arr, tmpName, tmpID)) {
								System.out.printf("이름 : %s, 사번 : %s라는 사람이 없습니다.", tmpName, tmpID);
							}

						} else if (mangeStaet == 4) {
							System.out.println("\n[전체 출력]");
							for (Info info : arr) {
								System.out.println(info.toString());
							}
						} else {
							System.out.println("종료");
							break;
						}
					}
					else {	//	array list size가 0인 경우
						System.out.println("저장된 직원 정보가 없습니다. 먼저 입력하세요\n");
						break;
					}
				}
				// 3. 종료
			} else {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
