package Java1;

import java.util.Scanner;

/**
 * Created by
 * jaimemoncada on 5/11/17.
 */
public class StringExercise {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        String message = "We don't need no education";
//
//        if (message.equals("We don't need no education")){
//            System.out.println(message);
//        }
//        if (message.equals("We don't need no education")){
//            System.out.println("We don't need no thought control");
//            System.out.println(" ");
//        }
//        if (message.equals("We don't need no education")){
//            System.out.println("Check \"this\" out!, \"s inside of \"s!");
//            System.out.println(" ");
//        }
//        if (message.equals("We don't need no education")){
//            System.out.println("In windows, the main drive is usually C:\\");
//            System.out.println(" ");
//        }
//        if (message.equals("We don't need no education")){
//            System.out.println("I can do backslashes \\, double backslashes \\\\,");
//        }
//        if (message.equals("We don't need no education")){
//            System.out.println("and the amazing triple backslash \\\\\\!");
//        } else System.out.println("We did not expect this :( ");
        // Bob extra exercise
        String bobQuestion = "Sure";
        String bobYell = "Whoa, chill out!";
        String bobSilence = "Fine. Be that way!";
        String bobNothing = "What are you talking about!?";
        String bobDodge = "Idk";
        String done = "Im done for now";
            System.out.println(")Bob is a very complicated teenager, he is hiding some info you need; find out what it is");
            System.out.println(")Bob can only answer 1 question at a time and you must get permission first to ask a question");
            System.out.println(")Bob is very specific on how you ask him or answer him; use proper grammar.");
            System.out.println(")When you are done talking to Bob just say \"Im done for now\"");
            System.out.println(" ");
            System.out.println("Bob: \"What do you want?\"");
            String question = input.nextLine();
        do {
            if (question.endsWith("?")) {
                System.out.println(bobDodge + " " + bobQuestion);
            } else if (question.endsWith("!")) {
                System.out.println(bobYell);
            } else if (question.endsWith(".")) {
                System.out.println(bobNothing);
            } else if ((question.endsWith("?")) && (question.equalsIgnoreCase("where"))){
                System.out.println(bobNothing);
            } else System.out.println(bobQuestion + " " + bobSilence);
            question = input.nextLine();
        } while (done.equalsIgnoreCase("Im done for now"));
        System.out.println(bobQuestion);

    }
}
