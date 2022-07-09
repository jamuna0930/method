
//class @ Obect 

package oops.java;

public class Rectangle {
	
	
    int length,width;
	
	void getDetails(int x,int y) {
		
		length = x;
		width = y;

    }
 	
	int area() {
		
		int a = length*width;
		return a;
	}
	

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Rectangle o1 =new  Rectangle();
		 o1.length =10;
		 o1.width =20;
		 System.out.println("area of rectangle:" + o1.area());
		 

		 Rectangle o2 =new  Rectangle();
		 o2.length =50;
		 o2.width =50;
		 System.out.println("area of rectangle:" + o2.area());
		 
		 Rectangle o3 =new  Rectangle();
		 o3.length =10;
		 o3.width =10;
		 System.out.println("area of rectangle:" + o3.area());
		 
		
	}

}
