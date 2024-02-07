package Lesson_4;

import java.util.ArrayList;
import java.util.List;

public class Park {

    // Внутренний класс для представления аттракциона
    private class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Attraction: " + name + ", Working Hours: " + workingHours + ", Price: $" + price;
        }
    }

    private List<Attraction> attractions;

    public Park() {
        attractions = new ArrayList<>();
    }

    // Метод для добавления аттракциона в парк
    public void addAttraction(String name, String workingHours, double price) {
        attractions.add(new Attraction(name, workingHours, price));
    }

    // Метод для отображения списка аттракционов
    public void displayAttractions() {
        System.out.println("Attractions in the park:");
        for (Attraction attraction : attractions) {
            System.out.println(attraction);
        }
    }

    public static void main(String[] args) {
        Park park = new Park();

        // Добавляем аттракции в парк
        park.addAttraction("Roller Coaster", "9:00 AM - 8:00 PM", 25.99);
        park.addAttraction("Ferris Wheel", "10:00 AM - 9:00 PM", 15.99);
        park.addAttraction("Carousel", "11:00 AM - 7:00 PM", 10.99);

        // Отображаем список аттракций в парке
        park.displayAttractions();
    }
}

