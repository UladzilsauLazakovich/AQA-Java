package school.lesson1;
/**
 * Домашнее задание по уроку 1.
 * Класс HomeWorkApp объединяет несколько методов, решающих различные задачи.
 *
 * Методы:
 * 1. printThreeWords() - выводит в консоль три слова: Orange, Banana, Apple.
 * 2. checkSumSign() - инициализирует и складывает две переменные, выводит сообщение в зависимости от знака суммы.
 * 3. printColor() - проверяет значение переменной и выводит цвет: Красный, Желтый, Зеленый.
 * 4. compareNumbers() - инициализирует и сравнивает две переменные, выводит сообщение о результате сравнения.
 *
 * В методе main() происходит вызов всех описанных методов для проверки их корректной работы.
 * Можно менять значения переменных и условия для тестирования различных сценариев.
 */
public class HomeWorkApp {
    public static void main(String[] args) {
        // Вызов метода printThreeWords()
        printThreeWords();

        // Вызов метода checkSumSign()
        checkSumSign();

        // Вызов метода printColor()
        printColor();

        // Вызов метода compareNumbers()
        compareNumbers();
    }

    // Метод для печати трех слов
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // Метод для проверки знака суммы двух чисел
    public static void checkSumSign() {
        // Инициализация переменных a и b
        int a = 10;
        int b = -5;

        // Сложение переменных a и b
        int sum = a + b;

        // Проверка знака суммы и вывод соответствующего сообщения
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // Метод для проверки цвета
    public static void printColor() {
        // Инициализация переменной value
        int value = 75;

        // Проверка значения переменной value и вывод соответствующего цвета
        if (value < 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // Метод для сравнения двух чисел
    public static void compareNumbers() {
        // Инициализация переменных a и b
        int a = 8;
        int b = 5;

        // Проверка условия и вывод соответствующего сообщения
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}

