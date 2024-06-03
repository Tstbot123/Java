import Feld.Spielfeld;
import Units.Landeinheiten.*;
import Units.Flugeinheiten.*;
import Models.Model;
import Utils.ModelConfig;
import Calculator.MoveCalculator;
import Calculator.VisionCalculator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize the game field
        Spielfeld spielfeld = new Spielfeld(10, 10);

        // Load model paths from properties file
        ModelConfig modelConfig = new ModelConfig("models.properties");

        // Initialize models with graphic paths
        Model infantryModel = new Model(modelConfig.getModelPath("infantry.path"));
        Model mechModel = new Model(modelConfig.getModelPath("mech.path"));
        Model tankModel = new Model(modelConfig.getModelPath("tank.path"));
        Model artlyModel = new Model(modelConfig.getModelPath("artly.path"));
        Model aAirModel = new Model(modelConfig.getModelPath("a_air.path"));
        Model fighterModel = new Model(modelConfig.getModelPath("fighter.path"));
        Model bomberModel = new Model(modelConfig.getModelPath("bomber.path"));
        Model bCptrModel = new Model(modelConfig.getModelPath("b_cptr.path"));

        // Create units
        Infantry infantry = new Infantry(infantryModel, 0, 0, spielfeld);
        Mech mech = new Mech(mechModel, 1, 0, spielfeld);
        Tank tank = new Tank(tankModel, 2, 0, spielfeld);
        Artly artly = new Artly(artlyModel, 3, 0, spielfeld);
        A_Air aAir = new A_Air(aAirModel, 4, 0, spielfeld);
        Fighter fighter = new Fighter(fighterModel, 5, 0, spielfeld);
        Bomber bomber = new Bomber(bomberModel, 6, 0, spielfeld);
        BCptr bCptr = new BCptr(bCptrModel, 7, 0, spielfeld);

        // Calculate possible moves for a unit
        List<int[]> possibleMoves = MoveCalculator.calculatePossibleMoves(infantry, spielfeld);
        System.out.println("Possible moves for Infantry: " + possibleMoves);

        // Calculate vision for a unit
        int vision = VisionCalculator.calculateVision(infantry, spielfeld);
        System.out.println("Vision for Infantry: " + vision);
    }
}

