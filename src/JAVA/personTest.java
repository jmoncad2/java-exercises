package JAVA;

/**
 * Created by
 * jaimemoncada on 5/17/17.
 */
public class personTest {
    public static void main(String[] args) {
        Person person = new Person("James");
        System.out.println(person.getName());


        /*
        Expected True on both SOUT's
        Got True on the first and False on the second SOUT
         */
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
        /*
        Expected True on the SOUT
        Got True on the SOUT
         */
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
        /*
        Expected John on first and second SOUT
        Expected Jane on third and fourth SOUT
        Got John on first and second SOUT
        Also got Jane on third and fourth SOUT
         */
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}
