import java.util.ArrayList;


public class ID{

  private static ArrayList<Integer> IDNumbers= new ArrayList();
  private static int IDNumbersCounter = 0;

  public static int newID(){
    ++IDNumbersCounter;
    IDNumbers.add(IDNumbersCounter);
    return IDNumbersCounter;
  }
}
