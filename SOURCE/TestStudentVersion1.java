import java.util.Scanner;

/**
 * This is a program to test and demonstrate the StudentVersion1 class
 * 
 * @author G. Ayorkor Korsah
 */
public class TestStudentVersion1
{
  public static void main(String[] args)
  {
    StudentVersion1 groupMember1, groupMember2;
    
    System.out.println("I'd like to form a project group with 2 students.");
    groupMember1 = new StudentVersion1();
    groupMember2 = new StudentVersion1();
    
    System.out.println("");
    System.out.println("Please fill in the information for the 1st student: ");
    groupMember1.readInformation();
    
    System.out.println("");
    System.out.println("Please specify the 2nd student's information: ");
    groupMember2.readInformation();
        
    System.out.println("");
    System.out.println("Thank you.  To summarize, here are the group members:");
    System.out.println("Group member 1: ");
    groupMember1.displayInformation();
    System.out.println("Group member 2: ");
    groupMember2.displayInformation();
    
    System.out.println();
    System.out.println("I will now display their information in a different format:");
    System.out.println("Full name" + "\t\t" + "Year" + "\t" + "Age" + "\t" + "Major");
    
    System.out.print(groupMember1.getFullName() + "\t");
    System.out.print(groupMember1.getClassYear() + "\t");
    System.out.print(groupMember1.getAge() + "\t");
    System.out.println(groupMember1.getMajor());
    
    System.out.print(groupMember2.getFullName() + "\t");
    System.out.print(groupMember2.getClassYear() + "\t");
    System.out.print(groupMember1.getAge() + "\t");
    System.out.println(groupMember2.getMajor());

    System.out.println("");
    if (groupMember1.getClassYear() == groupMember2.getClassYear())
      System.out.println("The students are in the same class year.");
    else
      System.out.println("The students are not in the same class year.");
    
    if (groupMember1.getMajor().equalsIgnoreCase(groupMember2.getMajor()))
      System.out.println("The students have the same major.");
    else
      System.out.println("The students do not have the same major.");
  }
}