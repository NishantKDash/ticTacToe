package main.java.exceptions;

public class MultipleBotsException extends Exception{
    public MultipleBotsException()
    {
        super("A game cannot have more than on bot players");
    }
}
