package Lesson_2;

public class ArrayMultiplier {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        multiplyElementsByCondition(array, 6);

        // Печать результата для проверки
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static void multiplyElementsByCondition(int[] array, int condition) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < condition) {
                array[i] *= 2;
            }
        }
    }
}
