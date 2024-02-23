package Lesson_7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvDataLoader {

    public static AppData load(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        // Читаем заголовок
        String headerLine = reader.readLine();
        String[] header = headerLine.split(";");

        // Читаем данные
        List<int[]> dataList = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            String[] rowValues = line.split(";");
            int[] rowData = new int[rowValues.length];
            for (int i = 0; i < rowValues.length; i++) {
                rowData[i] = Integer.parseInt(rowValues[i]);
            }
            dataList.add(rowData);
        }

        reader.close();

        // Преобразуем List в массив
        int[][] data = dataList.toArray(new int[0][0]);

        return new AppData(header, data);
    }
}
