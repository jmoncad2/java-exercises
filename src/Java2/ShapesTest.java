package Java2;

/**
 * Created by
 * jaimemoncada on 5/19/17.
 */
public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,5);
        Rectangle box2 = new Square(5);

        System.out.println("Area = " + box1.getArea() + "\nPerimeter = " + box1.getPerimeter());

        System.out.println("Area = " + box2.getArea() + "\nPerimeter = " + box2.getPerimeter());
    }



}
