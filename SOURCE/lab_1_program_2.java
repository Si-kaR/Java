import java.util.Scanner;
public class lab_1_program_2 {
    public static void main(String[] args) {
        double total_points = 0,total_credits = 0;
        double gpapercource, gpa;
        Scanner myObj = new Scanner(System.in); 
        System.out.println("How many classes did you take last semester?");
        int numberOfCourses = myObj.nextInt();

        for(int i = 1; i < numberOfCourses+1; i++){
            System.out.println("How many credits was course # " + i + "?");
            double semester_credit = myObj.nextDouble();

            Scanner gradeinput = new Scanner(System.in);
            System.out.println("What was your letter grade?");
            String grade = gradeinput.nextLine();

            if(grade.equals("A")){
                gpapercource = 4.0;
            } else if (grade.equals("B+")) {
                gpapercource = 3.5;

            } else if (grade.equals("B")) {
                gpapercource = 3.0;

            } else if (grade.equals("C+")) {
                gpapercource = 2.5;
            } else if (grade.equals("C")) {
                gpapercource = 2.0;
            } else if (grade.equals("D+")) {
                gpapercource = 1.5;
            } else if (grade.equals("D")) {
                gpapercource = 1.0;
            }else {
                gpapercource = 0;
            }
            total_credits = total_credits + semester_credit;
            total_points = total_points + (gpapercource * semester_credit);
        }

        gpa = total_points / total_credits;
        System.out.println("You took " + total_credits + " credits.");
        System.out.println("Your semester GPA was " + gpa);
    }
}