package Lesson_2;

public class StringRepeater {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        int repeatCount = 3;

        repeatString(inputString, repeatCount);
    }

    public static void repeatString(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }
}
