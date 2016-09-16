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
  @Test
  public void Defintion_instantiatesCorrectlyWithDefinition_string(){
    Definition testDefinition = new Definition("Test");
    assertEquals("Test", testDefinition.getDefinition());
  }
  @Test
  public void all_returnsAllInstantcesOfDefintion_True(){
    Definition definition1 = new Definition("Test1");
    Definition definition2 = new Definition("Test2");
    assertEquals(true, Definition.all().contains(definition1));
    assertEquals(true, Definition.all().contains(definition2));
  }
  @Test
  public void clear_emptiesAllDefinitionFromArrayList_0() {
    Definition myDefinition = new Definition("Mow the lawn");
    Definition.clear();
    assertEquals(Definition.all().size(), 0);
  }
  @Test
  public void getId_definitionsInstantiateWithAnId_1(){
    Definition.clear();
    Definition myDefinition = new Definition("Home is where I lay my head");
    assertEquals(1, myDefinition.getId());
  }
  @Test
  public void find_returnsCorrectDefinitionWithSameId_Definition2(){
    Definition.clear();
    Definition definition1 = new Definition("Test1");
    Definition definition2 = new Definition("Test2");
    Definition definition3 = new Definition("Test3");
    assertEquals(definition2, Definition.find(definition2.getId()));
  }
}
