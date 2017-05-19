package Java2;

/**
 * Created by
 * jaimemoncada on 5/19/17.
 */
public class Rectangle extends Quadralateral implements Measurable {

    public Rectangle(double width, double length){
        super(width,length);
    }

    @Override
    public  double getWidth(){
        return super.getWidth();
    }

    public double getPerimeter(){
        return (2 * length) + (2 * width);
    }

    public double getArea(){
        return length * width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }

}

class Square extends Quadralateral {

    public Square(double side){
        super(side, side);
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getPerimeter(){
        return 4 * width;
    }

    public double getArea(){
        return width * width;
    }

}
