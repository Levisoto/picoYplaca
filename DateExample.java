import java.time.LocalDate; 
import java.time.format.DateTimeFormatter; 
import java.util.Locale; 
import java.util.Locale;

public class DateExample {
  public static void main(String args[]) {

// Instantiate a Date object
    //LocalDate date = new LocalDate();
  //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
  //String text = date.format("yyyy-MMM-dd");
  //LocalDate date = LocalDate.parse("20/11/1994",formatter);
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

String date = "17/08/2016";
String date2 = "16/08/2016";

//convert String to LocalDate
LocalDate localDate = LocalDate.parse(date, formatter);
LocalDate localDate2 = LocalDate.parse(date2, formatter);

if(localDate > localDate2){
  System.out.println("Today's date is: "+localDate);
}

  System.out.println("It is incorrect");
}
}
