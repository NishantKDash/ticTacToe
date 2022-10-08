package main.java.exceptions;

public class EmptyMovesUndoOperationException extends Exception {
    public EmptyMovesUndoOperationException()
    {
        super("Undo operation was called when no moves existed");
    }
}
