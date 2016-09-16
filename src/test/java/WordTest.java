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
  @Test
  public void Word_instanctiatesWithWord_Test() {
    Word testWord = new Word("Test");
    assertEquals("Test", testWord.getWord());
  }
  @Test
  public void all_returnsAllInstantcesOfWord_true(){
    Word firstWord = new Word("Home");
    Word secondWord = new Word("Work");
    assertEquals(true, Word.all().contains(firstWord));
    assertEquals(true, Word.all().contains(secondWord));
  }
  @Test
  public void clear_returnsAllWordFormListSize_0(){
    Word firstWord = new Word("Home");
    Word secondWord = new Word("Work");
    Word.clear();
    assertEquals(0, Word.all().size());
  }
  @Test
  public void getId_WordInstantiateWithAnId_1(){
    Word.clear();
    Word testWord = new Word("Home");
    assertEquals(1, testWord.getId());
  }
  @Test
  public void find_FindsASpecificWord_Muse(){
    Word.clear();
    Word wordOne = new Word("AC/DC");
    Word wordTwo = new Word("Muse");
    Word wordThree = new Word("Metalica");
    assertEquals(wordTwo, Word.find(wordTwo.getId()));
  }
  @Test
  public void getDefinition_GivesAnEmptyDefinitionList_ArrayList(){
      Word.clear();
      Word wordOne = new Word("AC/DC");
      assertEquals(0,wordOne.getDefinitions().size());
  }
  @Test
  public void addDefinition_AddsDefinitionToList_true(){
    Word.clear();
    Word testWord = new Word("Home");
    Definition testDefinition = new Definition("A place where I lay my head");
    testWord.addDefinition(testDefinition);
    assertTrue(testWord.getDefinitions().contains(testDefinition));
  }
  @After
  public void tearDown() {
    Word.clear();
  }
}
