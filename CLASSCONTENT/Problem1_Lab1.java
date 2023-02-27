import java.util.Scanner; /*Importing the scanner from the Javalibrary so that i can ask for user input*/
class Problem1_Lab1{ 
  public static void main(String [] args){
    int even =0, odd=0, zero = 0;
    int acceptNumbers;
    Scanner inputs = new Scanner(System.in);/*Creating scanner object*/
    System.out.println("Enter a list of positive numbers, one per line.");
    System.out.println("Use a negative number to indicate the end of input");

    while((acceptNumbers = inputs.nextInt()) >= 0){
      if(acceptNumbers == 0){
        zero = zero + 1;
      }else if(acceptNumbers % 2 == 0 ){
        even = even + 1;
      }else{
        odd = odd+1;
      }
    }
    System.out.println("Thank you!");
    System.out.println("You entered " + even + " even numbers and " + odd + " odd numbers and " + zero + " numbers");
      
  }
}
