import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class theNetworker{


  public static void main(String args[]){
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
      retrieveContact(allContacts,contactInformation);
    }

    boolean exit = true;
    //Menu laucnh
    Scanner userInput = new Scanner(System.in);

    while(exit){
      System.out.println("WHAT DO YOU WANT");
      System.out.println("0 - Quit");
      System.out.println("1 - New contact");
      int in  = userInput.nextInt();
      switch(in){
        case 0: exit = false;
        break;
        case 1: addContact(allContacts);
        encodeContact(allContacts);
        break;
      }


    }
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
    System.out.println("New contact option selected.");
    Scanner userInput = new Scanner(System.in);
    System.out.println("First name");
    String fName = userInput.nextLine();
    System.out.println("Last name");
    String lName = userInput.nextLine();
    System.out.println("Email");
    String email = userInput.nextLine();
    System.out.println("Phone");
    String number = userInput.nextLine();

    Contact x = new Contact(fName,lName,email,number,ID.newID());
    listToAdd.put(x.getIDNumber(),x);
    return listToAdd;
  }
}
