import java.time.LocalDate;
import java.util.ArrayList;
import java.time.LocalTime;

class Test {

public static void main(String args[]) {


  Restrictions monday = new Restrictions();
  Restrictions tuesday = new Restrictions();
  Restrictions wednesday = new Restrictions();
  Restrictions thursday = new Restrictions();
  Restrictions friday = new Restrictions();

  monday.setDay(1);
  tuesday.setDay(2);
  wednesday.setDay(3);
  thursday.setDay(4);
  friday.setDay(5);

  monday.addLastDigit('1');
  monday.addLastDigit('2');
  tuesday.addLastDigit('3');
  tuesday.addLastDigit('4');
  wednesday.addLastDigit('5');
  wednesday.addLastDigit('6');
  thursday.addLastDigit('7');
  thursday.addLastDigit('8');
  friday.addLastDigit('9');
  friday.addLastDigit('0');

  monday.addRustHour("07:00:00-09:30:00");
  monday.addRustHour("16:00:00-19:30:00");
  tuesday.addRustHour("07:00:00-09:30:00");
  tuesday.addRustHour("16:00:00-19:30:00");
  wednesday.addRustHour("07:00:00-09:30:00");
  wednesday.addRustHour("16:00:00-19:30:00");
  thursday.addRustHour("07:00:00-09:30:00");
  thursday.addRustHour("16:00:00-19:30:00");
  friday.addRustHour("07:00:00-09:30:00");
  friday.addRustHour("16:00:00-19:30:00");

  ArrayList<Restrictions> restric = new ArrayList<Restrictions>();
  restric.add(monday);
  restric.add(tuesday);
  restric.add(wednesday);
  restric.add(thursday);
  restric.add(friday);

  String plate = "CYG-239";
  String date = "21/07/2017";
  String time = "08:00:00";

  PicoYPlaca picoyplaca = new PicoYPlaca(restric);
  picoyplaca.insert(plate,date,time);

  if(picoyplaca.check()){
    System.out.println("Can't be on the road");
  }else{System.out.println("Can be on the road");}

}

}
