public class Information{
  private String firstName;
  private String lastName;
  private String email;
  private String phoneNumber;

  public Information(String fN, String lN, String el, String pN){
    firstName = fN;
    lastName = lN;
    email = el;
    phoneNumber = pN;
  }
  public Contact(String fN, String lN, String el){
    this(fN,lN,el,"");
  }

  public Contact(String fN, String lN, String pN){
    this(fN,lN,"",pN);
  }

  public Contact(String fN, String el){
    this(fN,"",el,"");
  }

  public Contact(String fN, String pN){
    this(fN,"","",pN);
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
}
