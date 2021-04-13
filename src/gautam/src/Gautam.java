package gautam.src;

public class Gautam extends Employee //dont forget to extend the superclass
{
  private int weeklySalary = 2000;

  public double computePay(){
    return weeklySalary*2;
  }
}