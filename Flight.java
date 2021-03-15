package Java;

import java.awt.*;

public class Flight {
  private int number;
  private String destination;
  public Flight(int number,String destination){
  }
  public Flight(int number,String destination){
    this.number =number;
    this.destination = destination;
  }
  public void display(){
    System.out.println("Out put"+number+","+destination);
  }
  public String getDestination(){
    return this.destination;
  }
  public int getNumber(){
     return this.number;
  }
}
