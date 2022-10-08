package main.java.factories.botplayingstrategyfactory;

import main.java.models.BotDifficultyLevel;
import main.java.strategies.botplayingstrategies.BotPlayingStrategy;
import main.java.strategies.botplayingstrategies.RandomBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public BotPlayingStrategy createBotPlayingStrategyForDifficultyLevel(BotDifficultyLevel difficultyLevel)
    {
        return switch(difficultyLevel)
                {
                    case EASY , MEDIUM , HARD -> new RandomBotPlayingStrategy();
                };
    }
}
