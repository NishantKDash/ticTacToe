package main.java.exceptions;

public class MinimumWinningStrategyException extends Exception {
    public MinimumWinningStrategyException()
    {
        super("There should be minimum of 1 winning strategy");
    }
}
