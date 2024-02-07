package Lesson_4;

import java.util.ArrayList;
import java.util.List;

public class Payment {

    // Внутренний класс для представления товара
    private class Item {
        private String name;
        private double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return name + " - $" + price;
        }
    }

    private List<Item> items;

    public Payment() {
        items = new ArrayList<>();
    }

    // Метод для добавления товара в список покупок
    public void addItem(String name, double price) {
        items.add(new Item(name, price));
    }

    // Метод для расчета общей суммы покупки
    public double getTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    // Метод для отображения списка покупок
    public void displayItems() {
        System.out.println("Items in the cart:");
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Payment payment = new Payment();

        // Добавляем товары в корзину
        payment.addItem("Product 1", 10.99);
        payment.addItem("Product 2", 5.49);
        payment.addItem("Product 3", 2.99);

        // Отображаем список товаров
        payment.displayItems();

        // Выводим общую сумму покупки
        System.out.println("Total: $" + payment.getTotal());
    }
}

