
class Restrictions {

  private String day;
  private List<Integer> lastDigit = new ArrayList<Integer>();
  private List<Integer> rustHour = new ArrayList<Integer>();

  public void setDay (String day){
    day.this = day;
  }

  public void addLastDigit (Integer digit){
    lastDigit.add(digit);
  }

  public void addRustHour(Integer time){
    rustHour.add(time);
  }

  public String getDay(){
    return day;
  }

  public List<Integer> getLastDigit(){
    return lastDigit;
  }

  public List<Integer> getRustHour(){
    return rustHour;
  }

}
