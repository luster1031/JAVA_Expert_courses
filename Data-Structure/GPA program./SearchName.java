package pratice_socre;

public class SerachName {
	private static ScoreProgram [] student;
	private static int number;
	public SerachName(ScoreProgram[] student, int number) {
		this.student = student;
		this.number = number;
	}
	public void Search(String name, String[] student_avg) {
		int k_score, m_score, e_socre;
		int name_i = 0;
		System.out.printf("[%s 학생 성적]", name);
		for(int i = 0; i<number; i++) {
			k_score =student[i].getKorean();
			m_score = student[i].getMath();
			e_socre = student[i].getEnglish();
			if(name.equals(student[i].getName())) {
				System.out.printf("\n국어 성적 : %d\n수학 성적 : %d\n영어 성적 %d\n평균 : %d\n",k_score,m_score,e_socre,k_score+m_score+e_socre/3);
			}
			if((k_score + m_score+e_socre) / 3 >=50) {
				student_avg[name_i++] = student[i].getName();
			}
		}
		System.out.print("\n[50점 이상인 학생]\n");
		for(int i = 0; i<name_i; i++) {
			System.out.printf(i+1 + ". " + student_avg[i] + "\n");
		}
	}
	
}
