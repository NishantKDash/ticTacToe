package main.java.controllers;

import main.java.exceptions.EmptyMovesUndoOperationException;
import main.java.models.Board;
import main.java.models.Game;
import main.java.models.GameStatus;
import main.java.models.Player;
import main.java.strategies.gamewinningstrategies.GameWinningStrategy;

import java.util.List;

public class GameController {
    public Game createGame(int dimension , List<Player> players , List<GameWinningStrategy> strategies)
    {
        Game game = null;
        try {
            game = Game.create().setDimension(dimension)
                    .addPlayers(players)
                    .addGameWinningStrategies(strategies)
                    .build();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }


        return game;
    }

    public void makeMove(Game game)
    {
        game.makeMove();
    }

    public boolean undo(Game game) throws EmptyMovesUndoOperationException {
        return game.undo();
    }

    public Player getWinner(Game game)
    {
        return game.getWinner();
    }

    public GameStatus getGameStatus(Game game)
    {
        return game.getGameStatus();
    }

    public void display (Game game)
    {
        game.getBoard().printBoard();
    }
}
