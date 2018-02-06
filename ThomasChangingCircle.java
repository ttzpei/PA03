package PA03;

/**
This creates a set of random circles that bounce from left-to-right
and decrease in size whenever they pass through the center.
*/


public class ThomasChangingCircle extends CircleShape{

  private double midWayRadius = .10;

  /**
  Makes a random set of pink circles that move from left to right
  */

  public ThomasChangingCircle(){
    super();
		this.color = new java.awt.Color(255,100,150,200);
    this.y = (int)(500*Math.random());
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
  This method updates the circle for each frame. In addition if the x value
  */

  public void update(double dt){
    this.x += dt*vx;
    this.y += dt*vy;
    if(this.x >= 100 && this.x < 250){
      warp1();
    }else if(this.x>250 && this.x <= 400){
      warp2();
    }
    super.update(dt);
  }

  public void warp1(){
    this.radius -= midWayRadius;
  }

  public void warp2(){
    this.radius += midWayRadius;
  }


}
