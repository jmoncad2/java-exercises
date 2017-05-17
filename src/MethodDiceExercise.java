import java.util.Scanner;

/**
 * Created by
 * jaimemoncada on 5/12/17.
 */
public class MethodDiceExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String yesNo;
        int finalRoll = diceRoll(input);
        System.out.println("Would you like to try again? (Y/N)");
        yesNo = input.next();
        if (yesNo.equalsIgnoreCase("y")) {
            main(args);
        }
    }

    public static int diceRoll(Scanner input) {
        System.out.println("Lets dice roll, enter a number that will be the number of sides in each dice");
        int sides = input.nextInt();
        int total = 0;


        return total;
    }
}
