import java.util.Scanner;

/**
 * Created by jaimemoncada on 5/9/17.
 */

public class ControlFlowExercise {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

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
//            if(((test % 3) == 0) && ((test % 5) == 0)){
//                System.out.println("FizzBuzz");
//            } else if((test % 3) == 0){
//                System.out.println("Fizz");
//            } else if((test % 5) == 0){
//                System.out.println("Buzz");
//            } else System.out.println(test);
//        }
//        // Squared and Cubed table
//        System.out.println("Please enter a number between 1 and 9.");
//        int number = input.nextInt();
//        System.out.println("Here is your table up too the number " + number + ".");
//        System.out.println(" ");
//        System.out.println("Number | Squared | Cubed");
//        System.out.println("------ | ------- | -----");
//        for(int rows = 0; rows <= number; rows++){
//            if(Math.pow(rows, 2) <= 9) {
//                System.out.printf("%d      | %.0f       | %.0f\n", rows, Math.pow(rows, 2), Math.pow(rows, 3));
//            } else {
//                System.out.printf("%d      | %.0f      | %.0f\n", rows, Math.pow(rows, 2), Math.pow(rows, 3));
//            }
//        }
        // Grade Conversion table
        System.out.println("Please enter a number between 0 and 100.");
        int grade = input.nextInt();
        System.out.println("Let me convert " + grade + " for you.");
        if (grade <= 60){
            System.out.println(" ");
            System.out.println(grade + " = F");
        } else if ((grade >= 61) && (grade <= 66)){
            System.out.println(" ");
            System.out.println(grade + " = D");
        } else if ((grade >= 67) && (grade <= 79)){
            System.out.println(" ");
            System.out.println(grade + " = C");
        } else if ((grade >= 80) && (grade <=87)){
            System.out.println(" ");
            System.out.println(grade + " = B");
        } else if((grade >= 88) && (grade <= 100)){
            System.out.println(" ");
            System.out.println(grade + " = A");
        } else System.out.println("Invalid Number");





    }
}
