package Java2;

import Java2.Input;

/**
 * Created by
 * jaimemoncada on 5/17/17.
 */
public class InputTest {

    public static void main(String[] args) {
        Input entry = new Input();


        do {
            System.out.println("Whats your name");
            System.out.println("Welcome " + entry.getString());
            System.out.println("Do you like rain?(Y/N)");
            entry.yesNo();
            System.out.println("Me too");
            System.out.println("Enter your favorite number");
            entry.getInt();
            System.out.println("That's my favorite too");
            System.out.println("If I have 8.43 and I lose 1.21, how much do I have left?");
            entry.getDouble();
            System.out.println("Thats right");
            System.out.println("Enter number between 1 and 10");
            entry.getInt(1,10);
            System.out.println("Cool");
            System.out.println("Do you wanna retry?(Y/N)");
        } while(entry.yesNo());
    }

}
