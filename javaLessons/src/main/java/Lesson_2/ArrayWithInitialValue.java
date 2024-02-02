package Lesson_2;

import java.util.Arrays;

public class ArrayWithInitialValue {
    public static void main(String[] args) {
        int len = 5; // задайте желаемую длину массива
        int initialValue = 10; // задайте начальное значение

        int[] resultArray = createArray(len, initialValue);

        // Печать результата для проверки
        System.out.println(Arrays.toString(resultArray));
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }
}
