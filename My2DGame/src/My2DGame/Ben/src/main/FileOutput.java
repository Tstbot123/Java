package main;


    

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutput {

    public static void writeCoordinatesToFile(String filePath, int[][] coordinates) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (int i = 0; i < coordinates.length; i++) {
                int x = coordinates[i][0];
                int y = coordinates[i][1];
                int value = coordinates[i][2];
                writer.write("x" + x + "_y" + y + " = " + value);
                writer.newLine();
            }
            System.out.println("Data has been written to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Beispielwerte für x, y und Value
        int[][] coordinates = {
                {0, 0, 0},
                {1, 0, 0},
                {2, 0, 0},
                {3, 0, 0},
                {4, 0, 0},
                {5, 0, 0},
                {6, 0, 0},
                {7, 0, 0},
                {8, 0, 0},
                {9, 0, 0},
                {10, 0, 0},
                {11, 0, 0},
                {12, 0, 0},
                {13, 2, 2},
                {14, 2, 2},
                {15, 2, 2},
                {16, 2, 2},
                {17, 2, 2},
                {18, 0, 0}
        };

        // Passe den Dateipfad entsprechend deiner Umgebung an
        String filePath = "C:\\Users\\DeinBenutzername\\Dokumente\\output.txt";

        // Schreibe die Koordinaten in die Datei
        writeCoordinatesToFile(filePath, coordinates);
    }
}