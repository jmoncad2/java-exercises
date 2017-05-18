import java.util.Arrays;
import java.util.Scanner;

public class JavaServer {
    public static void main(String[] args) {
        String yesNo = "y";
        Scanner input = new Scanner(System.in);

        String[] adj = {
                "nondescript",
                "funny",
                "exclusive",
                "spotless",
                "animated",
                "fluttering",
                "gamy",
                "important",
                "broad",
                "puzzled",
        };

        String[] noun = {
                "dock",
                "stop",
                "yarn",
                "partner",
                "balance",
                "current",
                "bath",
                "tree",
                "statement",
                "purpose",
        };

        String randomAdj = adj[(int)(Math.random() * adj.length)];
        String randomNoun = noun[(int)(Math.random() * noun.length)];
        do {
            System.out.println(" ");
            System.out.println("Random server name is " + randomAdj + randomNoun);
            System.out.println("Would you like another name?(Y/N)");
            yesNo = input.nextLine();
        } while (yesNo.equalsIgnoreCase("y"));

    }
}
