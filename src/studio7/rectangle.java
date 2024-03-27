package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class rectangle {
	private double length;
	private double width;
	
	 public rectangle(double length, double width)
     {
        this.length = length;
        this.width = width;
     }
	
	 public double perimiter() {
		 return this.length*2 + this.width*2;
	 }
	 
	 public double area() {
		 return this.length*this.width;
	 }
	 
	 public boolean isSquare() {
		 if(this.length == this.width) {
			 return true;
		 } else {
			 return false;
		 }
	 }
	 
	 public void draw() {
			StdDraw.clear();
			StdDraw.filledRectangle(.5, .5, this.width/2, this.length/2);
	 }
	 
	public static void main(String[] args) {
	rectangle r1 = new rectangle(.5, .3);
	r1.draw();
	}

}
