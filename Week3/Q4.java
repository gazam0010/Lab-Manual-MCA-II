package Week3;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = in.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i % 2 ==0) {
                sum += i;
            }
        }
        System.out.println("The sum of the series is: "+ sum);
    }
}
