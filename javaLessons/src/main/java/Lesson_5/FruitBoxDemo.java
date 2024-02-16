package Lesson_5;

public class FruitBoxDemo {
    public static void main(String[] args) {
        // Пример использования
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        // Вес коробок
        System.out.println("Weight of appleBox1: " + appleBox1.getWeight()); // Вес яблок = 1.0 * количество яблок
        System.out.println("Weight of appleBox2: " + appleBox2.getWeight());
        System.out.println("Weight of orangeBox: " + orangeBox.getWeight()); // Вес апельсинов = 1.5 * количество апельсино

        // Сравнение коробок
        System.out.println("Are appleBox1 and appleBox2 equal in weight? " + appleBox1.compare(appleBox2));
        System.out.println("Are appleBox1 and orangeBox equal in weight? " + appleBox1.compare(orangeBox));

        // Пересыпание фруктов из одной коробки в другую
        System.out.println("Before transferring fruits: appleBox1 has " + appleBox1.getWeight() + " weight, and appleBox2 has " + appleBox2.getWeight());
        appleBox1.transferToAnotherBox(appleBox2);
        System.out.println("After transferring fruits: appleBox1 has " + appleBox1.getWeight() + " weight, and appleBox2 has " + appleBox2.getWeight());
    }
}
