package Java2;

/**
 * Created by
 * jaimemoncada on 5/19/17.
 */
abstract class Quadralateral extends Shape implements Measurable {
    protected double width;
    protected double length;

    public Quadralateral(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }

    abstract void setWidth(double width);
    abstract void setLength(double length);

}
