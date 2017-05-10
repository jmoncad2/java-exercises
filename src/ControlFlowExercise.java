/**
 * Created by jaimemoncada on 5/9/17.
 */

public class ControlFlowExercise {

    public static void main(String[] args) {
        // Counts by 1 until it is 15 but starts from number 5
        int first = 5;

        while (first <= 15){
            System.out.println("First Number " + first);
            first++;
        }
        // Counts by 2 until it is 100
        int two = 0;

        do {
            System.out.println("Two Number " + two);
            two+=2;
        } while (two <= 100);
        // Counts by 5 until it is 100 but starts from number -10
        int negative = -10;

        do {
            System.out.println("Negative Number " + negative);
            negative+=5;
        }
        while (negative <= 100);
        // Counts by 2 until it is 1000000 but starts from number 2
        int start = 2;

        do {
            System.out.println("Start Number " + start);
            start+=2;
        } while (start <= 1000000);
        // For loop counts by 2 until it is 1000000 but starts from number 2
        for (int forTwo = 2; forTwo <= 1000000; forTwo +=2){
            System.out.println("For Loop Number " + forTwo);
        }
        // FizzBuzz exercise
        for(int test = 1; test <= 100; test++) {
            if(((test % 3) == 0) && ((test % 5) == 0)){
                System.out.println("FizzBuzz");
            } else if((test % 3) == 0){
                System.out.println("Fizz");
            } else if((test % 5) == 0){
                System.out.println("Buzz");
            } else System.out.println(test);
        }





    }
}
