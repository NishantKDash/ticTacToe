package main.java.strategies.gamewinningstrategies;

import main.java.models.Board;
import main.java.models.Cell;
import main.java.models.Player;

public interface GameWinningStrategy {
    boolean checkIfWon(Board board , Player player);
}
