package pa03;

import java.awt.Color;

public class ChenCircle extends CircleShape{

	private double vr = 0.7;
	public ChenCircle(){
		super();
		this.color = new java.awt.Color(255,100,20,70);
	}

	public void update(double dt){
		this.radius *= dt*vr;
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