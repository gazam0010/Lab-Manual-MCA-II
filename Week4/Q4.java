import java.util.Scanner;

public class Q4 {
    public static void printDigit(int num){
        while (num != 0) {
            System.out.println((num % 10));
            num /= 10;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 4-digit number: ");
        int num  = in.nextInt();
        printDigit(num);
        in.close();
    }
}
