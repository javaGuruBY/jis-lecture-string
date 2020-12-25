package by.jrr.strings.service;

public class PasswordService {
    public static final String myPass = "1234";

    public boolean verifyToLeft(String pass) {
        return myPass == pass;
    }

    public boolean verifyToRight(String pass) {
        return pass == myPass;
    }

    public boolean compareWithEquals(String pass) {
        return myPass.equals(pass);
    }

    public boolean riskyCompareWithEquals(String pass) {
        return pass.equals(myPass);
    }
}
