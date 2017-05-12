import java.util.Scanner;

/**
 * Created by
 * jaimemoncada on 5/11/17.
 */
public class MethodExercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String yesNo = "y";

        int x, y, z;
        System.out.println("Magic Box of wonders, enter 2 numbers to get:");
        System.out.println("Addition, Subtraction, Multiplication, Division, Modulus, and Average");
        x = input.nextInt();
        y = input.nextInt();
        z = x + y;
        System.out.println("Here is your adding results: " + z);

        int subtracResult = subtraction(x, y);
        System.out.println("Here is your subtraction results: " + subtracResult);

        int multiResult = multiplication(x, y);
        System.out.println("Here is your multiplication results: " + multiResult);

        int divResult = division(x, y);
        System.out.println("Here is your division results: " + divResult);

        int modResult = modulus(x, y);
        System.out.println("Here is your modulus results " + modResult);

        int avgResult = average(x, y);
        System.out.println("Here is your average result " + avgResult);
        System.out.println("Would you like to continue? (Y,N)");
        yesNo = input.next();
        if(yesNo.equalsIgnoreCase("y")){
            main(args);
        }

    }

    // Subtraction
    public static int subtraction(int number1, int number2) {

        int z = number1 - number2;
        return z;
    }

    // Multiplication
    public static int multiplication(int multi1, int multi2) {
        int z = multi1 * multi2;
        return z;
    }

    // Division
    public static int division(int div1, int div2) {
        int z = div1 / div2;
        return z;
    }

    // Modulus
    public static int modulus(int mod1, int mod2) {
        int z = mod1 % mod2;
        return z;
    }

    // Average min and max
    public static int average(int min, int max) {
            int z = (min + max) / 2;
            return z;
    }

}
