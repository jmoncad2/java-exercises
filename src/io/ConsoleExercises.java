package io;

import java.util.Scanner;

    public class ConsoleExercises {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Give me your age please");

            int age = input.nextInt();

            System.out.println("Your age is " +age);
            // If trying to input something that is not an integer, will result in code halt i.e. "Error"

            System.out.println("Type your top 3 foods");
            String food1 = input.next();
            String food2 = input.next();
            String food3 = input.next();
            System.out.println("Your top 3 foods are " + food1 + "," + food2 + "," + food3);
            // cant just leave it blank, requires input and cant enter more then 3
            System.out.println("Type your favorite quote");
            // String quote = input.next(); // This will only capture the first word of the quote
            input.nextLine();
            String quote = input.nextLine();
            System.out.println("Your favorite quote: " + quote);
            System.out.println("Type the classroom length and width");
            String length = input.next();
            String width = input.next();
            System.out.println(length + "L x " + width + "W");
            System.out.println("<=========================================>");

            System.out.println("*T* Welcome to Dancing Cactus Pizza. *T*");
            System.out.println("*T* What pizza size would you like? *T*");
            System.out.println("*T* We have: Large = $9, Medium = $7, Small = $5 *T*");
            String pizzaSize = input.next();
            System.out.println(pizzaSize + " sounds good!!!");
            System.out.println("*T* What type of pizza would you like? *T*");
            System.out.println("*T* We have: Classic Pepperoni, 3 Meat Trio, 4 Cheese, Veggie, Supreme *T*");
            String pizzaType = input.next();
            System.out.println(pizzaType + " really good choice");
            System.out.println("*T* Would you like extra toppings? Each topping is $1.50 *T*");
            System.out.println("*T* We have: Pepperoni, Pineapple, Bacon, Italian Sausage, Green Peppers *T*");
            System.out.println("*T* Also have: Ham, Red Peppers, Mushrooms, Chicken, Anchovies *T*");
            input.nextLine();
            String pizzaToppings = input.nextLine();
            System.out.println(pizzaToppings + " ok no problem");
            System.out.println("*T* We are almost ready to place your oder, just need some info *T*");
            System.out.println("*T* What is your name? *T*");
            String infoName = input.next();
            System.out.println("*T* Okay " + infoName + " Whats your address? *T*");
            String infoAdd = input.next();
            System.out.println(infoAdd + " *T* Sounds good and whats your phone number *T*");
            String infoPhone = input.next();
            System.out.println();




        }
    }

