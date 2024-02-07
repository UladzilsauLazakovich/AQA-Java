package Lesson_4;

public class CatDemo {
    public static void main(String[] args) {
        // Создаем объекты котов
        Cat cat1 = new Cat("Barsik", 200, 0);
        Cat cat2 = new Cat("Murzik", 170, 0);

        // Выводим информацию о котах
        System.out.println("Информация о котах:");
        System.out.println(cat1.name + ": Максимальная дистанция бега - " + cat1.runLimit + " м, Максимальная дистанция плавания - " + cat1.swimLimit + " м");
        System.out.println(cat2.name + ": Максимальная дистанция бега - " + cat2.runLimit + " м, Максимальная дистанция плавания - " + cat2.swimLimit + " м");

        // Проверяем, голоден ли кот
        System.out.println("Кот " + cat1.name + " голоден: " + cat1.isHungry());
        System.out.println("Кот " + cat2.name + " голоден: " + cat2.isHungry());

        // Кормим котов
        cat1.eat(100);
        cat2.eat(-50); // Попытка съесть отрицательное количество еды

        // Проверяем, голоден ли кот после кормежки
        System.out.println("Кот " + cat1.name + " голоден после кормежки: " + cat1.isHungry());
        System.out.println("Кот " + cat2.name + " голоден после кормежки: " + cat2.isHungry());
    }
}
