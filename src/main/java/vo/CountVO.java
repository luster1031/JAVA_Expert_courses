/*
 * 2022.01.04
 * [request 스코프]
 * [session 스코프]
 * [application 스코프]
 * vo: 값을 보관하는 객체
 * 
 * */
package vo;

public class CountVO {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number += number;
	}	
}
