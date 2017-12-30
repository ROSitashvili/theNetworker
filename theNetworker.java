import java.io.File;
import java.io.IOException;
import java.util.Arraylist;
public class theNetworker{
  public static void main(String args[]){
    Arraylist<Contact> allContacts = new Arraylist<Contact>;

    try {//Creates file for storage of contacts
      File contactInformation = new File("theNetworkerContactInformation.txt");
      contactInformation.createNewFile();
    }
    catch(IOException ioe) {
       ioe.printStackTrace();
    }

  }
//USER INTERACTION FUNCTIONS
  public static void addNewContact(){
    Contact bill = new Contact("bill","myers","email@outlook.ca","6131234567");
    Contact bill = new Contact("margaret","myers","margaret@outlook.ca","9381234567");
    Arraylist.add(bill);
    Arraylist.add(margaret);

  }
}
