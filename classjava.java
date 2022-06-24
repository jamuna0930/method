package oops.java;

class Box{
	
	int length;
	int breadth;
	int height;
	
	Box(int l,int b,int h){ //   constructor      - constructor is special method ,,same name as the class
		
		length = l;         //immediately called when the object is created ,used for initializing the values...
		breadth = b;
		height = h;        // constructor is no return type
	}
	void setDim(int l,int b,int h) {  //this pointer
		

	this.length  = l;
	this.breadth = b;
	this.height  = h;
	}

	 int volume(){
		return length+breadth+height;  //method
	}	
}

public class classjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box blackBox;
		blackBox = new Box( 10,2,5);
		
		
		System.out.println(" vol of black box is " + blackBox.volume()); //method call
		
		Box woodBox;
		woodBox = new Box(12,5,3);
		
				
		System.out.println(" vol of woodbox box is " + woodBox .volume());
		
	
  /*  System.out.println( " blackBox . length : " + blackBox . length);
    System.out.println( " blackBox . breadth : "+ blackBox . breadth);
    System.out.println( " blackBox . height : "+ blackBox .  height);
    
    System.out.println("print next woodbox values \n");
    
    System.out.println( " woodBox . length :"+ woodBox. length);
    System.out.println( " woodBox . breadth :"+ woodBox . breadth);
    System.out.println( " woodBox . height :"+  woodBox .  height);
    */
	}
}
