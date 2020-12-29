package by.jrr.strings.service;

import by.jrr.strings.functions.MyCalculateSpaces;
import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringTransform {
    public static final Function<String, Long> CALC_SPACES = new MyCalculateSpaces();
    public static final Function<String, Long> CALC_SPACES1 = s -> {
        long i = 0;
        int pos = 0;
        while (s.indexOf(" ", pos) > 0) {
            i++;
            pos = 1 + s.indexOf(" ", pos);
        }
        return i;
    };

    String sentence = "Hello World, goodbye cruel world";
    String outputFormat = "total spaces: %+10d|";

    @Test
    public void transform() {
        long spaces1 = sentence.transform(new MyCalculateSpaces());
        long spaces2 = sentence.transform(CALC_SPACES);
        long spaces3 = sentence.transform(CALC_SPACES1);
        long spaces4 = sentence.transform(s -> {
            long i = 0;
            int pos = 0;
            while (s.indexOf(" ", pos) > 0) {
                i++;
                pos = 1 + s.indexOf(" ", pos);
            }
            return i;
        });

        System.out.println(outputFormat.formatted(spaces1));
        System.out.println(outputFormat.formatted(spaces2));
        System.out.println(outputFormat.formatted(spaces3));
        System.out.println(outputFormat.formatted(spaces4));
    }

    @Test
    public void inStream() {
        String[] array = {sentence, sentence};

        Stream.of(array)
                .map(s -> s.transform(CALC_SPACES))
                .collect(Collectors.toList())
                .forEach(result -> System.out.println(outputFormat.formatted(result)));
    }
}
