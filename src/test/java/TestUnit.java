
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import frubana.stonePaperScissors.v1.Hand;
import frubana.stonePaperScissors.v1.Paper;
import frubana.stonePaperScissors.v1.Scissors;
import frubana.stonePaperScissors.v1.Stone;

public class TestUnit {

    @Test
    public void paperWinRock() {
        Hand aHand = new Hand( Paper.instance());
        Hand oHand = new Hand( Stone.instance());

        // assert statements
        assertTrue(aHand.winsTo(oHand));
      
    }

    @Test
    public void paperEqualPaper() {
       Hand aHand = new Hand( Paper.instance());
       Hand oHand = new Hand( Paper.instance());

        // assert statements
       assertFalse(aHand.winsTo(oHand));
       assertTrue(aHand.tied(oHand));

    }

    @Test
    public void paperLoseScissors() {
       Hand aHand = new Hand( Paper.instance());
       Hand oHand = new Hand( Scissors.instance());

        // assert statements
       assertFalse(aHand.winsTo(oHand));
       assertFalse(aHand.tied(oHand));

    }
    


}