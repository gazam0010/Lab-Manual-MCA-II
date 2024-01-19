// Question no 2
package Week2;
import java.util.*;
class MyNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a double number:");
        double num = sc.nextDouble();
        
        double  numRound = Math.round(num);
        System.out.println("Rounded value is :" + numRound);

        double  numCeil = Math.ceil(num);
        System.out.println("Ceiling value is :" + numCeil);

        double  numFloor = Math.floor(num);
        System.out.println("floor value is :" + numFloor);

        double  numInterger = (int)num;
        System.out.println("Integer value is :" + numInterger);

        sc.close();
    }
}