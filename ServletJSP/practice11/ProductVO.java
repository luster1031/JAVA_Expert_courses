package vo;

public class ProductVO {
	private int banana_count;
	private int hala_count;
	private int apple_count;
	public ProductVO(){
		this.apple_count = 0;
		this.hala_count = 0;
		this.banana_count = 0;
	}
	public int getBanana_count() {
		return banana_count;
	}
	public void setBanana_count(int banana_count) {
		this.banana_count += banana_count;
	}
	public int getHala_count() {
		return hala_count;
	}
	public void setHala_count(int hala_count) {
		this.hala_count += hala_count;
	}
	public int getApple_count() {
		return apple_count;
	}
	public void setApple_count(int apple_count) {
		this.apple_count += apple_count;
	}
	
}
