import java.util.Scanner;


public class GradeCalculator {
	
	private String stuName; //Introducing instance variables for student1{
	private int stuID;
	private float lab;
	private float assignment;
	private float midterm;
	private float labFinal;
	private float finalExam;
	private float quiz;
	private float examGrade;
	private float practicalGrade;
	private float totalGrade;
	private String result; //}
	
//	private String stuName2; //Introducing instance variables for student2{
//	private int stuID2;
//	private float lab2;
//	private float assignment2;
//	private float midterm2;
//	private float labFinal2;
//	private float finalExam2;
//	private float quiz2;
//	private float examGrade2;
//	private float practicalGrade2;
//	private float totalGrade2;
//	private String result2; //}
//	
//	private String stuName3; //Introducing instance variables for student3{
//	private int stuID3;
//	private float lab3;
//	private float assignment3;
//	private float midterm3;
//	private float labFinal3;
//	private float finalExam3;
//	private float quiz3;
//	private float examGrade3;
//	private float practicalGrade3;
//	private float totalGrade3;
//	private String result3; //}
	
	Scanner input = new Scanner(System.in); // Introducing scanner so we can have input in our program
	
	public void  title() { // title method which will display a message 
		System.out.println( "The grade calculator of CST8110. Prepared by Sohrab Najafzadeh. ");
	}
	
	
	public void  getStudentDetails() { //getStudentDetails method will get the information of student, his name and student ID for student 1
		
	
		System.out.print("\nEnter student name: "); // For student 1
		stuName = input.nextLine(); // I tired .next but it wouldnt allow for space between first name and last name
		//stuName+= input.next(); // I tired this but it didnt work
		System.out.print("Enter student ID: ");
		stuID = input.nextInt();
		
		System.out.print("Enter lab marks between 0 and 15: ");
		lab = input.nextFloat();
		
		System.out.print("Enter assignment marks between 0 and 10: ");
		assignment = input.nextFloat();
		
		System.out.print("Enter midterm marks between 0 and 20: ");
		midterm = input.nextFloat();
		
		System.out.print("Enter lab final marks between 0 and 25: ");
		labFinal = input.nextFloat();
		
		System.out.print("Enter final exam marks between 0 and 25: ");
		finalExam = input.nextFloat();
		
		System.out.print("Enter quiz marks between 0 and 5: ");
		quiz = input.nextFloat();
	}
		
		
//		System.out.print("\nEnter student name: "); // For student 2
//		//int i=Integer.parseInt(input.nextLine());// I found that 
//		stuName2= input.nextLine();
//		//stuName2 = stuName2.replaceAll("\\s","");
//		stuName2+= input.nextLine();
//		System.out.print("Enter student ID: ");
//		stuID2 = input.nextInt();
//		
//		System.out.print("Enter lab marks between 0 and 15: ");
//		lab2 = input.nextFloat();
//		
//		System.out.print("Enter assignment marks between 0 and 10: ");
//		assignment2 = input.nextFloat();
//		
//		System.out.print("Enter midterm marks between 0 and 20: ");
//		midterm2 = input.nextFloat();
//		
//		System.out.print("Enter lab final marks between 0 and 25: ");
//		labFinal2 = input.nextFloat();
//		
//		System.out.print("Enter final exam marks between 0 and 25: ");
//		finalExam2 = input.nextFloat();
//		
//		System.out.print("Enter quiz marks between 0 and 5: ");
//		quiz2 = input.nextFloat();
//		
//		
//		
//		System.out.print("\nEnter student name: "); // For student 3
//		//int k=Integer.parseInt(stuName3);
//		stuName3= input.nextLine();// I tired using only one .nextLine but for some reason scanner was skipping .nextLine(); and  the only thing that worked in the end was this way
//		//stuName3 = stuName3.replaceAll("\\s","");
//		stuName3+= input.nextLine();// I tired many ways as u can see in // but in the end only thing that worked was this method
//		System.out.print("Enter student ID: ");
//		stuID3 = input.nextInt();
//		
//		System.out.print("Enter lab marks between 0 and 15: ");
//		lab3 = input.nextFloat();
//		
//		System.out.print("Enter assignment marks between 0 and 10: ");
//		assignment3 = input.nextFloat();
//		
//		System.out.print("Enter midterm marks between 0 and 20: ");
//		midterm3 = input.nextFloat();
//		
//		System.out.print("Enter lab final marks between 0 and 25: ");
//		labFinal3 = input.nextFloat();
//		
//		System.out.print("Enter final exam marks between 0 and 25: ");
//		finalExam3 = input.nextFloat();
//		
//		System.out.print("Enter quiz marks between 0 and 5: ");
//		quiz3 = input.nextFloat();
//	}
	
	public void  calculateGrades() { // This method will calculate practicalGrade , examGrade , totalGrade and makes sure that students can pass the .
		
		practicalGrade = (lab + assignment)*(100/25);
		examGrade = (labFinal + midterm + finalExam)*(100/70);//*100/70;   //*********** this does not work. why???
		//examGrade = examGrade*(100/70);
		totalGrade = (lab + assignment + labFinal + midterm + finalExam + quiz);
		if ( practicalGrade> 50 && examGrade> 50 && totalGrade> 50) {
			result = "PASS";
		}
		else {
			result = "FAIL";
		}
	}
	
//	public void  calculateGrades2() {
//		
//		practicalGrade2 = (lab2 + assignment2)*(100/25);
//		examGrade2 = (labFinal2 + midterm2 + finalExam2)*(100/70); //*********** this does not work. why???
//		//examGrade2 = examGrade2*(100/70);
//		totalGrade2 = (lab2 + assignment2 + labFinal2 + midterm2 + finalExam2 + quiz2);
//		if ( practicalGrade2> 12.5 && examGrade2> 35 && totalGrade2> 50) {
//			result2 = "PASS";
//		}
//		else {
//			result2 = "FAIL";
//		}
//	}
//	public void  calculateGrades3() {	
//		practicalGrade3 = (lab3 + assignment3)*(100/25);
//		examGrade3 = (labFinal3 + midterm3 + finalExam3)*(100/70); //*********** this does not work. why???
//		///examGrade3 = examGrade3*(100/70);
//		totalGrade3 = (lab3 + assignment3 + labFinal3 + midterm3 + finalExam3 + quiz3);
//		if ( practicalGrade3> 12.5 && examGrade3> 35 && totalGrade3> 50) {
//			result3 = "PASS";
//		}
//		else {
//			result3 = "FAIL";
//		}
//	}	
		
	public void printStudentGrade() {
		
		System.out.printf("%20s       | %6d |           %2.2f|     %2.2f|      %3.2f|%4S%n", stuName , stuID , practicalGrade , examGrade , totalGrade , result);
//		System.out.printf("%20s       | %6d |           %2.2f|     %2.2f|      %3.2f|%4S%n", stuName2 , stuID2 , practicalGrade2 , examGrade2 , totalGrade2 , result2);
//		System.out.printf("%20s       | %6d |           %2.2f|     %2.2f|      %3.2f|%4S%n", stuName3 , stuID3 , practicalGrade3 , examGrade3 , totalGrade3 , result3);
	}
	

	
	


}
