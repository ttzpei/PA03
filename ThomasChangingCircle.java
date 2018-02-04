package PA03;

/**
This creates a set of random circles that bounce from left-to-right
and decrease in size whenever they pass through the center.
*/


public class ThomasChangingCircle extends CircleShape{

  private double midWayRadius = .10;
  private double midWayVelocity = 1;


  public ThomasChangingCircle(){
    super();
		this.color = new java.awt.Color(255,100,150,200);
    this.y = (int)(500*Math.random());
    this.radius = 40;
    this.vx = 100;
    this.vy = 0;
  }

  public void update(double dt){
    this.x += dt*vx;
    this.y += dt*vy;
    if(this.x >= 200 && this.x < 250){
      warp1();
    }else if(this.x>250 && this.x <= 300){
      warp2();
    }
    super.update(dt);
  }

  public void warp1(){
    this.radius -= midWayRadius;
    this.vx += midWayVelocity;
  }

  public void warp2(){
    this.radius -= midWayRadius;
    this.vx -= midWayVelocity;
  }


}
