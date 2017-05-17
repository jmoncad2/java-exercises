package JAVA;

/**
 * Created by
 * jaimemoncada on 5/17/17.
 */
public class InputTest {

    public static void main(String[] args) {

        Input userInput = new Input();
        Input userYesNo = new Input();
        Input userInt = new Input();
        Input userDouble = new Input();

        do {
            System.out.println("Whats your name");
            System.out.println("Welcome " + userInput.getString());
            System.out.println("Do you like rain?(Y/N)");
            userYesNo.yesNo();
            System.out.println("Me too");
            System.out.println("Enter your favorite number");
            userInt.getInt();
            System.out.println("That's my favorite too");
            System.out.println("If I have $8.43 and I lose $1.21, how much do I have left?");
            userDouble.getDouble();
            System.out.println("Thats right");
            System.out.println("Do you wanna retry?(Y/N)");
        } while(userInput.yesNo());
    }

}
