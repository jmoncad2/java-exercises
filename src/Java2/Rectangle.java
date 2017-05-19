package Java2;

/**
 * Created by
 * jaimemoncada on 5/19/17.
 */
public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
    }

    public int getArea(){
        int area = length * width;
        return area;
    }

    public int getPerimeter(){
        int perimeter = ((2 * length) + (2 * width));
        return perimeter;
    }
}

class Square extends Rectangle {
    private int side;

    public Square(int side){
        super (side, side);
        this.side = side;
    }

    // Overload is when you have 2 methods with different parameters
    // Override is when you have 2 methods with the same parameters
    @Override
    public int getArea(){
        int area = side * side;
        return area;
    }

    @Override
    public int getPerimeter(){
        int perimeter = 4 * side;
        return perimeter;
    }
}
