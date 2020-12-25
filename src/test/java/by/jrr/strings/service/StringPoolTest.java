package by.jrr.strings.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringPoolTest {

    String mikas1 = "mikas";
    String mikas2 = "mikas";
    String mikas3 = new String("mikas"); // do not search in String pool
    String mikas4 = "mikas".intern(); // try to search in String pool first, and if not = put in pool

    @Test
    public void demo() {
        System.out.println("(mikas1 == mikas1) = " + (mikas1 == mikas1));
        System.out.println("(mikas1 == mikas2) = " + (mikas1 == mikas2));
        System.out.println("(mikas1 == mikas3) = " + (mikas1 == mikas3));
        System.out.println("(mikas1 == mikas4) = " + (mikas1 == mikas4));
        System.out.println();
        System.out.println("(mikas2 == mikas1) = " + (mikas2 == mikas1));
        System.out.println("(mikas2 == mikas2) = " + (mikas2 == mikas2));
        System.out.println("(mikas2 == mikas3) = " + (mikas2 == mikas3));
        System.out.println("(mikas2 == mikas4) = " + (mikas2 == mikas4));
        System.out.println();
        System.out.println("(mikas3 == mikas1) = " + (mikas3 == mikas1));
        System.out.println("(mikas3 == mikas2) = " + (mikas3 == mikas2));
        System.out.println("(mikas3 == mikas3) = " + (mikas3 == mikas3));
        System.out.println("(mikas3 == mikas4) = " + (mikas3 == mikas4));
        System.out.println();
        System.out.println("(mikas4 == mikas1) = " + (mikas4 == mikas1));
        System.out.println("(mikas4 == mikas2) = " + (mikas4 == mikas2));
        System.out.println("(mikas4 == mikas3) = " + (mikas4 == mikas3));
        System.out.println("(mikas4 == mikas4) = " + (mikas4 == mikas4));
    }
}
