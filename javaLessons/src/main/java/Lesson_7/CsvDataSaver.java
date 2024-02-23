package Lesson_7;

import java.io.FileWriter;
import java.io.IOException;

public class CsvDataSaver {

    public static void save(AppData data, String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);

        // Записываем заголовок
        String[] header = data.getHeader();
        writer.write(String.join(";", header) + "\n");

        // Записываем данные
        int[][] dataMatrix = data.getData();
        for (int[] rowData : dataMatrix) {
            StringBuilder rowBuilder = new StringBuilder();
            for (int cellData : rowData) {
                rowBuilder.append(cellData).append(";");
            }
            writer.write(rowBuilder.toString().replaceAll(";$", "") + "\n");
        }

        writer.close();
    }
}
