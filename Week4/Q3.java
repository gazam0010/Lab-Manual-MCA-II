import java.util.Scanner;

public class Q3 {
    public static int sumNums(int n1, int n2, int n3, int n4){
        return (n1 + n2 + n3 + n4);
    }
    public static int productNums(int n1, int n2, int n3, int n4){
        return (n1 + n2 + n3 + n4);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter All the numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int num4 = in.nextInt();

        System.out.println("The sum is: " +sumNums(num1, num2, num3, num4));
        System.out.println("The product of numbers: " + productNums(num1, num2, num3, num4));

        in.close();
    }
}
