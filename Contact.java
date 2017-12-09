import java.time.LocalDateTime;

public class Contact{
  private String firstName;
  private String lastName;
  private String email;
  private String phoneNumber;
  private final LocalDateTime initDate;//Date met
  private LocalDateTime nextMeet;

//CONSTRUCTORS
  public Contact(String fN, String lN, String el, String pN){
    firstName = fN;
    lastName = lN;
    email = el;
    phoneNumber = pN;
    initDate = LocalDateTime.now();
  }

  public Contact(String fN, String lN, String el){
    this(fN,lN,el,"");
  }
  public Contact(String fN, String el){
    this(fN,"",el,"");
  }


  //GET/SET METHODS

  public String getFirstName(){
    return firstName;
  }
  public String getLastName(){
    return lastName;
  }
  public String getEmail(){
    return email;
  }
  public String getPhoneNumber(){
    return phoneNumber;
  }
  public String getDateMet(){
    return initDate.toString();
  }
}
