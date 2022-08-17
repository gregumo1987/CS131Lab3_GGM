package arraylist;
public class PointThreeD {
private double xPoint;
private double yPoint;
private double zPoint;

public PointThreeD() {
	this.xPoint=0.0;
	this.yPoint=0.0;
	this.zPoint=0.0;
}

public PointThreeD(double x,double y, double z) {
	this.xPoint=x;
	this.yPoint=y;
	this.zPoint=z;
}

@Override
public String toString() {
	return "xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint+"|"  ;
}


	
	
}//end class