package main.java.models;

public class Move {
    private Symbol symbol;
    private Cell cell;
    private Player player;

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }



    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Cell getCell(){
        return cell;
    }
}
