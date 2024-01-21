package Week3;

public class Q3 {
    public static void main(String[] args) {
        double sum = 0.0;
        double count = 1.0;
        while (count != 10.0) {
            sum += 1/count;
            count++;
        }
        System.out.println("The required sum is : " + sum);
    }
}
