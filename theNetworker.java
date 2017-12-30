import java.io.File;
import java.io.IOException;
public class theNetworker{
  public static void main(String args[]){
    try {//Creates file for storage of contacts
      File contactInformation = new File("theNetworkerContactInformation.txt");
      contactInformation.createNewFile();
    }
    catch(IOException ioe) {
       ioe.printStackTrace();
    }
  }
}
