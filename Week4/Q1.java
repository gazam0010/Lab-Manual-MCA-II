// package Week4;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the mth number: ");
        int fisrtM = in.nextInt();
        int n1 = 0;
        int n2 = 1;
        if (fisrtM ==1 || fisrtM==2 || fisrtM==3) {
            System.out.print("0 1 1 ");
        }

        int i = 0;
        do{
            int nxt = n1 + n2;
            n1 = n2;
            n2 = nxt;
            System.out.print(nxt + " ");
            i++;
        }while(i <= fisrtM);

        in.close();
    }
}
