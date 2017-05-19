package Java1;

public class Arithmetic {
    public static void main(String[] args) {
        double number1 = 12;
        double number2 = 6.5;

        System.out.println(number1 + number2);
        System.out.println(number1 * number2);
        System.out.println(number1 / number2);

        int number3 = 10;
        int number4 = 4;

        System.out.println(number3 % number4);
        System.out.println(number3 / number4); // the division is also going to be an integer

        number3++; // 11
        number3++; // 12

        System.out.println(number3);

        number4--; // 3
        number4--; // 2
        System.out.println(number4);

        number4 = number4 + 5;
        number4 += 5;
        System.out.println(number4);

        int anIntegerNumber = 23;
        double dDouble = anIntegerNumber;

        System.out.println(dDouble);

        double anotherNumber = 3.45; // the number it's larger by definition
        int dSmallerNumber = (int) anotherNumber; // cast is explicit
        System.out.println(dSmallerNumber);
        System.out.println("<=================_Exercise_Code_=================================>");
        int myFavoriteNumber = 15;
        System.out.println(myFavoriteNumber);
        String myString = "THis is my string";
        System.out.println(myString);
        // Assigning the value of 3.14 on a long type wont work b/c its a double and 123 is a single line
        float myNumber = 3.14f;
        System.out.println(myNumber);
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
        // The first block gives me 5 then 6 SOUTing before the increase in value on both SOUT's
        // The second block gives me 6 and 6 adding a value before its first SOUT
        // class = 12;
        // Trying to make a Variable named class wont let me


    }
}
