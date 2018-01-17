import java.util.ArrayList;
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
    try{//Creates file for storage of contacts
      contactInformation.createNewFile();
    }
    catch(IOException ioe){
       ioe.printStackTrace();
    }
    //addNewContact(allContacts);
    retrieveContact(allContacts,contactInformation);
    for(int i = 0; i<allContacts.size();i++ ){
      //System.out.print(allContacts.get(i));
    }


  }
//USER INTERACTION FUNCTIONS
  public static ArrayList<Contact> addNewContact(JSONObject listToAdd){
    Contact bill = new Contact("bill","myers","email@outlook.ca","6131234567");
    Contact margaret = new Contact("margaret","myers","margaret@outlook.ca","9381234567");
    Contact bifll = new Contact("bill","myers","email@outlook.ca","6131234567");
    Contact mafargaret = new Contact("margaret","myers","margaret@outlook.ca","9381234567");
    Contact bidll = new Contact("bill","myers","email@outlook.ca","6131234567");
    Contact marasgaret = new Contact("margaret","myers","margaret@outlook.ca","9381234567");
    listToAdd.put(bill);
    listToAdd.put(margaret);
    listToAdd.put(bifll);
    listToAdd.put(mafargaret);
    listToAdd.put(bidll);
    listToAdd.put(marasgaret);

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

  public static JSONObject retrieveContact(JSONObject listToFind, File toOPen){

    // BufferedReader reader = null;
    // String text = "";
    // String aLine ="";
    // try{
    //   reader = new BufferedReader(new FileReader(toOPen));
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
    // System.out.println("TEXT TESTER 1: " + text);
    //   System.out.println("INPUT FROM FILE ");
    //   System.out.println(text);
    // JSONParser parser = new JSONParser();
    // Object tempListToFind = new Object();
    // try{
    // tempListToFind = parser.parse(text);
    // }
    // catch(ParseException e){
    //   System.out.println("PARSE DIDNT WORK");
    // }
    // System.out.println("THE FOUND LIST: "+listToFind);
    // listToFind = (JSONArray)tempListToFind;

    JSONParser parser = new JSONParser();
        try {

            Object obj = parser.parse(new FileReader(toOPen));

            JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject);

            // String name = (String) jsonObject.get("name");
            // System.out.println(name);
            //
            // long age = (Long) jsonObject.get("age");
            // System.out.println(age);
            //
            // // loop array
            // JSONArray msg = (JSONArray) jsonObject.get("messages");
            // Iterator<String> iterator = msg.iterator();
            // while (iterator.hasNext()) {
            //     System.out.println(iterator.next());
            // }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }


    return listToFind;
  }
}
