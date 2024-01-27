// package Week4;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three digits one by one: ");
        int d1 = in.nextInt();
        int d2 = in.nextInt();
        int d3 = in.nextInt();
        
        int num1 = 100*d1 + 10*d2 + d3;
        int num2 = 100*d1 + 10*d3 + d2;
        int num3 = 100*d2 + 10*d1 + d3;
        int num4 = 100*d2 + 10*d3 + d2;
        int num5 = 100*d3 + 10*d2 + d1;
        int num6 = 100*d3 + 10*d1 + d2;

        System.out.print("Numbers are: ");
        System.out.print(num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + ", " + num6);

        in.close();
    }
}
