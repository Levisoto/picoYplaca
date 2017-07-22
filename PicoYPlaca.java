import java.time.LocalTime; 
import java.time.LocalDate; 
import java.util.ArrayList;
import java.time.format.DateTimeFormatter; 
import java.util.Locale; 
import java.time.DayOfWeek;

public class PicoYPlaca {

 char lastdigitOfplate;
 int day;
 LocalTime time;

 ArrayList<Restrictions> restrictions = new ArrayList<Restrictions>();

 public PicoYPlaca (ArrayList<Restrictions> restrictions){
   this.restrictions = restrictions;
 }

 public void insert (String plate, String date, String timelocal){
  
  //Settings for plate
  char[] name = plate.toCharArray();
  lastdigitOfplate = name[name.length - 1];

  //setting for date
  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
  LocalDate localdate = LocalDate.parse(date, formatter);
  DayOfWeek localday = localdate.getDayOfWeek();
  day = localday.getValue();

  //setting for time 
  DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("H:mm:ss");
  LocalTime localtime = LocalTime.parse(timelocal, formatter2);
  time = localtime;
 }

 public boolean check(){
   boolean plate = false; 
   boolean ltime = false; 
   boolean ltime2 = false; 

   if(day == 6 || day == 7){return false;}
   else{

      for(int i=0;i<restrictions.size();i++){
        if(restrictions.get(i).getDay() == day){
          if(restrictions.get(i).getLastDigit().get(0) == lastdigitOfplate || restrictions.get(i).getLastDigit().get(1) == lastdigitOfplate ){plate = true;}
          ltime = isBetween(time,restrictions.get(i).getRustHour().get(0),restrictions.get(i).getRustHour().get(1));
          ltime2 = isBetween(time,restrictions.get(i).getRustHour().get(2),restrictions.get(i).getRustHour().get(3));
       
        }
      }
      
      if((plate && ltime) || (plate && ltime2)){
        return true;
      }else{return false;}
   }

 }

  public static boolean isBetween(LocalTime candidate, LocalTime start, LocalTime end) {
  return !candidate.isBefore(start) && !candidate.isAfter(end);  // Inclusive.
  } 
}
