package Lesson_2;

public class IntegerArrayFiller {
    public static void main(String[] args) {
        int[] integerArray = new int[100];

        fillArrayWithSequence(integerArray);

        // Печать результата для проверки
        for (int value : integerArray) {
            System.out.print(value + " ");
        }
    }

    public static void fillArrayWithSequence(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }
}
