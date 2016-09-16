import java.util.List;
import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class WordTest{
  @Test
  public void Word_instanctiatesCorrectly_true() {
    Word testWord = new Word("Test");
    assertEquals(true, testWord instanceof Word);
  }
}
