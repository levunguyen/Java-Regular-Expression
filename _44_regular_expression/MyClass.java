package _44_regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass {

    //tên phải có ít nhất là 6 ký tự, và dài nhất là 12 ký tự
    public static final String REGEX_NAME = "^[a-zA-Z ]{6,12}$";
    //Email abc@levunguyen.com.vn
    public static final String REGEX_EMAIL = "^\\w+@\\w+(\\.\\w+){1,2}$";
    //Số điện thoại
    public static final String REGEX_PHONE_NUMBER = "^84\\d{7}$";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX_PHONE_NUMBER);
        String input = "843456789";
        Matcher matcher = pattern.matcher(input);
        System.out.println(matcher.matches());
    }
}
