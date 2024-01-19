import java.util.Scanner;
class Q4{
    public static void main(String[] args){
        System.out.print("Enter temprature in Fahrenheit:");

        Scanner sc = new Scanner(System.in);

        double ft = sc.nextDouble();

        double c = (ft - 32) / 1.8;
        
        System.out.println("Sum of two numbers:"+ c);
        sc.close();
    }
}