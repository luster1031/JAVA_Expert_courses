package payroll_management;
/*
 * 정규직 클래스
 * 급여는 보너스를 추가한 값이다. 
 */
public class Regular extends Employee{
	int bonus;
	
	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public Regular(String name, String iD, String adress, String team, int salary, int bonus) {
		super(name, iD, adress, team, salary+bonus);
		this.bonus = bonus;
	}
	
}
