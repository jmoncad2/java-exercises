import java.util.Scanner;

/**
 * Created by jaimemoncada
 * on 5/9/17.
 */

public class ControlFlowExercise {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String yesNo;

//        // Counts by 1 until it is 15 but starts from number 5
//        int first = 5;
//
//        while (first <= 15){
//            System.out.println("First Number " + first);
//            first++;
//        }
//        // Counts by 2 until it is 100
//        int two = 0;
//
//        do {
//            System.out.println("Two Number " + two);
//            two+=2;
//        } while (two <= 100);
//        // Counts by 5 until it is 100 but starts from number -10
//        int negative = -10;
//
//        do {
//            System.out.println("Negative Number " + negative);
//            negative+=5;
//        }
//        while (negative <= 100);
//        // Counts by 2 until it is 1000000 but starts from number 2
//        int start = 2;
//
//        do {
//            System.out.println("Start Number " + start);
//            start+=2;
//        } while (start <= 1000000);
//        // For loop counts by 2 until it is 1000000 but starts from number 2
//        for (int forTwo = 2; forTwo <= 1000000; forTwo +=2){
//            System.out.println("For Loop Number " + forTwo);
//        }
//        // FizzBuzz exercise
//        for(int test = 1; test <= 100; test++) {
//            if((test % 3 == 0) && (test % 5 == 0)){
//                System.out.println("FizzBuzz");
//            } else if(test % 3 == 0){
//                System.out.println("Fizz");
//            } else if(test % 5 == 0){
//                System.out.println("Buzz");
//            } else System.out.println(test);
//        }
        // Squared and Cubed table
        do {
            System.out.println("Please enter a number between 1 and 9.");
            int number = input.nextInt();
            System.out.println("Here is your table up too the number " + number + ".");
            System.out.println(" ");
            System.out.println("Number | Squared | Cubed");
            System.out.println("------ | ------- | -----");
            for (int rows = 0; rows <= number; rows++) {
                // Padding is % [-7]d : negative number between % sign and "d" letter will give me the spacing i want.
                System.out.printf("%-7d| %-8s| %.0f\n", rows, Math.pow(rows, 2), Math.pow(rows, 3));
            }
                System.out.println("Would you like to continue with another number?(Y/N)");
                yesNo = input.next();
        } while (yesNo.equalsIgnoreCase("n"));
        System.out.println("Ok lets stop");
//        // Grade Conversion table
//        do {
//        System.out.println("Please enter student grade between 0 and 100.");
//        int grade = input.nextInt();
//            if (grade <= 60) {
//                System.out.println(grade + " = F");
//            } else if ((grade >= 61) && (grade <= 66)) {
//                System.out.println(grade + " = D");
//            } else if ((grade >= 67) && (grade <= 79)) {
//                System.out.println(grade + " = C");
//            } else if ((grade >= 80) && (grade <= 87)) {
//                System.out.println(grade + " = B");
//            } else if ((grade >= 88) && (grade <= 100)) {
//                System.out.println(grade + " = A");
//            } else System.out.println("That's a SUPPA!!! student");
//            System.out.println("Would you like to continue with another grade?(Y/N)");
//            yesNo = input.next();
//        } while(!yesNo.equals("n"));
//        System.out.println("Ok lets stop");
        // Extra credit problem
//        do {
//            System.out.println("Please enter user number between 0 and 100.");
//            int user = input.nextInt();
//            for (int factor = 2; factor <= user; factor++) {
//                while (user % factor == 0) {
////                    System.out.println(factor + "| " + user);
////                    System.out.println("---------");
//                    if (factor == 3) {
//                        System.out.println("Pling");
//                    } else if (factor == 5) {
//                        System.out.println("Plang");
//                    } else if (factor == 7) {
//                        System.out.println("Plong");
//                    }
////                    else System.out.println(user);
//                    user = user / factor;
//                }
//            }
//            System.out.println("Would you like to continue with another number?(Y/N");
//            yesNo = input.next();
//        } while (!yesNo.equals("n"));
//        System.out.println("Ok lets stop");


    }
}
