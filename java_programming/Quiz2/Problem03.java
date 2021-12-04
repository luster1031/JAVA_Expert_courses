package Proctice02;

public class Problem03 {
	public static void main(String [] args) {
		char c[] = {'T', 'h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		for(char a :c) {
			if(a == ' ')
				System.out.print(',');
			else System.out.print(a);
		}
	}
}
