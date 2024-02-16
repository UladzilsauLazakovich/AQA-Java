package Lesson_2;

public class NumberChecker {
    public static void main(String[] args) {
        int number = -5;
        checkNumber(number);
    }

    public static void checkNumber(int num) {
        if (num >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
}
