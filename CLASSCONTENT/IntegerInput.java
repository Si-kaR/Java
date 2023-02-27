import java.util.Scanner;

public class IntegerInput {
    private int minimumValue;
    private int maximumValue;
    private String prompt;
    int integer;

    Scanner keyboard = new Scanner(System.in);

    IntegerInput(int minimumValue, int maximumValue, String prompt) {
        this.minimumValue = minimumValue;
        this.maximumValue = maximumValue;
        this.prompt = prompt;
    }

    public void setInputParameters (int minimumValue, int maximumValue, String prompt) {
        this.minimumValue = minimumValue;
        this.maximumValue = maximumValue;
        this.prompt = prompt;
    }

    public int getValue() {
        System.out.print(prompt);
        integer = keyboard.nextInt();

        while (integer < minimumValue || integer > maximumValue) {
            System.out.println("Invalid input. Change your value: ");
            integer = keyboard.nextInt();
        }

        System.out.println("Your value is " + integer);
        return integer;
    }

}