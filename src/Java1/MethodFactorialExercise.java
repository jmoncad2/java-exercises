package Java1;

import java.util.Scanner;

/**
 * Created by
 * jaimemoncada on 5/12/17.
 */

public class MethodFactorialExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String yesNo;
        long total = factorial(input);
        System.out.println("total " + total);
        System.out.println("Would you like to continue? (Y,N)");
        yesNo = input.next();
        if (yesNo.equalsIgnoreCase("y")) {
            main(args);
        }
    }

    public static long factorial(Scanner input) {
        System.out.println("FACTORIAL TIME!!!, enter a number to get your results");
        int factorial = input.nextInt();
        int total = factorial;
        for(int i = factorial; i > 1; i--){
            total *= i - 1;
        }
        return total;
    }

}
