/*package calculator;

import java.util.Random;

public class RandomUnits {
    


    
    public static void main(String[] args) {
        Random random = new Random();

        // Generiere gerade Zahlen zwischen 20 und 34
        int unit1Red = generateRandomEven(20, 34, random);
        int unit2Red = generateRandomEven(20, 34, random);
        int unit3Red = generateRandomEven(20, 34, random);
        int unit4Red = generateRandomEven(20, 34, random);

        // Generiere ungerade Zahlen größer als 35
        int unit1Blue = generateRandomOdd(20, 34, random);
        int unit2Blue = generateRandomOdd(20, 34, random);
        int unit3Blue = generateRandomOdd(20, 34, random);
        int unit4Blue = generateRandomOdd(20, 34, random);
    }

    public static int generateRandomEven(int min, int max, Random random) {
        int range = (max - min) / 2 + 1;
        return min + 2 * random.nextInt(range);
    }

    public static int generateRandomOdd(int min, int max, Random random) {
        int range = (max - min + 1) / 2;
        return min + 2 * random.nextInt(range);
    }
}
*/ 
package calculator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RandomUnitGenerator {
    public static void main(String[] args) {
        Random random = new Random();

        // Generiere gerade Zahlen zwischen 20 und 34
        int unit1Red = generateRandomEven(20, 34, random);
        int unit2Red = generateRandomEven(20, 34, random);
        int unit3Red = generateRandomEven(20, 34, random);
        int unit4Red = generateRandomEven(20, 34, random);

        // Generiere ungerade Zahlen größer als 35
        int unit1Blue = generateRandomOdd(36, 50, random);
        int unit2Blue = generateRandomOdd(36, 50, random);
        int unit3Blue = generateRandomOdd(36, 50, random);
        int unit4Blue = generateRandomOdd(36, 50, random);

        // Speichern der Variablen in einer Datei
        try (FileWriter writer = new FileWriter("random_numbers.txt")) {
            writer.write(unit1Red + "\n");
            writer.write(unit2Red + "\n");
            writer.write(unit3Red + "\n");
            writer.write(unit4Red + "\n");
            writer.write(unit1Blue + "\n");
            writer.write(unit2Blue + "\n");
            writer.write(unit3Blue + "\n");
            writer.write(unit4Blue + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Zahlen wurden in die Datei 'random_numbers.txt' geschrieben.");
    }

    private static int generateRandomEven(int min, int max, Random random) {
        int range = (max - min) / 2 + 1;
        return min + 2 * random.nextInt(range);
    }

    private static int generateRandomOdd(int min, int max, Random random) {
        int range = (max - min + 1) / 2;
        return min + 2 * random.nextInt(range);
    }
}
