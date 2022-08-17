package arraylist;

public class Square {

private double side;
	
	public Square() {
		this.side=0.0;
		
	}//end empty argument constructor
	
	public Square(double s) {
		this.side=s;
	}//end preferred constructor
	public double getArea() {
		return side*side;
	}

	@Override
	public String toString() {
		return  "Square: "+side+"";
	}
}