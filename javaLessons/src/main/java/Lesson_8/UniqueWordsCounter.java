package Lesson_8;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordsCounter {

    public static void main(String[] args) {
        String[] wordsArray = {"apple", "banana", "apple", "orange", "banana", "grape", "apple", "mango", "mango",
                "apple", "orange", "banana", "grape", "apple", "mango", "mango", "banana", "grape", "apple"};

        // Создаем карту для хранения уникальных слов и их количества
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Подсчитываем количество каждого слова в массиве
        for (String word : wordsArray) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Выводим список уникальных слов и их количество
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println("Слово: " + entry.getKey() + ", Количество: " + entry.getValue());
        }
    }
}
