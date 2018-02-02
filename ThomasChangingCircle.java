package PA03;


public class ThomasChangingCircle extends CircleShape{

  private double midWayRadius = 2.0;
  private double midWayVelocity = 10;


  public ThomasChangingCircle(){
    super();
		this.color = new java.awt.Color(255,0,150,200);
  }

  public void update(double dt){
    this.x += dt*vx;  // for now they do not move
    this.y += dt*vy;
    if(this.x >= 200 && this.x <= 300){
      warp1();
    }else if(this.y >= 200 && this.y <= 300){
      warp2();
    }
    super.update(dt);
  }

  public void warp1(){
    this.radius -= midWayRadius;
    this.vx -= midWayVelocity;
  }
  public void warp2(){
    this.radius += midWayRadius;
    this.vy += midWayVelocity;
  }
}
