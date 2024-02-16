package Lesson_2;

public class LeapYearChecker {
    public static void main(String[] args) {
        int year = 2024;

        boolean isLeapYear = checkLeapYear(year);
        System.out.println("Is leap year: " + isLeapYear);
    }

    public static boolean checkLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
