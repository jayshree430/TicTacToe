import java.util.ArrayList;
import java.util.List;

public class TicTac {

    private String[][] board = new String[][]{{" ", " ", " "},
            {" ", " ", " "},
            {" ", " ", " "}};

    public boolean playMove(int x, int y, String player){
        // Check the move is allowed
        if (x > 2 || x < 0 || y > 2 || y < 0) {
            //Move not allowed
            return false;
        }
        if (board[x][y].equals(" ")) {
            board[x][y] = player;
            return true;
        }
        return false;
    }
    public boolean checkPlayerWon(String player) {

        int topRow = 0;

        for (int i = 0; i < board.length; i++) {
            if (board[0][i].equals(player)) topRow++;
        }
        return topRow == 3 ;
    }
}
