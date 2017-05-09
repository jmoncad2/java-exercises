/**
 * Created by jaimemoncada on 5/9/17.
 */

public class ControlFlowExercise {

    public static void main(String[] args) {

        int first = 5;

        while (first <= 15){
            System.out.println("First Number " + first);
            first++;
        }

        int two = 0;

        do {
            System.out.println("Two Number " + two);
            two+=2;
        } while (two <= 100);

        int negative = -10;

        do {
            System.out.println("Negative Number " + negative);
            negative+=5;
        }
        while (negative <= 100);

        int start = 2;

        do {
            System.out.println("Start Number " + start);
            start+=2;
        } while (start <= 1000000);


    }
}
