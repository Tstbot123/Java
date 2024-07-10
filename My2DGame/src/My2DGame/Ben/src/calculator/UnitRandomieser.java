package calculator;

import java.util.Random;

public class UnitRandomieser  
{
    public static int even1;
    public static int even2;
    public static int even3;
    public static int even4;
    public static int odd1;
    public static int odd2;
    public static int odd3;
    public static int odd4;

    public static void Generate()
     {
        Random rand = new Random();
        // Generiere 4 gerade Zahlen // 20, 22, 24, 26, 28, 30, 32, 34
        int i = 0;
        do
        {
            even1 = 20 + 2 * rand.nextInt(8); 
            even2 = 20 + 2 * rand.nextInt(8);
            even3 = 20 + 2 * rand.nextInt(8);
            even4 = 20 + 2 * rand.nextInt(8);
            // Generiere 4 ungerade Zahlen // 21, 23, 25, 27, 29, 31, 33, 35
            odd1 = even1 + 1;                 
            odd2 = even2 + 1;
            odd3 = even3 + 1;
            odd4 = even4 + 1;
            
            
            
        } while (i < 1);
     }
}



