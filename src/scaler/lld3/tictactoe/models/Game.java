package scaler.lld3.tictactoe.models;

import scaler.lld3.tictactoe.strategies.winningstrategies.WinningStrategy;

import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private Player winner;
    private GameState state;
    private int nextPlayerMoveIndex;
    private List<WinningStrategy> winningStrategies;
}
