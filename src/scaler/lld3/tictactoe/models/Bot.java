package scaler.lld3.tictactoe.models;

import scaler.lld3.tictactoe.strategies.botplayingstrategies.BotPlayingStrategy;

public class Bot extends Player {
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }
}
