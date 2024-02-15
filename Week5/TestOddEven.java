package Week5;

import java.util.ArrayList;
import java.util.Scanner;

class OddAndEven{
	public static int countOfOdd = 0;
    public static int countOfEven = 0;

    public void addNumber(int n){
			if(n % 2 != 0){
                countOfOdd++;
            }else{
                countOfEven++;
            }
    }
    public void toString(OddAndEven obj){
        System.out.println("Number of Odd: x = " + OddAndEven.countOfOdd);
        System.out.println("Number of Even: y = " + OddAndEven.countOfEven);
    }
}
class TestOddAndEven{
    public static void main(String[] args) {
        OddAndEven obj = new OddAndEven();
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (input.hasNextInt()) {
            list.add(input.nextInt());
        }
        for (int i = 0; i < list.size(); i++) {
            obj.addNumber(i);
        }
        obj.toString();
    }
}
