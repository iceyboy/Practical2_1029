package week31029;

public class Student {
	
	private String name;
	private int noOfExams;
	private double totalMark;
	
	public Student(String nameOfStudent, int exams, double total) {
		
		this.name = nameOfStudent;
		this.noOfExams = exams;
		this.totalMark = total;
		
	}
	
	public String getName() {
		
		return this.name;
		
	}
	
	public void addMark(int mark) {
		
		this.totalMark = totalMark + mark;
		this.noOfExams = noOfExams + 1;
		
	}
	
	public double getTotalMark() {
		
		return this.totalMark;
		
	}
	
	public double getAverageMark() {
		
		double average = totalMark / noOfExams;
		
		return average;
		
	}
	
	public void removeMark(int mark) {
		
		this.totalMark = totalMark - mark;
		this.noOfExams = noOfExams - 1;
		
	}
	
}
