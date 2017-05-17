package JAVA;

import java.util.Scanner;

/**
 * Created by
 * jaimemoncada on 5/17/17.
 */
public class Input {

    private Scanner userScanner;


    public Input(){
        userScanner = new Scanner(System.in);
    }

    public String getString(){
        return userScanner.next();
    }

    public boolean yesNo(){
        String answer = userScanner.next();
        if (answer.equalsIgnoreCase("y")){
            return true;
        } else if (answer.equalsIgnoreCase("n")) {
            return false;
        } else {
            System.out.println("Invalid");
            return yesNo();
        }
    }

//    public int getIntAsk(int min, int max){
//        int adminInt = getInt();
//        return adminInt;
//    }

    public int getInt(){
        return userScanner.nextInt();
    }

//    public double getDoubleAsk(double min, double max){
//        double adminDouble = getDouble();
//        return adminDouble;
//    }

    public double getDouble(){
        return userScanner.nextDouble();
    }

}
