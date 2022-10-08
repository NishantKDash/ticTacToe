package main.java.strategies.botplayingstrategies;

import main.java.models.*;

public class RandomBotPlayingStrategy implements BotPlayingStrategy{
    public Move makeNextMove(Board board , Player player)
    {
        for(int i = 0;i<board.getBoard().size();i++)
        {
            for(int j = 0;j<board.getBoard().get(i).size();j++)
            {
                if(board.getBoard().get(i).get(j).isEmpty())
                {
                      Move move = new Move();
                      move.setCell(board.getBoard().get(i).get(j));
                      move.setSymbol(player.getSymbol());
                      move.setPlayer(player);
                      return move;
                }
            }
        }
        return null;
    }
}
