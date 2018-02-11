package PA03;

public class ShanxiaoCircle extends CircleShape{

  private double circleValue = 0.38;

  /**
  Makes a random set of green circles that move from top to bottom
  */

  public ShanxiaoCircle(){
    super();
		this.color = new java.awt.Color(100,150,20,50);
    this.radius = 80;
    this.vx = 0;
    this.vy = 50;
  }

  /**
  Main method for my code
  @param args A array of String
  */

  public static void main(String[] args){
    ShanxiaoCircle x = new ShanxiaoCircle();
    System.out.println("Shanxiao's circle is " + x);
  }

  /**
  This is the toString method in my program
  */

  public String toString(){
    return "ShanxiaoCircle :" + super.toString();
  }

  /**
  This method updates the circle for each frame. In addition if the x value
  @param dt This represents a frame for the program
  */

  public void update(double dt){
    this.x += dt*vx;
    this.y += dt*vy;
    if(this.y >= 0 && this.y <250){
      this.radius += circleValue;

    }else if(this.y>=250 && this.y<=500){
      this.radius -= circleValue;

    }
    super.update(dt);
  }



}
