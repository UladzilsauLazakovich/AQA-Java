package Lesson_2;

public class BinaryArrayInverter {
    public static void main(String[] args) {
        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        invertBinaryArray(binaryArray);

        // Печать результата для проверки
        for (int value : binaryArray) {
            System.out.print(value + " ");
        }
    }

    public static void invertBinaryArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
    }
}
