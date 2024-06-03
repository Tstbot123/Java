import Field.GameField;
import Units.LandUnits.*;
import Units.AirUnits.*;
import Models.Model;
import Utils.ModelConfig;
import Calculator.MoveCalculator;
import Calculator.VisionCalculator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize the game field
        GameField gameField = new GameField(10, 10);

        // Load model paths from properties file
        ModelConfig modelConfig = new ModelConfig("models.properties");

        // Initialize models with graphic paths
        Model infantryModel = new Model(modelConfig.getModelPath("infantry.path"));
        Model mechModel = new Model(modelConfig.getModelPath("mech.path"));
        Model tankModel = new Model(modelConfig.getModelPath("tank.path"));
        Model artilleryModel = new Model(modelConfig.getModelPath("artillery.path"));
        Model antiAirModel = new Model(modelConfig.getModelPath("anti_air.path"));
        Model fighterModel = new Model(modelConfig.getModelPath("fighter.path"));
        Model bomberModel = new Model(modelConfig.getModelPath("bomber.path"));
        Model commandoModel = new Model(modelConfig.getModelPath("commando.path"));

        // Create units
        Infantry infantry = new Infantry(infantryModel, 0, 0, gameField);
        Mech mech = new Mech(mechModel, 1, 0, gameField);
        Tank tank = new Tank(tankModel, 2, 0, gameField);
        Artillery artillery = new Artillery(artilleryModel, 3, 0, gameField);
        AntiAir antiAir = new AntiAir(antiAirModel, 4, 0, gameField);
        Fighter fighter = new Fighter(fighterModel, 5, 0, gameField);
        Bomber bomber = new Bomber(bomberModel, 6, 0, gameField);
        Commando commando = new Commando(commandoModel, 7, 0, gameField);

        // Calculate possible moves for a unit
        List<int[]> possibleMoves = MoveCalculator.calculatePossibleMoves(infantry, gameField);
        System.out.println("Possible moves for Infantry: " + possibleMoves);

        // Calculate vision for a unit
        int vision = VisionCalculator.calculateVision(infantry, gameField);
        System.out.println("Vision for Infantry: " + vision);
    }
}

