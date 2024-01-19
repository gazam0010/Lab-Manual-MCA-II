package Week2;
import java.util.Scanner;
class Q1{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter two numbers: ");
       int num1 = sc.nextInt();
       int num2 = sc.nextInt();
        // SUM
       System.out.println("Sum is :" + (num1 + num2));
        // DIFFERENCE
       System.out.println("Difference is :" + (num1 - num2));
        // PRODUCT
       System.out.println("Product is :" + (num1 * num2));
        // QUOTIENT
       System.out.println("Quotient is :" + (num1 / num2));
        // REMAINDER
       System.out.println("Rmainder is :" + (num1 % num2));
        // MAXIMUM MINIMUM
       if(num1 > num2){
        System.out.println(" First number is greater, so MAXIMUM IS:"+ num1);
        System.out.println("Second number is smaller, so MINIMUM IS: "+ num2);
       }else{
        System.out.println(" Second number is greater, so MAXIMUM IS:"+ num2);
        System.out.println("first number is smaller, so MINIMUM IS: "+ num1);
       }

       sc.close();
    }
}