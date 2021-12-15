package payroll_management;
/*
 * 관리자 클래스
 * 1. 삭제
 * 2. 검색
 * 3. 급여 수정
 * 세가지 모두 이름과 아이디(사원번호) 둘다 같을 경우 삭제, 검색, 급여 수정을 한다. 
 */

import java.util.ArrayList;

public class Manager {

	public boolean remove(ArrayList<Info> arr, String name, String id) {
		for(Info info: arr) {
			if(name.equals(info.getName()) && id.equals(info.getID())) {
				arr.remove(info);
				return true;
			}
		}
		return false;
	}
	public boolean serach(ArrayList<Info> arr, String name, String id) {
		for(Info info: arr) {
			if(name.equals(info.getName()) && id.equals(info.getID())) {
				System.out.println(info.toString());
				return true;
			}
		}
		return false;
	}
	public boolean tmpSal(ArrayList<Info> arr, String name, String id,int salary) {
		if(arr.size()==0)return false;
		for(Info info: arr) {
			if(name.equals(info.getName()) && id.equals(info.getID())) {
				info.setSalary(salary);
				return true;
			}
		}
		return false;
	}
}
