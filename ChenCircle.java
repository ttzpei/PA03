package pa03;


//import java.awt.Color; // Don't need to import the color, its included when you call in super()
//also I added your code to the DrawingModel file so it can run.

public class ChenCircle extends CircleShape{

	private double vr = 2;
	private double c = 10;

	public ChenCircle(){
		super();
		this.color = new java.awt.Color(25,216,251,100);
	}

	public void update(double dt){

		this.radius -= dt / c; // made it +=; *= won't produce the balls.
		
		if (this.radius % 20 <= 10){
			this.x += 2;
			this.y += dt;
		} else if (this.radius % 20 >= 10 && this.radius % 20 <= 20){
			this.x += 2;
			this.y -= dt;
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