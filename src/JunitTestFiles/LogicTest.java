package JunitTestFiles;
import Read_Write.LogicControl;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LogicTest {
    List<String> texts = new ArrayList<String>(Arrays.asList("Programming", "is fun"));
    LogicControl logicControl = new LogicControl();
    @Test
    public void testRowCount() {
        //Arrange
        int expected = 2;
        //Act
        int actual = logicControl.RowCount(texts);
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    public void testCharacterCount() {
        //Arrange
        int expected = 16;
        //Act
        int actual = logicControl.CharacterCount(texts);
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    public void testWordCount() {
        //Arrange
        int expected = 3;
        //Act
        int actual = logicControl.WordCount(texts);
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    public void testLongestWord() {
        //Arrange
        String expected = "Programming";
        //Act
        String actual = logicControl.LongestWord(texts);
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    public void testStopOrContinue() {
        //Arrange
        Boolean expected = true;
        //Act
        boolean actual = logicControl.StopOrContinue("stop");
        //Assert
        assertEquals(expected,actual);
    }
}
