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


}
