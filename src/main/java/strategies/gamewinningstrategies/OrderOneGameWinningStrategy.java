package main.java.strategies.gamewinningstrategies;

import main.java.models.Board;
import main.java.models.Cell;
import main.java.models.Player;

public class OrderOneGameWinningStrategy implements GameWinningStrategy {


    @Override
    public boolean checkIfWon(Board board, Player player){
        return false;
    }
}
