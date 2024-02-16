package Lesson_4;

public class Animal {
    // статическая переменная для подсчета созданных животных
    private static int count;

    // поля класса Animal
    protected String name;
    protected int runLimit;
    protected int swimLimit;

    // конструктор класса Animal
    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        count++; // увеличиваем счетчик при создании нового животного
    }

    // метод для получения количества созданных животных
    public static int getCount() {
        return count;
    }

    // метод бега
    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    // метод плавания
    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м.");
        }
    }
}
