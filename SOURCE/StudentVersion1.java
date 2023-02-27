import java.util.Scanner;

/**
 * This class is a second attempt at representing a student.
 * It represents the student's name, age, class year and major.  
 * The only supported functionality is setting and retrieving the 
 * student's information.
 * 
 * @author G. Ayorkor Korsah
 */
public class StudentVersion1
{
  private String firstName;
  private String lastName;
  private int age;
  private int classYear;
  private String major;
  
  // read in the student's information
  public void readInformation() {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Please enter the student's first name: ");
    firstName = input.next();
    System.out.print("Please enter the student's last name: ");
    lastName = input.next();
    System.out.print("Please enter the student's age: ");
    age = input.nextInt();
    System.out.print("Please enter the student's class year (e.g. 2014): ");
    classYear = input.nextInt();
    System.out.print("Please enter the student's major: ");
    major = input.next();
  }
  
  // display the student's information
  public void displayInformation()
  {
    String fullName = firstName + " " + lastName;
    System.out.println("Name: " + fullName);
    System.out.println("Age: " + age);
    System.out.println("Year: " + classYear);
    System.out.println("Major: " + major);
  }
  
  // An accessor method to return the student's first name
  public String getFirstName() {
    return firstName;
  }

  // A mutator method to set the student's first name
  public void setFirstName(String newFirstName) {
    firstName = newFirstName;
  }

  // An accessor method to return the student's last name
  public String getLastName() {
    return lastName;
  }

  // A mutator method to set the student's last name
  public void setLastName(String newLastName) {
    lastName = newLastName;
  }

  // An accessor method to return the student's age
  public int getAge() {
    return age;
  }

  // A mutator method to set the student's age
  public void setAge(int newAge) {
    age = newAge;
  }
  
  // A method to return the full name of a student
  public String getFullName()
  {
    String fullName = firstName + " " + lastName;
    
    return fullName;
  }
  
  // An accessor method to return the class year
  public int getClassYear()
  {
    return classYear;
  }
  
  // A mutator method to set the class year
  public void setClassYear(int newClassYear) {
    classYear = newClassYear;
  }
  
  // An accessor method to return the student's major
  public String getMajor()
  {
    return major;
  }
  
  // A mutator method to return the student's major
  public void setMajor(String newMajor) {
    major = newMajor;
  }
}