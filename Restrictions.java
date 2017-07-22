import java.lang.Character;
import java.util.ArrayList;
import java.time.LocalTime; 
import java.time.format.DateTimeFormatter; 

class Restrictions {

  private int  day;
  private ArrayList<Character> lastDigit = new ArrayList<Character>();
  private ArrayList<LocalTime> rustHour = new ArrayList<LocalTime>();

  public void setDay (int day){
    this.day = day;
  }

  public void addLastDigit (char digit){
    lastDigit.add(digit);
  }

  public void addRustHour(String time){
    String[] times = time.split("-");
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("H:mm:ss");
    LocalTime localtime = LocalTime.parse(times[0], formatter2);
    LocalTime localtime2 = LocalTime.parse(times[1], formatter2);
    rustHour.add(localtime);
    rustHour.add(localtime2);
  }

  public int getDay(){
    return day;
  }

  public ArrayList<Character> getLastDigit(){
    return lastDigit;
  }

  public ArrayList<LocalTime> getRustHour(){
    return rustHour;
  }

}
