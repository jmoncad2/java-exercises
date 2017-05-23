package Java2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String yesNo;

        Student student1 = new Student("james");
        student1.addGrade(85);
        student1.addGrade(100);
        student1.addGrade(81);

        Student student2 = new Student("lalo");
        student2.addGrade(75);
        student2.addGrade(85);
        student2.addGrade(91);

        Student student3 = new Student("juan");
        student3.addGrade(92);
        student3.addGrade(87);
        student3.addGrade(100);

        students.put("james", student1);
        students.put("lalo", student2);
        students.put("juan", student3);

            System.out.println("Welcome!");
        do {
            System.out.println("Here are the github usernames of our students:");

            students.forEach((username, student) -> System.out.println("|" + username + "| "));

            System.out.println("\nWhat student would you like to see more information on?");
            String username = input.next();

            if (!students.containsKey(username)) {
                System.out.println("Sorry, no student found with the gihub username of " + username + ".");
            } else {
                Student student = students.get(username);
                System.out.println("Name: " + student.getName() + "\nGithub Username: " + username + ".git");
                System.out.println("Current Average: " + student.getGradeAverage());
            }

            System.out.println("Would you like to see another student?(Y/N)");
            yesNo = input.next();
        } while ("y".equalsIgnoreCase(yesNo));
        System.out.println("Good bye");
    }
}
