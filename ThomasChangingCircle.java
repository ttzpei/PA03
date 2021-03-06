package PA03;

/**
This creates a set of random circles that bounce from left-to-right
and decrease in size whenever they pass through the center.
*/


public class ThomasChangingCircle extends CircleShape{

  private double midWayRadius = .10;
  private int trueTrue = 1;

  /**
  Makes a random set of pink circles that move from left to right
  */

  public ThomasChangingCircle(){
    super();
		this.color = new java.awt.Color(255,100,150,200);
    this.radius = 40;
    this.vx = 100;
    this.vy = 0;
  }

  /**
  Main method for my code
  @param args A array of String
  */

  public static void main(String[] args){
    ThomasChangingCircle x = new ThomasChangingCircle();
    System.out.println("My circle is " + x);
  }

  /**
  This is the toString method in my program
  */

  public String toString(){
    return "Circle :" + super.toString();
  }

  /**
  This method updates the circle for each frame. In addition if the x value falls
  between 100 and 400, then the circles either become larger or smaller based
  on their radius
  @param dt This represents a frame for the program
  */

  public void update(double dt){
    this.x += dt*vx;
    this.y += dt*vy;
    if(this.x >= 100 && this.x < 400){
      if(this.trueTrue == 1){
        warp();
      }else if(this.trueTrue == 0){
        warp2();
      }
    }
    super.update(dt);
  }

  /**
  This method reduces the radius of the circles as they pass through the area
  in the center from 100 to 400
  */
  public void warp(){
    if(this.radius <= 10){
      this.trueTrue = 0;
    }
    this.radius -= midWayRadius;
  }


  /**
  This method increases the radius of the circles as they pass through the area
  in the center from 100 to 400
  */
  public void warp2(){
    if(this.radius >= 40){
      this.trueTrue = 1;
    }
    this.radius += midWayRadius;
  }


}
