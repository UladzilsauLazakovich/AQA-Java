package Lesson_5;

import java.util.ArrayList;
import java.util.List;

class Fruit {}

class Apple extends Fruit {}

class Orange extends Fruit {}

class Box<T extends Fruit> {
    private List<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : fruits) {
            // Предполагаем, что вес каждого фрукта равен 1.0f для яблок и 1.5f для апельсинов
            if (fruit instanceof Apple) {
                weight += 1.0f;
            } else if (fruit instanceof Orange) {
                weight += 1.5f;
            }
        }
        return weight;
    }

    public boolean compare(Box<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001; // Сравниваем массы с некоторой погрешностью
    }

    public void transferToAnotherBox(Box<T> anotherBox) {
        if (this == anotherBox) {
            return; // Нельзя пересыпать фрукты из коробки в себя же
        }
        for (T fruit : fruits) {
            anotherBox.addFruit(fruit);
        }
        fruits.clear(); // Очищаем текущую коробку после пересыпания фруктов
    }
}