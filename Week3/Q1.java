package Week3;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // To read input from keyboard
        System.out.print("Enter the number : ");
        int num = in.nextInt(); // number given by the user

        if (num % 2==0) {
            System.out.println("Entered number is EVEN.");
        }else{
            System.out.println("Entered number is ODD.");
        }
    }
}
