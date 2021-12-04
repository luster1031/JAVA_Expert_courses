package Quiz;

public class Problem04 {
	public static void main(String [] args) {
		for(int i = 1; i<11; i++) {
			for(int j =i; j<i+10;j++) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}
}
