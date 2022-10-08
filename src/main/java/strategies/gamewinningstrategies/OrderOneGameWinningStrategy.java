package main.java.strategies.gamewinningstrategies;

import main.java.models.Board;
import main.java.models.Cell;
import main.java.models.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderOneGameWinningStrategy implements GameWinningStrategy {

    private List<HashMap<Character , Integer>> rowchar;
    private List<HashMap<Character ,Integer>> colchar;


    private void initialize(Board board)
    {
        rowchar = new ArrayList<>();
        colchar = new ArrayList<>();

        for(int i = 0;i<board.getDimension();i++)
        {
            rowchar.add(new HashMap<>());
            colchar.add(new HashMap<>());
        }

    }

    @Override
    public boolean checkIfWon(Board board, Player player , Cell cell){

           if(rowchar == null)
            initialize(board);

            int row = cell.getRow();
            int col = cell.getColumn();

            if(!rowchar.get(row).containsKey(cell.getSymbol().getCharacter()))
            {
                rowchar.get(row).put(cell.getSymbol().getCharacter(), 0);
            }

            if(!colchar.get(col).containsKey(cell.getSymbol().getCharacter()))
            {
                colchar.get(col).put(cell.getSymbol().getCharacter(), 0);
            }

            rowchar.get(row).put(cell.getSymbol().getCharacter(), rowchar.get(row).get(cell.getSymbol().getCharacter()) + 1);
            colchar.get(col).put(cell.getSymbol().getCharacter(), colchar.get(col).get(cell.getSymbol().getCharacter()) + 1);

            if(rowchar.get(row).get(cell.getSymbol().getCharacter()).equals(board.getDimension()) || colchar.get(col).get(cell.getSymbol().getCharacter()).equals(board.getDimension()))
                return true;

            return false;
    }
}
