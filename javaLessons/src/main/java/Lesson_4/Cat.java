package Lesson_4;

public class Cat extends Animal {
    private boolean isHungry; // Поле, обозначающее, голоден ли кот
    private int foodAmount; // Количество еды в тарелке

    public Cat(String name, int runLimit, int swimLimit, int foodAmount) {
        super(name, runLimit, swimLimit);
        this.isHungry = true; // При создании кота он всегда голоден
        this.foodAmount = foodAmount; // Устанавливаем начальное количество еды в тарелке
    }

    // Метод, позволяющий коту поесть из тарелки
    public boolean eat(int foodAmount) {
        if (foodAmount >= 0 && foodAmount <= this.foodAmount) { // Проверяем, достаточно ли еды в тарелке
            isHungry = false; // Если хватило еды, кот становится сытым
            this.foodAmount -= foodAmount; // Уменьшаем количество еды в тарелке
            return true;
        } else {
            return false; // Если еды не хватило или еда отрицательная, кот остается голодным
        }
    }

    // Метод для проверки состояния голода кота
    public boolean isHungry() {
        return isHungry;
    }

    // Метод для добавления еды в тарелку
    public void addFood(int foodAmount) {
        if (foodAmount > 0) {
            this.foodAmount += foodAmount; // Добавляем еду в тарелку
            System.out.println("Добавлено " + foodAmount + " еды в тарелку");
        } else {
            System.out.println("Неверное количество еды");
        }
    }

    // Метод для получения имени кота
    public String getName() {
        return name;
    }
}
