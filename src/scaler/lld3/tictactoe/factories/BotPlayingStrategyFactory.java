package scaler.lld3.tictactoe.factories;

import scaler.lld3.tictactoe.models.BotDifficultyLevel;
import scaler.lld3.tictactoe.strategies.botplayingstrategies.BotPlayingStrategy;
import scaler.lld3.tictactoe.strategies.botplayingstrategies.EasyBotPlayingStrategy;
import scaler.lld3.tictactoe.strategies.botplayingstrategies.HardBotPlayingStrategy;
import scaler.lld3.tictactoe.strategies.botplayingstrategies.MediumBotPlayingStrategy;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategyBasedOnDifficultyLevel(BotDifficultyLevel level) {
        return switch (level) {
            case EASY -> new EasyBotPlayingStrategy();
            case MEDIUM -> new MediumBotPlayingStrategy();
            case HARD -> new HardBotPlayingStrategy();
        };
    }
}
