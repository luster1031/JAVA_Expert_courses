package Quiz;

public class Problem03 {
	public static void main(String[] srgs) {
		for(int i = 1; i<10; i++) {
			for(int j = 2; j<10; j++) {
				System.out.printf(j + "*"+i +"=" +j*i +"\t");
			}
			System.out.println();
		}
	}
}
