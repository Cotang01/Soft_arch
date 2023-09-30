package study.sem_3.extra.fourth_extra;

public class Square implements Shape {
	
	private int side;
	
	public void setSide(int value) {
		this.side = value;
	}

	@Override
	public int area() {
		return this.side * this.side;
	}
	
}