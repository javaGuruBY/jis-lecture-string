package by.jrr.strings.service;

import by.jrr.strings.bean.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImmutabilityTest {

    @Test
    public void mutabilityOfPersons() {
        Person firstPerson = new Person("Mikas");
        Person secondPerson = firstPerson;
        Person thirdPerson = secondPerson;

        thirdPerson.name = "Maksim";

        System.out.println("firstPerson = " + firstPerson);
        System.out.println("secondPerson = " + secondPerson);
        System.out.println("thirdPerson = " + thirdPerson);
    }

    @Test
    public void immutabilityOfStrings() {
        String firstPerson = new String("Mikas");
        String secondPerson = firstPerson;
        String thirdPerson = secondPerson;

        thirdPerson = "Maksim";

        System.out.println("firstPerson = " + printLink(firstPerson));
        System.out.println("secondPerson = " + printLink(secondPerson));
        System.out.println("thirdPerson = " + printLink(thirdPerson));
    }

    @Test
    public void immutabilityOfStringsConcant() {
        String firstPerson = new String("Mikas");
        String secondPerson = firstPerson;
        String thirdPerson = secondPerson;

        System.out.println("firstPerson = " + printLink(firstPerson));
        System.out.println("secondPerson = " + printLink(secondPerson));
        System.out.println("thirdPerson = " + printLink(thirdPerson));

        System.out.println("firstPerson = " + firstPerson);
        System.out.println("secondPerson = " + secondPerson);
        System.out.println("thirdPerson = " + thirdPerson);

        secondPerson = secondPerson.concat(", bye");

        System.out.println("firstPerson = " + printLink(firstPerson));
        System.out.println("secondPerson = " + printLink(secondPerson));
        System.out.println("thirdPerson = " + printLink(thirdPerson));

        System.out.println("firstPerson = " + firstPerson);
        System.out.println("secondPerson = " + secondPerson);
        System.out.println("thirdPerson = " + thirdPerson);
    }

    @Test
    public void immutabilityOfStringsConcant2() {
        String s1 = "hello ";
        System.out.println(printLink(s1));
        s1 = s1 + "world";
        System.out.println(printLink(s1));
        System.out.println(s1);

        String text = "goodbye";
        System.out.println(printLink(text));
        text.concat("cruelWorld");
        System.out.println(printLink(text));
        System.out.println(text);

        s1.toUpperCase();
        System.out.println(s1);
    }

    private String printLink(Object obj) {
        return obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode());
    }

}
