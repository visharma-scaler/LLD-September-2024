package scaler.lld3.tictactoe.models;

public class Player {
    private Long id;
    private String name;
    private Symbol symbol;
    private PlayerType type;

    public Player(Long id, String name, Symbol symbol, PlayerType type) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public PlayerType getType() {
        return type;
    }
}
