package calculator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FindValueInFile {

    public static void main(String[] args) {
        // Dateiname der anderen Java-Datei
        String filePath = ""; 
        String searchText = "fieldType_x0_y0";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(searchText)) {
                    String[] parts = line.split("=");
                    if (parts.length > 1) {
                        String value = parts[1].trim().replace(";", "");
                        System.out.println("Der Wert ist: " + value);
                    } else {
                        System.out.println("Kein Wert gefunden.");
                    }
                    break; 
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}