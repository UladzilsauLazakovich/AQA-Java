package Lesson_2;

public class NegativeNumberChecker {
    public static void main(String[] args) {
        int number = -5;
        boolean result = isNegative(number);
        System.out.println(result);
    }

    public static boolean isNegative(int num) {
        return num < 0;
    }
}
