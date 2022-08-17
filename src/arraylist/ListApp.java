package arraylist;

public class ListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 ArrayList <String> carList = new ArrayList<String>(4);	
		
		carList.addItem("Range Rover");
		
		System.out.print(carList.addItem(null)+"\n");//testing if addItem method would be able to addItem to list successfully. 
		

		carList.addItem("Impala");
		carList.addItem(null);
	
		
		carList.addItem("Cherokee");
		carList.addItem("Explorer");
		
		
		
		System.out.println(carList.toString());
		
		 ArrayList <Square> squareList = new ArrayList<Square>(4);	
		
		/*instantiating Square Objects*/
		 
		 Square s0= new Square(6.4);
		 Square s1= new Square(2.3);
		 Square s2= new Square(2.8);
		 Square s3= new Square(3.6);
		 
		
		 
		 /*adding Square Objects to Array*/
		 squareList.addItem(s0);
		 squareList.addItem(s1);
		 squareList.addItem(s2);
		 squareList.addItem(s3);
		 
		 
		 System.out.print("\n"+squareList.toString());
		 
		 
		 ArrayList <PointThreeD> pointList = new ArrayList<PointThreeD>(4);	
		
		 
		 /*instantiating PointThreeD Objects*/
		 PointThreeD p0= new PointThreeD(2.9,1.3,2.2);
		 PointThreeD p1= new PointThreeD(4.9,4.3,2.8);
		 PointThreeD p2= new PointThreeD(7.3,2.7,1.3);
		 PointThreeD p3= new PointThreeD();
		 
		 /*adding PointThreeD Objects to Array*/
		 pointList.addItem(p0);
		 pointList.addItem(p1);
		 pointList.addItem(p2);
		 pointList.addItem(p3);
		 
		 System.out.print("\n"+pointList.toString());
		 
		 
		 
	}//end main method

	
}//end class