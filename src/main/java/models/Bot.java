package main.java.models;

import main.java.factories.botplayingstrategyfactory.BotPlayingStrategyFactory;
import main.java.strategies.botplayingstrategies.BotPlayingStrategy;

public class Bot extends Player{

    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;
    public Bot(Symbol symbol , BotDifficultyLevel botDifficultyLevel)
    {
        super(PlayerType.BOT , symbol);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = new BotPlayingStrategyFactory()
                .createBotPlayingStrategyForDifficultyLevel(botDifficultyLevel);
    }

    @Override
    public Move makeMove(Board board) {
    Move move = this.botPlayingStrategy.makeNextMove(board , this);
    return move;
    }

}
