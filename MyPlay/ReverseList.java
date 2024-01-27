import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5}; //int arr = {1, 2, 3, 4, 5}; X
    
        System.out.println("Original list : "+ Arrays.toString(arr));
        List<Integer> list = Arrays.asList(arr);
        Collections.reverse(list);
        arr = list.toArray(new Integer[0]);

        System.out.println("Reversed list : "+ Arrays.toString(arr));
    }
}
