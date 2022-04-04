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
        int middleRow = 0;
        int bottomRow = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[0][i].equals(player)) topRow++;
            if (board[1][i].equals(player)) middleRow++;
            if (board[2][i].equals(player)) bottomRow++;
        }
        // Vertical
        int leftColumn = 0;
        int middleColumn = 0;
        int rightColumn = 0;
        for (String[] strings : board) {
            if (strings[0].equals(player)) leftColumn++;
            if (strings[1].equals(player)) middleColumn++;
            if (strings[2].equals(player)) rightColumn++;
        }
        return topRow == 3 || middleRow == 3 || bottomRow == 3 ||
                leftColumn == 3 || middleColumn == 3 || rightColumn == 3;
    }
}
