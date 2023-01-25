package week31029;

public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student bob = new Student("bob", 1, 0);
		
		System.out.println(bob.getName());
		
		bob.addMark(50);
		
		System.out.println(bob.getTotalMark());
		
		System.out.println(bob.getAverageMark());
			
		bob.removeMark(50);
		
		System.out.println(bob.getTotalMark());
		
		System.out.println(bob.getAverageMark());
		
	}

}
