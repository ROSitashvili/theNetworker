import java.time.LocalDateTime;

public abstract class Schedualable{
  //handles all the scheduling aspects: nextmeeting, frequency of meetings, urgency level
  private LocalDateTime nextMeet;

  public void printAThing(){
    System.out.println("TESTING ABSTRACT CLASS");
  }

}
