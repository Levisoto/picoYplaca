import java.time.LocalDate;
import java.util.ArrayList;
import java.time.LocalTime;

class Test {

public static void main(String args[]) {


  //Adding Restrictions-----------------
  //----------------------------------------------------------------------------
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

  //------------------------------------------------------------------------
  //
  //Code for Unit Testing--------------------------------------------

  ArrayList<String> plates = new ArrayList<String>();
  ArrayList<String> dates = new ArrayList<String>();
  ArrayList<String> times = new ArrayList<String>();
  ArrayList<String> answers = new ArrayList<String>();
  
  plates.add("CDF-245");
  plates.add("FCV-412");
  plates.add("JNH-486");
  plates.add("YUH-475");
  plates.add("WAS-122");

  dates.add("15/02/2017");
  dates.add("12/12/2017");
  dates.add("05/04/2017");
  dates.add("23/06/2017");
  dates.add("17/07/2017");

  times.add("20:25:20");
  times.add("07:02:50");
  times.add("08:30:45");
  times.add("17:30:20");
  times.add("16:20:10");

  answers.add("Can be");
  answers.add("Can be");
  answers.add("Can't be");
  answers.add("Can be");
  answers.add("Can't be");


  PicoYPlaca picoyplaca = new PicoYPlaca(restric);

  for(int i=0;i<=(plates.size()-1);i++){
      System.out.println(plates.get(i)+" "+dates.get(i)+" "+times.get(i)+" -> "+answers.get(i));
  }

  System.out.println("----------------------------------------------------------------------");
  System.out.println("----------------------------------------------------------------------");
  System.out.println("----------------------------------------------------------------------\n");
  System.out.println("Runing my test\n");

  String string = "";
  for(int i=0;i<=(plates.size()-1);i++){
    picoyplaca.insert(plates.get(i),dates.get(i),times.get(i));
    if(picoyplaca.check()){string = "Can't be";}else{string="Can be";}
    if(string.equals(answers.get(i))){
      System.out.println(plates.get(i)+" "+dates.get(i)+" "+times.get(i)+" -> "+string+" -> Pased!");
    }else { System.out.println(plates.get(i)+" "+dates.get(i)+" "+times.get(i)+" -> "+string+" -> Faild!");
  }}
  

}

}
