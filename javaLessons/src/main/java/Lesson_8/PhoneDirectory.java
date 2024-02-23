package Lesson_8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneDirectory {

    private Map<String, Set<String>> directory;

    public PhoneDirectory() {
        this.directory = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        Set<String> phones = directory.getOrDefault(lastName, new HashSet<>());
        phones.add(phoneNumber);
        directory.put(lastName, phones);
    }

    public Set<String> get(String lastName) {
        return directory.getOrDefault(lastName, new HashSet<>());
    }

    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        // Добавляем записи в телефонный справочник
        phoneDirectory.add("Иванов", "123456789");
        phoneDirectory.add("Петров", "987654321");
        phoneDirectory.add("Иванов", "987654321");
        phoneDirectory.add("Сидоров", "555555555");
        phoneDirectory.add("Сидоров", "111111111");
        phoneDirectory.add("Сидоров", "222222222");
        phoneDirectory.add("Сидоров", "333333333");
        phoneDirectory.add("Сидоров", "444444444");
        phoneDirectory.add("Сидоров", "555555555");
        phoneDirectory.add("Иванов", "666666666");
        phoneDirectory.add("Сидоров", "777777777");
        phoneDirectory.add("Петров", "888887888");
        phoneDirectory.add("Сидоров", "999999999");
        phoneDirectory.add("Сидоров", "000000000");

        // Получаем номера телефонов по фамилии
        System.out.println("Номера телефонов для фамилии Иванов: " + phoneDirectory.get("Иванов"));
        System.out.println("Номера телефонов для фамилии Петров: " + phoneDirectory.get("Петров"));
        System.out.println("Номера телефонов для фамилии Сидоров: " + phoneDirectory.get("Сидоров"));
        System.out.println("Номера телефонов для фамилии Новиков: " + phoneDirectory.get("Новиков"));
    }
}
