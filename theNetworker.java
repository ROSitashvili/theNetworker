import java.util.ArrayList;
import java.io.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class theNetworker{


  public static void main(String args[]){
    Contact bill = new Contact("bill","myers","email@outlook.ca","6131234567",1);
    System.out.println("HEIRARCHY TEST?");
    bill.printAThing();

    JSONObject allContacts = new JSONObject();
    File contactInformation = new File("theNetworkerContactInformation.json");
    if(!contactInformation.exists()){
      try{//Creates file for storage of contacts
        contactInformation.createNewFile();
      }
      catch(IOException ioe){
         ioe.printStackTrace();
         System.out.println("Contact file found.");
      }
    }
    retrieveContact(allContacts,contactInformation);
    boolean exit = true;
    // //Menu laucnh
    // while(boolean){
    //   System.out.println("")
    //
    // }
  }
//USER INTERACTION FUNCTIONS
//Encodes list of contacts to JSON
  public static JSONObject encodeContact(JSONObject listToAdd){
    Writer writer = null;
    try{
      writer = new BufferedWriter(new OutputStreamWriter(
            new FileOutputStream("theNetworkerContactInformation.json"), "utf-8"));
      writer.write(JSONValue.toJSONString(listToAdd));
    }
    catch (IOException ex){}
    finally{
       try {writer.close();} catch (Exception ex) {/*ignore*/}
    }
    return listToAdd;
  }
//Reads contacts from JSON
  public static JSONObject retrieveContact(JSONObject listToFind, File toOPen){
    JSONParser parser = new JSONParser();
        try{
            Object obj = parser.parse(new FileReader(toOPen));
            JSONObject jsonObject = (JSONObject) obj;
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (ParseException e){
            e.printStackTrace();
        }
    return listToFind;
  }

  public static JSONObject addContact(JSONObject listToAdd){
    //user input for Conct credentials
    //Add contact to list
    Contact bill = new Contact("bill","myers","email@outlook.ca","6131234567",1);
    Contact margaret = new Contact("margaret","myers","margaret@outlook.ca","9381234567",2);
    Contact bifll = new Contact("bill","myers","email@outlook.ca","6131234567",3);
    Contact mafargaret = new Contact("masrgaret","myers","margaret@outlook.ca","9381234567",4);
    Contact bidll = new Contact("bill","myers","email@outlook.ca","6131234567",5);
    Contact marasgaret = new Contact("margaret","myers","margaret@outlook.ca","9381234567",6);
    listToAdd.put(bill.getIDNumber(),bill);
    listToAdd.put(margaret.getIDNumber(), margaret);
    listToAdd.put(bifll.getIDNumber(),bifll);
    listToAdd.put(mafargaret.getIDNumber(), mafargaret);
    listToAdd.put(bidll.getIDNumber(),bidll);
    listToAdd.put(marasgaret.getIDNumber(), marasgaret);
    return listToAdd;
  }
}
