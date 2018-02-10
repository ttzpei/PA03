package PA03;


public class ChenCircle extends CircleShape{

	private double c = 10;

	public ChenCircle(){
		super();
		this.color = new java.awt.Color(25,216,251,100);
		this.x = 250;
		this.vx = 0;
		this.vy = -50;
	}

	public void update(double dt){

		this.radius -= dt / c; // made it +=; *= won't produce the balls.

		if (this.radius % 20 <= 10){
			this.y += dt;
		} else if (this.radius % 20 >= 10 && this.radius % 20 <= 20){
			this.y -= dt;
		}
		super.update(dt);

	}

	public void keepOnBoard(){
		if (this.x < this.radius) {
			// it went off the left edge! do something!
			this.vx = -this.vx;
			this.x = this.radius;

		}else if (this.x > CircleShape.boardWidth-this.radius) {
			// it went off the right edge! do something!
			this.vx = -this.vx;
			this.x = CircleShape.boardWidth-this.radius;
		}

		if (this.y < this.radius){
			// it went above the top edge!
			this.vy = -this.vy;
			this.y = 500 - this.radius;

		} else if (this.y > CircleShape.boardHeight-this.radius) {
			// it went below the bottom edge!
			this.vy = -this.vy;
			this.y = CircleShape.boardHeight-this.radius;
		}
	}

	public static void main(String[] args){
    	ChenCircle x = new ChenCircle();
    	System.out.println("My circle is " + x);
  	}

  	public String toString(){
  		return "Chen's circle: " + super.toString();

  	}


}
