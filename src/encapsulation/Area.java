package encapsulation;

public class Area {

	private int length;
	 private int  breadth;
	 
	 Area(int length , int breadth)
	 {
		 this.length=length;
		 this.breadth=breadth; 	 
	 }
	public void getArea()
	{
		int area= length*breadth;
		System.out.println("Area " + area);
	}
	
   public static void main(String[] args) {
	   
	   Area Rectangle=new Area(10,20);
	   Rectangle.getArea();
	
}
	
	
	
}
