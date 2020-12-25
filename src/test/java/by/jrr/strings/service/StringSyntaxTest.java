package by.jrr.strings.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringSyntaxTest {

    @Test
    public void constructors() {
        char[] chars = {'t', 'e', 'x', 't'};
        byte[] bytes = {84, 101, 120, 116};

        var s1 = new String();
        var s2 = new String("Text");
        var s3 = "Text";
        var s4 = new String(chars);
        var s5 = new String(bytes);

        char[] charResult = s5.toCharArray();
        byte[] byteResult = s5.getBytes();

    }

    @Test
    public void concatenation() {
        var s1 = "hello";
        System.out.println(s1);
        s1 = s1.concat(" world");
        System.out.println(s1);
        s1 = "hello".concat(" world");
        System.out.println(s1);
        s1 = "hello " + "world";
        System.out.println(s1);
        s1 = 45L + " world";
        System.out.println(s1);
        s1 = "Hello " + null;
        System.out.println(s1);
        s1 = "Hello".concat(null); //NPE
    }

    @Test
    public void objectNotString() {
//        String s1 = true + 1;  //compile error
        Object obj = "text";
//        String s2 = obj + obj; //compile error
    }

    @Test
    public void specialCase() {
        var s = new String("Text");
        var a = "Text";

        System.out.println("s.length() = " + s.length());
        System.out.println("\"Text\".length() = " + "Text".length());

        System.out.println("a == s = " + a == s); //should be avoided

        int c = 3;
        int d = 7;

        System.out.println(" c * d = " + c * d); //should be avoided
        System.out.println(" c + d = " + c + d); //should be avoided
        //don't do calculations in strings!
    }

    @Test
    public void concatAnd() {
        String s = "1";
        s += 2; // s = s + 2;
        assertEquals("12", s);

        int x = 1; // x = 1 + "2"
//        x += "2"; //compile error

        Object o = 1;
        o += "2";
        assertEquals("12", o);

        Object h = "hello ";
//        h += 2; //compile error
    }

    @Test
    public void stringMethods() {
//        0 1 2 3 4 5 6 7 8 9 10 11 12 12 14 15 16
//        M A K S I M   S H E L  K  O  V  I  C  H

        String s = "MAKSIM SHELKOVICH";

        System.out.println("s.length() = " + s.length());
        System.out.println("s.charAt(3) = " + s.charAt(3));
        System.out.println("s.substring(7, 17) = " + s.substring(7, 17));
        System.out.println("s.trim() = " + s.trim());
        System.out.println("s = " + s);
        System.out.println("s.toLowerCase() = " + s.toLowerCase());
        System.out.println("s.compareToIgnoreCase(\"Maksim Shelkovich\") = " + s.compareToIgnoreCase("Maksim Shelkovich"));
        System.out.println("s.contains(\"MAKSIM\") = " + s.contains("MAKSIM"));
        System.out.println("s.indexOf(\"M\") = " + s.indexOf("M"));
        System.out.println("s.indexOf(\"M\", 1) = " + s.indexOf("M", 1));
        System.out.println("s.replaceFirst(\"S\", \"SS\") = " + s.replaceFirst("S", "SS"));
        System.out.println("s.replaceAll(\"S\", \"SS\") = " + s.replaceAll("S", "SS")); //s.replace(...)
        System.out.println("s.startsWith(\"Maksim\") = " + s.startsWith("Maksim"));
        System.out.println("s.endsWith(\"h\") = " + s.endsWith("h"));
        System.out.println("s.toUpperCase().startsWith(\"Maksim\".toUpperCase()) = " + s.toUpperCase().startsWith("Maksim".toUpperCase()));

        String hello = " hello ";
        System.out.println("hello =:" + hello + ":");
        System.out.println("hello.strip() =:" + hello.strip() + ":");
        System.out.println("hello.stripLeading() =:" + hello.stripLeading() + ":");
        System.out.println("hello.stripTrailing() =:" + hello.stripTrailing() + ":");
        System.out.println("hello.trim() =:" + hello.trim() + ":");
    }

    @Test
    public void methodChain() {
        String hello = " hello ";
        String chainedResult = hello
                .trim()
                .concat(", ")
                .concat("world!")
                .replace("h", "Well... H")
                .toUpperCase();
        System.out.println(chainedResult);
    }

    @Test
    public void emptyVsBlank() {
        String s;
        s = "";
        System.out.println("s = :" + s +":");
        System.out.println("s.isEmpty() = " + s.isEmpty());
        System.out.println("s.isBlank() = " + s.isBlank());

        s = " ";
        System.out.println("s = :" + s +":");
        System.out.println("s.isEmpty() = " + s.isEmpty());
        System.out.println("s.isBlank() = " + s.isBlank());

        s = null;
        System.out.println("s = :" + s +":");
        System.out.println("s.isEmpty() = " + s.isEmpty()); //NPE
        System.out.println("s.isBlank() = " + s.isBlank()); //NPE
    }

    @Test
    public void equality() {
        String left = "hello";
        String right = "HellO";
        System.out.println("left.equals(right) = " + left.equals(right));
        System.out.println("left.equalsIgnoreCase(right) = " + left.equalsIgnoreCase(right));

        String leftInPool = "hello";
        System.out.println("left == leftInPool = " + (left == leftInPool)); //code smells
    }

    @Test
    public void comparations(){
        System.out.println(Long.valueOf(10).compareTo(10L));
    }
}
