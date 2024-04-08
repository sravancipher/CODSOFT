package task;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class GradeCalculator {

	public static void main(String[] args) {
		float points,sum=0,average=0;
		String grade;
		Scanner input=new Scanner(System.in);
		DecimalFormat round=new DecimalFormat("0.00");
		System.out.println("Enter the student name:");
		String name=input.nextLine();
		System.out.println("Enter the number of subjects:");
		int n=input.nextInt();
		ArrayList<Float> marks=new ArrayList<Float>();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the marks of subject "+i);
			points=input.nextFloat();
			if(points<=100 && points>=0) {
				marks.add(points);
			}
		}
		for(int i=0;i<marks.size();i++) {
			sum+=marks.get(i);
		}
		average=sum/n;
		if(average>=90) {
			grade="Ex";
		}
		else if(average>=80 && average<90) {
			grade="A";
		}
		else if(average>=70 && average<80) {
			grade="B";
		}
		else if(average>=60 && average<70) {
			grade="C";
		}
		else if(average>=50 && average<60) {
			grade="D";
		}
		else {
			grade="F";
		}
		System.out.println("Student Name: "+name);
		System.out.println("Total Marks: "+sum);
		System.out.println("Average Percentage: "+round.format(average));
		System.out.println("Grade: "+grade);
	}

}
