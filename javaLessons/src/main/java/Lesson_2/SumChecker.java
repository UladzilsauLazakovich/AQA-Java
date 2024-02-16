package Lesson_2;

public class SumChecker {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 5;

        boolean result = isSumInRange(num1, num2);
        System.out.println(result);
    }

    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
}
