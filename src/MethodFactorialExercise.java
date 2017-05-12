import java.util.Scanner;

/**
 * Created by
 * jaimemoncada on 5/12/17.
 */

public class MethodFactorialExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String yesNo = "y";

        int y, z;
        System.out.println("FACTORIAL TIME!!!, enter a number to get your results");
        y = input.nextInt();
        for (int x = y; x <=1; x--){
            z = y * (y-1);
            System.out.println(x + "! = " + y + " = " + z);
        }
        System.out.println("Would you like to continue? (Y,N)");
        yesNo = input.next();
        if (yesNo.equalsIgnoreCase("y")) {
            main(args);
        }
    }

//    public static int factorial(int factorial1) {
//
//        int z = factorial1 * (factorial1 - 1);
//        return z;
//    }

}
