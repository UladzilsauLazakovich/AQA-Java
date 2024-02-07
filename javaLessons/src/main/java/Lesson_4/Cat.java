package Lesson_4;

public class Cat extends Animal {
    private boolean isHungry; // Поле, обозначающее, голоден ли кот

    public Cat(String name, int runLimit, int swimLimit) {
        super(name, runLimit, swimLimit);
        this.isHungry = true; // При создании кота он всегда голоден
    }

    public boolean eat(int foodAmount) {
        if (foodAmount >= 0) { // Проверка, чтобы еда не была отрицательной
            isHungry = false; // Если хватило еды, кот становится сытым
            return true;
        } else {
            return false; // Если еды не хватило, кот остается голодным
        }
    }

    public boolean isHungry() {
        return isHungry;
    }
}
