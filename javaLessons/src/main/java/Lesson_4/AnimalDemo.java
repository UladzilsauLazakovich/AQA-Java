package Lesson_4;

public class AnimalDemo {
    public static void main(String[] args) {
        // Создаем несколько экземпляров класса Animal
        Animal dog = new Animal("Dog", 500, 10);
        Animal cat = new Animal("Cat", 200, 0);

        // Вызываем методы объектов для тестирования
        dog.run(400);
        dog.swim(5);

        cat.run(250);
        cat.swim(5);

        // Получаем количество созданных животных
        System.out.println("Количество созданных животных: " + Animal.getCount());
    }
}
