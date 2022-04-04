import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class TicTacTest {
    TicTac ticTac;

    @BeforeEach
    public void setUp(){
        ticTac = new TicTac();
    }

    @Test
    public void checkSpaceNotOccupied(){
        Assertions.assertTrue(ticTac.playMove(1,1,"X"));
    }
    @Test
    public void checkSpaceIsOccupied(){
        ticTac.playMove(0,1,"O");
        Assertions.assertFalse(ticTac.playMove(0,1,"X"));
    }
    @Test
    public void checkInvalidXMove(){
        Assertions.assertFalse(ticTac.playMove(3,0,"O"));
    }

    @Test
    public void checkInvalidMinusXMove(){
        Assertions.assertFalse(ticTac.playMove(-1,2,"O"));
    }

    @Test
    public void checkInvalidYMove(){
        Assertions.assertFalse(ticTac.playMove(2,4,"O"));
    }

    @Test
    public void checkInvalidMinusYMove(){
        Assertions.assertFalse(ticTac.playMove(2,-2,"O"));
    }
    @Test
    public void checkWinnerIfRowTaken(){
        ticTac.playMove(0,0, "X");
        ticTac.playMove(0,1, "X");
        ticTac.playMove(0,2, "X");
        Assertions.assertTrue(ticTac.checkPlayerWon("X"));
    }

}
