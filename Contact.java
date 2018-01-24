import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import java.time.LocalDateTime;

public class Contact extends Schedualable{
  private JSONObject person = new JSONObject();
//CONSTRUCTORS
  public Contact(String fN, String lN, String el, String pN, int idNumber){
    super(LocalDateTime.now());
    person.put("firstName",fN);
    person.put("lastName",lN);
    person.put("email",el);
    person.put("phoneNumber",pN);
    person.put("initDate",(super.getInitDate().toString()));
    person.put("ID",idNumber);
  }

  public Contact(String fN, String lN, String el, int idNumber){
    this(fN,lN,el,"",idNumber);
  }
  public Contact(String fN, String el, int idNumber){
    this(fN,"",el,"",idNumber);
  }

  public String toString(){
    return JSONValue.toJSONString(person);
  }

  //GET METHODS
  public String getFirstName(){
    return (String)person.get("firstName");
  }
  public String getLastName(){
    return (String)person.get("lastName");
  }
  public String getEmail(){
    return (String)person.get("email");
  }
  public String getPhoneNumber(){
    return (String)person.get("phoneNumber");
  }
  public String getDateMet(){
    return person.get("initDate").toString();
  }
  public String getIDNumber(){
    return Integer.toString((int)person.get("ID"));
  }
}
