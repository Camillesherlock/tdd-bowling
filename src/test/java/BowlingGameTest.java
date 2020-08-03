import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    @Test
    void getScoreWithOutTenPin(){
        //Given
         int score[][] = {{2,4},{6,2},{8,1},{3,6},{4,4},{5,2},{6,6},{1,1},{5,3},{8,1}};
        //When
        getScore scoreResult = new getScore();
        //Then
        assertEquals(scoreResult.getScoreOfBowing(score),78);

    }
    @Test
    void getScoreWithTenPin(){
        //Given
        int score[][] = {{10},{6,2},{8,1},{3,6},{4,4},{5,2},{6,6},{1,1},{5,3},{8,1}};
        //When
        getScore scoreResult = new getScore();
        //Then
        assertEquals(scoreResult.getScoreOfBowing(score),90);
    }
    @Test
    void getScoreWithAddTenPin(){
        //Given
        int score[][] = {{10},{6,4,3},{8,1},{3,6},{4,4},{5,2},{6,6},{1,1},{5,3},{8,1}};
        //When
        getScore scoreResult = new getScore();
        //Then
        assertEquals(scoreResult.getScoreOfBowing(score),97);
    } 
}
