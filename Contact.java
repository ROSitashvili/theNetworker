import java.time.LocalDateTime;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class Contact{
  private JSONObject person = new JSONObject();
  private LocalDateTime nextMeet;

//CONSTRUCTORS
  public Contact(String fN, String lN, String el, String pN){
    person.put("firstName",fN);
    person.put("lastName",lN);
    person.put("email",el);
    person.put("phoneNumber",pN);
    person.put("initDate",LocalDateTime.now());
  }

  public Contact(String fN, String lN, String el){
    this(fN,lN,el,"");
  }
  public Contact(String fN, String el){
    this(fN,"",el,"");
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
}
