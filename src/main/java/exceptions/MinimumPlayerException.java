package main.java.exceptions;

public class MinimumPlayerException extends Exception{
    public MinimumPlayerException()
    {
        super("A game has to have a minimum of two players");
    }
}
