package by.jrr.strings.functions;

import java.util.function.Function;

public class MyCalculateSpaces implements Function<String, Long> {
    @Override
    public Long apply(String s) {
        long i = 0;
        int pos = 0;
        while(s.indexOf(" ", pos) > 0) {
            i++;
            pos = 1 + s.indexOf(" ", pos);
        }
        return i;
    }
}
