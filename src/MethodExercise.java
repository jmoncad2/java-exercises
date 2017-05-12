import java.util.Scanner;

/**
 * Created by
 * jaimemoncada on 5/11/17.
 */
public class MethodExercise {

    public static void main(String[] args) {

        int x, y, z;
        System.out.println("Please enter two numbers.");
        Scanner input = new Scanner(System.in);
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

    }
    // Subtraction
    public static Integer subtraction(int number1, int number2){

        int z = number1 - number2;
        return z;
    }
    // Multiplication
    public static Integer multiplication(int multi1, int multi2){
        int z = multi1 * multi2;
        return z;
    }
    // Division
    public static Integer division(int div1, int div2){
        int z = div1 / div2;
        return z;
    }



}
