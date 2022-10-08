package main.java.models;

public abstract class Player {
    private PlayerType playerType;
    private Symbol symbol;
    private String name;

    Player(PlayerType playerType , Symbol symbol)
    {
        this.playerType = playerType;
        this.symbol = symbol;
    }

    public PlayerType getPlayerType()
    {
        return this.playerType;
    }
    public Symbol getSymbol(){
        return this.symbol;
    }
}
