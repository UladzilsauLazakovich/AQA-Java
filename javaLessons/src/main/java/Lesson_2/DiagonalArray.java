package Lesson_2;

public class DiagonalArray {
    public static void main(String[] args) {
        int size = 5; // Задайте размер квадратного массива

        int[][] array = new int[size][size];

        fillDiagonal(array);

        // Печать результата для проверки
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fillDiagonal(int[][] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
        }
    }
}
