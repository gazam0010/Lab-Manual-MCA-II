package MyPlay;

import java.util.*;

public class SwapExample {
    public static void main(String[] args) {
        // Create a list with items
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Android");
        list.add("Python");
        list.add("Node.js");

        System.out.println("Original List: " + list);

        // Perform swapping
        Collections.swap(list, 0, 2);

        System.out.println("List after swapping: " + list);
    }
}
