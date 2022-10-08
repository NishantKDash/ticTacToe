package main.java.models;

public class Cell {
    private int row;
    private int column;
    private Symbol symbol = null;

    public int getRow()
    {
        return row;
    }
     public int getColumn()
    {
        return column;
    }

    public Symbol getSymbol()
    {
        return symbol;
    }

    public void setSymbol(Symbol symbol)
    {
        this.symbol = symbol;
    }
    public void SetSymbol(Symbol symbol)
    {
        this.symbol = symbol;
    }
    public void clearCell()
    {
        this.symbol = new Symbol(' ');
    }
    public boolean isEmpty(){
        if(this.symbol == null)
            return true;
        else
            return false;
    }
}
