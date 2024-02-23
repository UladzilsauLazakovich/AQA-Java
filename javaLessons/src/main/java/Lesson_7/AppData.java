package Lesson_7;

import java.util.Arrays;

public class AppData {

    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Arrays.toString(header)).append("\n");
        for (int[] rowData : data) {
            stringBuilder.append(Arrays.toString(rowData)).append("\n");
        }
        return stringBuilder.toString();
    }
}
