package Calculator;

import Feld.Spielfeld;
import Feld.Feld.Type;
import Units.Unit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoveCalculator {

    public static List<int[]> calculatePossibleMoves(Unit unit, Spielfeld spielfeld) {
        List<int[]> possibleMoves = new ArrayList<>();
        int movePoints = unit.getMove();
        int startX = unit.getPosition()[0];
        int startY = unit.getPosition()[1];

        Map<Type, Integer> movementCosts = getMovementCosts(unit);

        for (int x = startX - movePoints; x <= startX + movePoints; x++) {
            for (int y = startY - movePoints; y <= startY + movePoints; y++) {
                if (x >= 0 && y >= 0 && x < spielfeld.getWidth() && y < spielfeld.getHeight()) {
                    int cost = calculateCostToMove(unit, startX, startY, x, y, spielfeld, movementCosts);
                    if (cost <= movePoints) {
                        possibleMoves.add(new int[]{x, y});
                    }
                }
            }
        }
        return possibleMoves;
    }

    private static int calculateCostToMove(Unit unit, int startX, int startY, int targetX, int targetY, Spielfeld spielfeld, Map<Type, Integer> movementCosts) {
        int cost = 0;
        int deltaX = Math.abs(targetX - startX);
        int deltaY = Math.abs(targetY - startY);

        int steps = Math.max(deltaX, deltaY);
        for (int i = 0; i < steps; i++) {
            int x = startX + i * Integer.signum(targetX - startX);
            int y = startY + i * Integer.signum(targetY - startY);
            Type terrainType = spielfeld.getFeld(x, y).getType();
            cost += movementCosts.getOrDefault(terrainType, Integer.MAX_VALUE);
        }
        return cost;
    }

    private static Map<Type, Integer> getMovementCosts(Unit unit) {
        Map<Type, Integer> movementCosts = new HashMap<>();
        movementCosts.put(Type.PLAIN, unit.getMovementCost(Type.PLAIN));
        movementCosts.put(Type.WOOD, unit.getMovementCost(Type.WOOD));
        movementCosts.put(Type.MOUNTAIN, unit.getMovementCost(Type.MOUNTAIN));
        movementCosts.put(Type.SEA, unit.getMovementCost(Type.SEA));
        return movementCosts;
    }
}

