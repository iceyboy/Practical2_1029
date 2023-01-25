package week31029;

public class Square {
	
	private int sideLength;
	private int area;
	
	//error is that it doesn't grow
	
	public Square(int sideLength) {
		
		this.sideLength = sideLength;
		
	}
	
	public int getArea() {
		
		area = sideLength * sideLength;
		
		return this.area;
		
	}
	
	public void grow() {
		
		this.sideLength = 2 * sideLength;
		
	}


}
