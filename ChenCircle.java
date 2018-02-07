package PA03;

public class ChenCircle extends CircleShape{

	private double vr = 10;

	public ChenCircle(){
		super();
		this.color = new java.awt.Color(255,100,20,200);
	}

	public void update(double dt){
		this.radius += dt*vr; // made it +=; *= won't produce the balls.
		if (this.radius <= 100 || this.radius >= 500){
			this.x += vr;
			this.y += vr * 2;
		} else {
			this.x -= vr;
			this.y -= vr * 2;
		}
		super.update(dt);

	}

	public static void main(String[] args){
    	ChenCircle x = new ChenCircle();
    	System.out.println("My circle is " + x);
  	}

  	public String toString(){
  		return "Chen's circle: " + super.toString();

  	}


}
