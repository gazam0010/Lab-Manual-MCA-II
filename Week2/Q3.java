//import java.util.*;
package Week2;
public class Q3 {
    public static void main(String[] args) {
        // Example 1: Basic arithmetic operations
        double num1 = 10.5;
        double num2 = 5.2;
        System.out.println("num1 + num2 = " + Math.addExact((int) num1, (int) num2));
        System.out.println("num1 - num2 = " + Math.subtractExact((int) num1, (int) num2));
        System.out.println("num1 * num2 = " + Math.multiplyExact((int) num1, (int) num2));
        System.out.println("num1 / num2 = " + Math.floorDiv((int) num1, (int) num2));

        // Example 2: Exponential and logarithmic functions
        System.out.println("e^num1 = " + Math.exp(num1));
        System.out.println("log(num1) = " + Math.log(num1));

        // Example 3: Trigonometric functions (in radians)
        double angleInRadians = Math.toRadians(45); // Convert degrees to radians
        System.out.println("sin(45 degrees) = " + Math.sin(angleInRadians));
        System.out.println("cos(45 degrees) = " + Math.cos(angleInRadians));
        System.out.println("tan(45 degrees) = " + Math.tan(angleInRadians));

        // Example 4: Rounding and absolute value
        double num3 = -7.8;
        System.out.println("Round num3 to the nearest integer = " + Math.round(num3));
        System.out.println("Absolute value of num3 = " + Math.abs(num3));

        // Example 5: Maximum and minimum
        int x = 15;
        int y = 20;
        System.out.println("Maximum of x and y = " + Math.max(x, y));
        System.out.println("Minimum of x and y = " + Math.min(x, y));
    }
}