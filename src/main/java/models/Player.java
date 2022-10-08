package main.java.models;

public abstract class Player {
    private PlayerType playerType;
    private User user;
    private Symbol symbol;
    private String name;

    Player(PlayerType playerType , Symbol symbol)
    {
        this.playerType = playerType;
        this.symbol = symbol;
    }

    Player(PlayerType playerType , Symbol symbol , User user)
    {
        this.playerType = playerType;
        this.symbol = symbol;
        this.user = user;
    }

    public PlayerType getPlayerType()
    {
        return this.playerType;
    }
    public Symbol getSymbol(){
        return this.symbol;
    }

    public User getUser()
    {
        return this.user;
    }
    public abstract Move makeMove(Board board);
}
