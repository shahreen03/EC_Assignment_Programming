package JunitTestFiles;
import Read_Write.LogicControl;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogicTest {
    List<String> texts = new ArrayList<>(Arrays.asList("Programming", "is fun"));
    LogicControl logicControl = new LogicControl(texts);
    @Test
    public void testRowCount() {
        //Arrange
        int expected = 2;
        //Act
        int actual = logicControl.RowCount();
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    public void testCharacterCount() {
        //Arrange
        int expected = 16;
        //Act
        int actual = logicControl.CharacterCount();
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    public void testWordCount() {
        //Arrange
        int expected = 3;
        //Act
        int actual = logicControl.WordCount();
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    public void testLongestWord() {
        //Arrange
        String expected = "Programming";
        //Act
        String actual = logicControl.LongestWord();
        //Assert
        assertEquals(expected,actual);
    }
}
