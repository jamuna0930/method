package oops.java;

public class ShapeRectangle {
	
	
	 private int length,width;
	 
	 //Getter Method
	 
	 int getLength()
	 {
		 return length;
	 }
	 
	 
	 int getwidth()
	 {
		 return width;
	 }
	 
	 //setter Method
	  
	 void setLength(int l)
	 {
		 length =l;
		 
	 }
	 
	   
	 void setwidth(int w)
	 {
		 width =w;
		 
	 }
	
   
	int area() {
		
		int a =length*width;
		return a;
	}


 

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		 ShapeRectangle obj =new ShapeRectangle();
		 obj.setLength(20);
		 obj.setwidth(20);
		 
		 System.out.println("Area of Rectangle:" +obj.area());
	}
}

