package Java2;

/**
 * Created by
 * jaimemoncada on 5/19/17.
 */
public class ShapesTestAbstract {
    public static void main(String[] args) {
        Measurable mySquare = new Square(4.23);
        System.out.println(mySquare.getArea() + "\n" + mySquare.getPerimeter());
        Measurable myRectangle = new Rectangle(6,2);
        System.out.println(" ");
        System.out.println(myRectangle.getArea() + "\n" + myRectangle.getPerimeter());
        System.out.println();
    }
}
