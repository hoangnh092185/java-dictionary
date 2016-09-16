import java.util.List;
import java.util.ArrayList;

public class Word{
  private String mWord;
  private static List<Word> instances = new ArrayList<Word>();
  private int mId;
  private List<Definition> mDefinitions;


  public Word(String word){
    mWord = word;
    instances.add(this);
    mId = instances.size();
    mDefinitions = new ArrayList<Definition>();
  }
  public String getWord(){
    return mWord;
  }
  public static List<Word>all(){
    return instances;
  }
  public static void clear(){
    instances.clear();
  }
  public int getId(){
    return mId;
  }
  public List<Definition> getDefinitions(){
    return mDefinitions;
  }
  public void addDefinition(Definition theDefinition){
    mDefinitions.add(theDefinition);
  }
  public static Word find(int id){
    return instances.get(id -1);
  }
}
