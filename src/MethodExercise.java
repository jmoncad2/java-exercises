import java.util.Scanner;

/**
 * Created by
 * jaimemoncada on 5/11/17.
 */
public class MethodExercise {

    public static void main(String[] args) {

        int x, y, z;
        System.out.println("Please enter two numbers to get there addition");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
        z = x + y;
        System.out.println("Here is your results " + z);

        int result = subtraction(x, y);
        System.out.println(result);

    }

    public static Integer subtraction(int number1, int number2){

        int z = number1 - number2;
        return z;
    }

}
