package by.jrr.strings.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringMutableTest {

    @Test
    public void stringConcat() {
        String sb = new String();
        for (int i = 0; i < 10000; i++) {
            sb = sb + i;
        }
        String result = sb;
        System.out.println(result);
    }

    @Test
    public void stringBufferConcat() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }
        String result = sb.toString();
        System.out.println(result);
    }

    @Test
    public void stringBuilderConcat() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }
        String result = sb.toString();
        System.out.println(result);
    }

    @Test
    public void syntax() {
        StringBuilder sb = new StringBuilder("01234");
        sb.insert(2, 'A');
        sb.insert(6, "hello");
        sb.replace(1, 3, "abcd");
        sb.delete(1, 3);

        sb.setLength(2); // truncates length

        String str = sb.substring(0, 2);
        System.out.println(str+" "+sb);

        StringBuilder sb2 = sb.delete(0, 2);
        System.out.println(sb2+" "+sb);
    }
}
