package main.java.strategies.botplayingstrategies;

import main.java.models.Board;
import main.java.models.Move;
import main.java.models.Player;
import main.java.models.Symbol;

public interface BotPlayingStrategy {
    Move makeNextMove(Board board , Player player);
}
