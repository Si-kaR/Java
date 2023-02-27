/*Variable widening is a skill where a smaller data type is converted to a larger data type.

* This can be done by including the two variables in one expression
*
* Below is an / or multiple display of variable widening
* */

public class typeCasting{
    public static void main(String[] args){
        //Implicit typeCasting;--------------- Variable Widening
        /*Variable widening is a skill where a smaller data type is converted to a larger data type.
         * This can be done by including the two variables in one expression
         * Below is an / or multiple display of variable widening
         * */
        int a = 45;
        double b = a;
        System.out.println("\nThe variable I am about to widen is: "+a);
        System.out.println("Widening the variable "+a+" gave the value "+b);
        System.out.println("\nPay attention...\nDo you realise the value is no longer an int "+a +" but rather a double "+b +"?");
        System.out.println(String.format("\nPay attention...\nDo you realise the value is no longer an int %d but rather a double %f?" ,a , b));
    }

    public static void next(String[] args){
        //Explicit typeCasting;-----------------Typecasting (Narrowing)

    }

}