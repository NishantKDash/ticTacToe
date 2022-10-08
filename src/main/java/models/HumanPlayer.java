package main.java.models;

import java.util.Scanner;

public class HumanPlayer extends Player {


    public HumanPlayer(Symbol symbol , User user)

    {
        super(PlayerType.Human , symbol , user);

    }

    @Override
    public Move makeMove(Board board) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Tell row number where you want to make a move");
        int row  = obj.nextInt();

        System.out.println("Tell the column number where you want to make a move");
        int column = obj.nextInt();

        Move move = new Move();
        move.setCell(board.getCell(row - 1 , column -1 ));
        move.setPlayer(this);
        move.setSymbol(this.getSymbol());
        return move;
    }


}
