import java.util.Scanner;
public class GPA_Calc {
    public static void main(String[] args){
        //Creating Scanner object fro taking input from keybaord
        Scanner keyboard = new Scanner(System.in);
        //Taking input from the user
        //Inform the user to only give Doubles
        System.out.println("Enter your Gpa\nGive only doubles and no strings: ");

        //TASK2: Gracefully handle the datatype miss-match
        double grade = keyboard.nextDouble();

        //Creating conditions to check for various titles related to the grades
        //so grade between 3.85 and 4.00 is Summa Cum Laude
        if (grade<=4.00 && grade>=3.85){
            System.out.println("With your grade "+grade+"\nYou qualified to graduate with a Summa Cum Laude\nCONGRATULATIONS");
        }
        else if (grade<3.85 && grade>=3.70){
            System.out.println("Magna Cum laude");
        }
        else if(grade<3.70&& grade>=3.50){
            System.out.println("Cum Laude");
        }
        else if(grade<3.50&& grade>=3.0){
            System.out.println("Second Class Upper");
        }
        else if(grade<3.0&& grade>=2.75){
            System.out.println("Second Class Lower");
        }
        else if(grade<2.75&& grade>=2.50){
            System.out.println("Third Class");
        }
        else if(grade<2.50&& grade>=2.25){
            System.out.println("Pass");
        }
        else if (grade<2.25){
            System.out.println("Fail");
        }
    }
}
