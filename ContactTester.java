public class ContactTester{
  public static void main(String args[]){
      Contact bill = new Contact("bill","myers","email@outlook.ca","6131234567");


    System.out.println("Should be: bill Result: "+bill.getFirstName());
    System.out.println("Should be: myers Result: "+bill.getLastName());
    System.out.println("Should be: email@outlook.ca Result: "+bill.getEmail());
    System.out.println("Should be: 6131234567 Result: "+bill.getPhoneNumber());
    System.out.println("IDK what it should be Result: "+bill. getDateMet());
    System.out.println(bill);

  }
}
