

public class TestGradeCalculator {

	public static void main(String[] args) {
		
		GradeCalculator stu1 = new GradeCalculator();
		GradeCalculator stu2 = new GradeCalculator();
		GradeCalculator stu3 = new GradeCalculator();
		stu1.title();
		stu1.getStudentDetails();
		stu2.getStudentDetails();
		stu3.getStudentDetails();
		stu1.calculateGrades();
		stu2.calculateGrades();
		stu3.calculateGrades();
		
		System.out.printf("%n         Student Name      |   ID   | Practical grade|Exam grade|Total grade|Result%n");
		System.out.printf("-----------------------------------------------------------------------------------%n");
		stu1.printStudentGrade();
		stu2.printStudentGrade();
		stu3.printStudentGrade();

	}

}
