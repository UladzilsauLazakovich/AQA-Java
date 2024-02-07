package Lesson_4;

public class CatDemo {
    public static void main(String[] args) {
        // Создаем объекты котов
        Cat[] cats = {
                new Cat("Барсик", 200, 0, 50), // Передаем количество еды в тарелке
                new Cat("Мурзик", 150, 0, 50),
                new Cat("Рыжик", 180, 0, 50)
        };
        // Создаем тарелку с едой
        Plate plate = new Plate(100);

        // Просим всех котов покушать из тарелки
        for (Cat cat : cats) {
            cat.eat(plate.getFood()); // Кот пытается поесть из тарелки
            System.out.println("Кот " + cat.getName() + " голоден: " + cat.isHungry()); // Выводим информацию о состоянии голода кота
        }

        // Добавляем еду в тарелку
        plate.addFood(50);
        System.out.println("Теперь в тарелке " + plate.getFood() + " еды");
    }
}
