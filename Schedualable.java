import java.time.LocalDateTime;

public class Schedualable{
  //handles all the scheduling aspects: nextmeeting, frequency of meetings, urgency level
  private LocalDateTime initDate;
  private LocalDateTime nextMeet;//Scheduled meeting date

  public Schedualable(LocalDateTime initDate){
    this.initDate = initDate;
  }

  public LocalDateTime getInitDate(){
    return initDate;
  }
  public LocalDateTime getNextMeet(){
    return nextMeet;
  }

  public void printAThing(){
    System.out.println("TESTING ABSTRACT CLASS");
  }
  public

}
