package payroll_management;
/*
 * 비정규직 직원 클래스 
 * 비 정규직은 퇴사일을 입력받는다. 
 */
public class PartTime extends Employee {
	int EndOfDate;

	public int getEndOfDate() {
		return EndOfDate;
	}

	public void setEndOfDate(int endOfDate) {
		EndOfDate = endOfDate;
	}

	public PartTime(String name, String iD, String adress, String team, int salary, int endDate) {
		super(name, iD, adress, team, salary);
		this.EndOfDate = endDate;
	}

}
