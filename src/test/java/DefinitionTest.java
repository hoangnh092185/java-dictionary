import java.util.List;
import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest{
  @Test
  public void Definition_instanctiatesCorrectly_true() {
    Definition testDefinition = new Definition("Test");
    assertEquals(true, testDefinition instanceof Definition);
  }
}
