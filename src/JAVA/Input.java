package JAVA;

import java.util.Scanner;

/**
 * Created by
 * jaimemoncada on 5/17/17.
 */
public class Input {

    private Scanner userScanner;


    public Input(){
        this.userScanner = new Scanner(System.in);
    }

    public String getString(){
        return userScanner.nextLine();
    }

    public boolean yesNo(){
        String answer = this.getString();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")){
            return true;
        } else if (answer.equalsIgnoreCase("n")) {
            return false;
        } else {
            System.out.println("Invalid");
            return yesNo();
        }
    }

    public int getInt(){
        return userScanner.nextInt();
    }

    public int getInt(int min, int max){
        int number = this.getInt();
        if (number >= min && number <= max){
            return number;
        }
        System.out.println("Invalid number");
        return getInt(min,max);
    }

//    public double getDouble(double min, double max){
//        double adminDouble = getDouble();
//        return adminDouble;
//    }

    public double getDouble(){
        return userScanner.nextDouble();
    }

}
