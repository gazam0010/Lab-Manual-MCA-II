package Week5;
class Circle{
    double h, k, r;

    // method to calculate area
    double area(){
        return (3.14*r*r);
    }

    // method to calculate perimeter
    double perimeter(){
        return(2*3.14*r);
    }
    boolean isPonitInside(double x, double y){
        double d = Math.sqrt(((x - h)*(x - k)) + ((y - h)*(y - k)));
        if (d > r) {
            return false;
        } else {
            return true;
        }
    }
}
public class Q2 {
    public static void main(String[] args) {
        Circle c1 = new Circle(); 
        c1.h = 1.0;
        c1.k = 1.0;
        c1.r = 5.0;

        System.out.println("Area: " + c1.area());
        System.out.println("Perimeter: " + c1.perimeter());
        System.out.println("Is point inside circle : " + c1.isPonitInside(2.0, 3.0));
    }
}
