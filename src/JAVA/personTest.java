package JAVA;

/**
 * Created by
 * jaimemoncada on 5/17/17.
 */
public class personTest {
    public static void main(String[] args) {
        Person person = new Person("James");
        System.out.println(person.getName());

        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

    }
}
