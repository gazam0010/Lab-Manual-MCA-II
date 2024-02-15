package Week5;

import java.util.ArrayList;
import java.util.Scanner;

class OddAndEven{ // 
	public  int countOfOdd = 0;
    public  int countOfEven = 0;

    public void addNumber(int n){
			if(n % 2 != 0){
                countOfOdd++;
            }else{
                countOfEven++;
            }
    }
    public void toString(OddAndEven obj){
        System.out.println("Number of Odd: x = " + obj.countOfOdd);
        System.out.println("Number of Even: y = " + obj.countOfEven);
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
        System.out.println("List of Integers:" +list);
        for (int i = 0; i < list.size(); i++) {
            obj.addNumber(list.get(i));
            // System.out.println(list.get(i));
        }
        obj.toString(obj);
        // System.out.println("Number of Odd: x = " + obj.countOfOdd);
        // System.out.println("Number of Even: y = " + obj.countOfEven);
    }
}
