package week31029;

public class SquareTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Square square = new Square(4);
		
		System.out.println(square.getArea());
		
		square.grow();
		
		//Square square1 = new Square(square.grow());
		
		System.out.println(square.getArea());	

	}

}


