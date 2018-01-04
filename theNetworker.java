<<<<<<< HEAD
import java.util.ArrayList;
import java.io.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class theNetworker{
  public static void main(String args[]){
    ArrayList<Contact> allContacts = new ArrayList<Contact>();
    File contactInformation = new File("theNetworkerContactInformation.txt");
    try{//Creates file for storage of contacts
      contactInformation.createNewFile();
    }
    catch(IOException ioe){
       ioe.printStackTrace();
    }
      addNewContact(allContacts);


  }
//USER INTERACTION FUNCTIONS
  public static ArrayList<Contact> addNewContact(ArrayList<Contact> listToAdd){
    Contact bill = new Contact("bill","myers","email@outlook.ca","6131234567");
    Contact margaret = new Contact("margaret","myers","margaret@outlook.ca","9381234567");
    Contact bifll = new Contact("bill","myers","email@outlook.ca","6131234567");
    Contact mafargaret = new Contact("margaret","myers","margaret@outlook.ca","9381234567");
    Contact bidll = new Contact("bill","myers","email@outlook.ca","6131234567");
    Contact marasgaret = new Contact("margaret","myers","margaret@outlook.ca","9381234567");
    listToAdd.add(bill);
    listToAdd.add(margaret);
    Writer writer = null;
    try{
      writer = new BufferedWriter(new OutputStreamWriter(
            new FileOutputStream("theNetworkerContactInformation.txt"), "utf-8"));
      writer.write(JSONValue.toJSONString(listToAdd));
    }
    catch (IOException ex){}
    finally{
       try {writer.close();} catch (Exception ex) {/*ignore*/}
    }


    return listToAdd;
  }

  public static ArrayList<Contact> retrieveContact(ArrayList<Contact> listToFind, File toOPen){
    // BufferedReader reader = null;
    // try{
    //   reader = new BufferedReader(new FileReader(contactInformation));
    //   String text = null;
    //   String aLine = null;
    //   while (( aLine = reader.readLine()) != null){
    //     text+=aLine;
    //   }
    // }
    // catch (FileNotFoundException e){
    //   e.printStackTrace();
    // }
    // catch (IOException e){
    //   e.printStackTrace();
    // }
    // finally{
    //   try{
    //       if (reader != null){
    //           reader.close();
    //       }
    //   } catch (IOException e){
    //   }
    // }

  }
}
=======
import java.util.ArrayList;
import java.io.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class theNetworker{
  public static void main(String args[]){
    ArrayList<Contact> allContacts = new ArrayList<Contact>();
    File contactInformation = new File("theNetworkerContactInformation.txt");
    try{//Creates file for storage of contacts
      contactInformation.createNewFile();
    }
    catch(IOException ioe){
       ioe.printStackTrace();
    }
      addNewContact(allContacts);


  }
//USER INTERACTION FUNCTIONS
  public static ArrayList<Contact> addNewContact(ArrayList<Contact> listToAdd){
    Contact bill = new Contact("bill","myers","email@outlook.ca","6131234567");
    Contact margaret = new Contact("margaret","myers","margaret@outlook.ca","9381234567");
    Contact bifll = new Contact("bill","myers","email@outlook.ca","6131234567");
    Contact mafargaret = new Contact("margaret","myers","margaret@outlook.ca","9381234567");
    Contact bidll = new Contact("bill","myers","email@outlook.ca","6131234567");
    Contact marasgaret = new Contact("margaret","myers","margaret@outlook.ca","9381234567");
    listToAdd.add(bill);
    listToAdd.add(margaret);
    Writer writer = null;
    try{
      writer = new BufferedWriter(new OutputStreamWriter(
            new FileOutputStream("theNetworkerContactInformation.txt"), "utf-8"));
      writer.write(JSONValue.toJSONString(listToAdd));
    }
    catch (IOException ex){}
    finally{
       try {writer.close();} catch (Exception ex) {/*ignore*/}
    }


    return listToAdd;
  }

  public static ArrayList<Contact> retrieveContact(ArrayList<Contact> listToFind, File toOPen){
    // BufferedReader reader = null;
    // try{
    //   reader = new BufferedReader(new FileReader(contactInformation));
    //   String text = null;
    //   String aLine = null;
    //   while (( aLine = reader.readLine()) != null){
    //     text+=aLine;
    //   }
    // }
    // catch (FileNotFoundException e){
    //   e.printStackTrace();
    // }
    // catch (IOException e){
    //   e.printStackTrace();
    // }
    // finally{
    //   try{
    //       if (reader != null){
    //           reader.close();
    //       }
    //   } catch (IOException e){
    //   }
    // }

  }
}
>>>>>>> 320ff7092c6b8451b7477b5cd618fdfbc2eefd07
