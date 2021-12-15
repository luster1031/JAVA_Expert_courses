package payroll_management;
/*
 * 직원 클래스
 */
public abstract class Employee extends Info {
	public Employee() {
		super();
	}

	public Employee(String name, String iD, String adress, String team, int salary) {
		super(name, iD, adress, team, salary);
	}

}
