package task;
import java.sql.SQLException;
import java.util.Scanner;

public class Sms_Interface {

	public static void main(String[] args) throws SQLException {
		Sms s=new Sms();
		Student stud=new Student();
		Scanner input=new Scanner(System.in);
		while(true) {
			System.out.println("Add student(1)");
			System.out.println("Update student(2)");
			System.out.println("Remove student(3)");
			System.out.println("Search for a student(4)");
			System.out.println("Get the list of students(5)");
			System.out.println("Exit(0)");
			int choice=input.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the student name:");
				stud.name=input.next();
				System.out.println("Enter the student ID:");
				stud.id=input.next();
				System.out.println("Enter the student Roll No:");
				stud.roll_no=input.nextInt();
				System.out.println("Enter the Branch:");
				stud.branch=input.next();
				System.out.println("Enter the class room No:");
				stud.room=input.next();
				System.out.println("Enter the student grade:");
				stud.grade=input.next();
				System.out.println("Enter the student phone No:");
				stud.ph_no=input.next();
				if(validate(stud.id,stud.name,stud.roll_no,stud.branch,stud.room,stud.ph_no,stud.grade)) {
					s.addStudent(stud.id,stud.name,stud.roll_no,stud.branch,stud.room,stud.ph_no,stud.grade);
				}
				else
					break;
				break;
			case 2:
				System.out.println("Enter the student name:");
				stud.name=input.next();
				System.out.println("Enter the student ID:");
				stud.id=input.next();
				System.out.println("Enter the student Roll No:");
				stud.roll_no=input.nextInt();
				System.out.println("Enter the Branch:");
				stud.branch=input.next();
				System.out.println("Enter the class room No:");
				stud.room=input.next();
				System.out.println("Enter the student grade:");
				stud.grade=input.next();
				System.out.println("Enter the student phone No:");
				stud.ph_no=input.next();
				if(validate(stud.id,stud.name,stud.roll_no,stud.branch,stud.room,stud.ph_no,stud.grade)) {
					s.updateStudent(stud.id,stud.name,stud.roll_no,stud.branch,stud.room,stud.ph_no,stud.grade);
				}
				else
					break;
				break;
			case 3:
				System.out.println("Enter the student ID No:");
				stud.id=input.next();
				s.removeStudent(stud.id);
				break;
			case 4:
				System.out.println("Enter the student ID No::");
				stud.id=input.next();
				s.searchStudent(stud.id);
				break;
			case 5:
			    s.getStudents();
				break;
			case 0:
				System.out.println("Thanks for using our services");
				System.exit(0);
				break;
			}
		}
	}

	private static boolean validate(String id,String name,Integer roll_no,String branch,String room,String ph_no,String grade) {
		if(id=="" || name=="" || roll_no==null || branch=="" ||room==""|| ph_no==null|| grade=="") {
			return false;
		}
	    	return true;
	}


}
