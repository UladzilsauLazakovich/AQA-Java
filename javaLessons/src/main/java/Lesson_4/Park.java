package Lesson_4;

public class Park {
    private List<Attraction> attractions;

    public Park() {
        attractions = new ArrayList<>();
    }

    public void addAttraction(Attraction attraction) {
        attractions.add(attraction);
    }

    public void printAttractions() {
        System.out.println("Аттракционы в парке:");
        for (Attraction attraction : attractions) {
            System.out.println(attraction);
        }
    }

    public static class Attraction {
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
            return name + " (работает " + workingHours + ", стоимость " + price + " руб.)";
        }
    }
}

