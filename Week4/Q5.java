import java.awt.Rectangle;

public class Q5 {
    public static void main(String[] args) {

        // construct box1
        Rectangle box1 = new Rectangle(0, 0, 20, 40);
        System.out.println(box1);
        // label box1 to r1
        Rectangle r1 = box1;

        // construct box2
        Rectangle box2 = new Rectangle(10, 20, 40, 60);
        System.out.println(box2);
        // label box2 to r2
        Rectangle r2 = box2;

        // calculate intersected region
        Rectangle r3 = r1.intersection(r2);
        System.out.println(r3);
    }
}
