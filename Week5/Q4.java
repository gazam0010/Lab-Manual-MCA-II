package Week5;

import java.util.Scanner;

class Commission{
    double sale;

    // constructor
    public Commission(double sale){
        this.sale =sale;
    }
    // commission method
    double commission(){
        double commission=0.0;
        if (sale < 0) {
            System.out.println("Invalid Input!");
            return -1.0;
        }
        if (sale < 500.0) {
            commission = sale*0.02;
            
        }
        if (sale > 500.0 && sale < 5000.0) {
            commission = sale * 0.05;
        }
        if (sale >= 5000.0) {
            commission = sale * 0.08;
        }
        return commission;
    }
}
public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter sales value: ");
        double sl = in.nextDouble();
        Commission cm1 = new Commission(sl);
        System.out.println("Commission is: " + cm1.commission());
    }
}
