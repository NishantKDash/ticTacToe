package main.java.models;

import main.java.exceptions.MinimumPlayerException;
import main.java.exceptions.MinimumWinningStrategyException;
import main.java.exceptions.MultipleBotsException;
import main.java.strategies.gamewinningstrategies.GameWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;
    private Board board;
    private List<Move> moves;
    private List<GameWinningStrategy> gameWinningStrategies;
    private int lastMovedPlayerIndex;
    private GameStatus gameStatus;
    private Player winner;

    private Game(){
        this.players = new ArrayList<>();
        this.moves = new ArrayList<>();
        this.gameWinningStrategies = new ArrayList<>();
        this.lastMovedPlayerIndex = -1;
        this.gameStatus = GameStatus.IN_PROGRESS;
    }

    public static Builder create()
    {
        return new Builder();
    }

    public static class Builder {
        private List<Player> players;
        //private Board board;
        // I will just take the dimension from the client not the board. After that we will create the board.

        private int dimension;
        //private List<Move> moves;
        private List<GameWinningStrategy> gameWinningStrategies;
        //private int lastMovedPlayerIndex;
        //private GameStatus gameStatus;
        //private Player player;


        Builder (){
            this.players = new ArrayList<>();
            this.gameWinningStrategies = new ArrayList<>();
        }

        //When we have a list of player , we dont want a list, we will add players one by one.

        public Builder addPlayer(Player player)
        {
            this.players.add(player);
            return this;
        }

        public Builder setDimension(int dimension)
        {
            this.dimension = dimension;
            return this;
        }

        public Builder addGameWinningStrategy(GameWinningStrategy strategy)
        {
            this.gameWinningStrategies.add(strategy);
            return this;
        }

        //Now perform some checks that are required for the game to run properly

        private boolean checkIfSingleBotMax()
        {
            int count = 0;
            for(Player player: players)
                if(player.getPlayerType().equals(PlayerType.BOT))
                    count++;

            return count <= 1;
        }

        public Game build() throws MultipleBotsException , MinimumPlayerException , MinimumWinningStrategyException {
            if(!checkIfSingleBotMax())
            {
                throw new MultipleBotsException();
            }

            if(players.size() < 2)
            {
                throw new MinimumPlayerException();
            }

            if(gameWinningStrategies.size() < 1)
            {
                throw new MinimumWinningStrategyException();
            }
           Game game = new Game();
            game.players.addAll(this.players);
            game.gameWinningStrategies.addAll(this.gameWinningStrategies);
            game.board = new Board(dimension);
            //we dont need a factory to create a board as it is just a board class
            return game;
        }
    }
}
