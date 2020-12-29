package by.jrr.strings.service;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class StringStaticTest {

    @Test
    public void stringStaticMethodsDemo() {
        char[] chars = {'t', 'e', 'x', 't'};

        System.out.println("String.valueOf(chars) = " + String.valueOf(chars));
        System.out.println("String.copyValueOf(chars) = " + String.copyValueOf(chars));

        System.out.println("String.valueOf(5L) = " + String.valueOf(5L));
        System.out.println("String.valueOf(true) = " + String.valueOf(true));

        List<String> nameList = List.of("Max", "Danil", "Denis", "Dimon");
        String[] nameArray = {"Max", "Danil", "Denis", "Dimon"};

        System.out.println("String.join(\",\", nameList) = " + String.join(",", nameList));
        System.out.println("String.join(\",\", nameArray) = " + String.join(",", nameArray));

    }

    @Test
    public void stringformatSyntax() {
        System.out.println(String.format("%d Hello world %s ", 1, "!"));
    }

    @Test
    public void formatExamples() {
        String hello = "Hello, World!";

        System.out.println("String.format(\"|%s|\",  hello) = " + String.format("|%s|", hello));  //whole string
        System.out.println("String.format(\"|%30s|\",  hello) = " + String.format("|%30s|", hello)); //with width fixed
        System.out.println("String.format(\"|%3s|\",  hello) = " + String.format("|%3s|", hello)); //with width fixed if string wider
        System.out.println("String.format(\"|%.3s|\",  hello) = " + String.format("|%.3s|", hello)); //Maximum number of chars
        System.out.println("String.format(\"|%3.3s|\",  hello) = " + String.format("|%3.3s|", hello)); //with width fixed & maximum number of chars
        System.out.println("String.format(\"|%-30s|\",  hello) = " + String.format("|%-30s|", hello));  //with justification

        System.out.println("String.format(\"My name is: %2$s\", \"first\", \"second\") = " + String.format("My name is: %2$s", "first", "second")); //with argument position in string (%2$)

        System.out.println("String.format(\"|%+-20.3f|\", 99.00) = " + String.format("|%+-20.3f|", 99.00));  //with leading +\- left align fixed 20 width floating and 3 digits precision

        String format = "|%+-20.3f|";
        System.out.println("String.format(format, 88.00) = " + String.format(format, 88.00)); // code smells

        System.out.println("format.formatted(88.00) = " + format.formatted(88.00));
    }

    @Test
    public void printLocalized() {
        System.out.println(String.format("Today is %tA", LocalDateTime.now()));
        System.out.println(String.format(Locale.CHINA, "Today is %tA", LocalDateTime.now()));
        System.out.println(String.format(new Locale("be", "BY"), "Today is %tA", LocalDateTime.now()));
        System.out.println(String.format(new Locale("be", "BY"), "Today is %tA", LocalDateTime.now()));
        System.out.println(String.format(
                new Locale("be", "BY"),
                "Today is %1$tA, %1$td %1$tB %1$tY",
                LocalDateTime.now()));
    }

    @Test
    public void stringFormatDate() {
        Locale.setDefault(Locale.CHINA);
        printDates();
        Locale.setDefault(Locale.UK);
        printDates();
        Locale.setDefault(new Locale("ru"));
        printDates();
        Locale.setDefault(new Locale("be"));
        printDates();
    }

    private void printDates() {

        var date = LocalDateTime.now();

        System.out.println("String.format(\"Today is %tA\", date) = " + String.format("Today is %tA", date));
        System.out.println("String.format(\"Today is %ta\", date) = " + String.format("Today is %ta", date));
        System.out.println("String.format(\"Today is %tB\", date) = " + String.format("Today is %tB", date));
        System.out.println("String.format(\"Today is %tb\", date) = " + String.format("Today is %tb", date));
        System.out.println("String.format(\"Today is %tC\", date) = " + String.format("Today is %tC", date));
//        String.format("Today is %tc", date);
        System.out.println("String.format(\"Today is %tD\", date) = " + String.format("Today is %tD", date));
        System.out.println("String.format(\"Today is %td\", date) = " + String.format("Today is %td", date));
//        String.format("Today is %tE", date);
        System.out.println("String.format(\"Today is %te\", date) = " + String.format("Today is %te", date));
        System.out.println("String.format(\"Today is %tF\", date) = " + String.format("Today is %tF", date));
//        String.format("Today is %tf", date);
//        String.format("Today is %tg", date);
//        String.format("Today is %tG", date);
        System.out.println("String.format(\"Today is %tH\", date) = " + String.format("Today is %tH", date));
        System.out.println("String.format(\"Today is %th\", date) = " + String.format("Today is %th", date));
        System.out.println("String.format(\"Today is %tI\", date) = " + String.format("Today is %tI", date));
//        String.format("Today is %ti", date);
//        String.format("Today is %tJ", date);
        System.out.println("String.format(\"Today is %tj\", date) = " + String.format("Today is %tj", date));
//        String.format("Today is %tK", date);
        System.out.println("String.format(\"Today is %tk\", date) = " + String.format("Today is %tk", date));
        System.out.println("String.format(\"Today is %tL\", date) = " + String.format("Today is %tL", date));
        System.out.println("String.format(\"Today is %tl\", date) = " + String.format("Today is %tl", date));
        System.out.println("String.format(\"Today is %tM\", date) = " + String.format("Today is %tM", date));
        System.out.println("String.format(\"Today is %tm\", date) = " + String.format("Today is %tm", date));
        System.out.println("String.format(\"Today is %tN\", date) = " + String.format("Today is %tN", date));
//        String.format("Today is %tn", date);
//        String.format("Today is %tP", date);
        System.out.println("String.format(\"Today is %tp\", date) = " + String.format("Today is %tp", date));
//        String.format("Today is %tQ", date);
//        String.format("Today is %tq", date);
        System.out.println("String.format(\"Today is %tR\", date) = " + String.format("Today is %tR", date));
        System.out.println("String.format(\"Today is %tr\", date) = " + String.format("Today is %tr", date));
        System.out.println("String.format(\"Today is %tS\", date) = " + String.format("Today is %tS", date));
//        String.format("Today is %ts", date);
        System.out.println("String.format(\"Today is %tT\", date) = " + String.format("Today is %tT", date));
//        String.format("Today is %tt", date);
//        String.format("Today is %tX", date);
//        String.format("Today is %tx", date);
        System.out.println("String.format(\"Today is %tY\", date) = " + String.format("Today is %tY", date));
        System.out.println("String.format(\"Today is %ty\", date) = " + String.format("Today is %ty", date));
//        String.format("Today is %tZ", date);
//        String.format("Today is %tz", date);
    }
}
