import java.time.LocalDateTime;
import org.json.simple.JSONObject;

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
return (String)person.get("initDate");
  }
}
