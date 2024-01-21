package Week3;

public class Q5 {
    public static void main(String[] args) {
        // Originallay
        System.out.print("Firstly");
        int a = 1;
        for (int i = 0; i <= 6; i++) {
           for (int j = 0; j < i; j++) {
            System.out.print(a +" ");
            a++;
           }
           System.out.println();
        }
        // variation
        System.out.println("\nAfter Variation");
        int n = 6; // number of rows
        int num = 1; // start with 1

        for (int i = 1; i <= n; i++) {
            num = i % 2; // alternate starting number for each row
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = 1 - num; // flip between 1 and 0
            }
            System.out.println();
        }
    }
}
