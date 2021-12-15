package payroll_management;
/*
 * 이름, 사원 번호, 주소, 부서, 급여 
 */
public class Info {
	public Info() {
		
	}
	// field
	private String name;
	private String ID;
	private String adress;
	private String team;
	private int salary;
	
	// getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Info(String name, String iD, String adress, String team, int salary) {
		super();
		this.name = name;
		ID = iD;
		this.adress = adress;
		this.team = team;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "[이름 : "+ name + "]\n사번=" + ID + ", 주소=" + adress + ", 부서=" + team + ", 급여=" + salary+"\n";
	}
	
	
	
	
}
