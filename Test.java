import java.time.LocalDate;
import java.time.LocalTime;

class Check {

  private String plate;
  private LocalDate date;
  private LocalTime time;

  public void setplate (String plate){
    plate.this = plate;
  }

  public void setdate (LocalDate date){
    date.this = date;
  }

  public void settime(LocalTime time){
    time.this = time;
  }

  public String getplate(){
    return plate;
  }

  public LocalDate getdate(){
    return date;
  }

  public LocalTime gettime(){
    return time;
  }

}
