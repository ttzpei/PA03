package PA03;


public class ThomasChangingCircle extends CircleShape{

  private double vr=1.0;

  public ThomasChangingCircle(){
    super();
		this.color = new java.awt.Color(255,0,22,30);
  }

  public void update(double dt){

    		this.radius += dt*vr;

        if  (this.radius <10) this.vr *= -1;
        else if (this.radius > 50) this.vr *= -1;
    		super.update(dt);
      }


}
