public class GrabinskiJamesGE20 {

	public static void main(String[] args) {

		//construct a new rectangle from the simple rectangle class blue print
		SimpleRectangle rectangle1 = new SimpleRectangle();
	    System.out.println("The area of the rectangle 1 is " + rectangle1.getArea());
	    System.out.println("The perimeter of the rectangle 1 is " + rectangle1.getPerimeter());
		
		//construct a new rectangle from the simple rectangle class blue print
		SimpleRectangle rectangle2 = new SimpleRectangle(4, 5);
	    System.out.println("The area of the rectangle 2 is " + rectangle2.getArea());
	    System.out.println("The perimeter of the rectangle 2 is " + rectangle1.getPerimeter());
		
	}// end main
	
} //end TestSimpleRectangle Class	
	
	
// Define the circle class with two constructors
class SimpleRectangle {
	  double length;
	  double width;
	
	  /** Construct a rectangle with length 1 and width 2 */
	  SimpleRectangle() {
	    length = 1;
	    width = 2;
	  }
	
	  /** Construct a circle with a specified length and width */
	  SimpleRectangle(double newLength, double newWidth) {
		  length = newLength;
		  width = newWidth;
	  }
	
	  /** Return the area of this rectangle */
	  double getArea() {
	    return length * width;
	  }
	
	  /** Return the perimeter of this rectangle*/
	  double getPerimeter() {
	    return 2* (width + length);
	  }
	
	  /** Set a new length for this rectangle */
	  void setLength(double newLength) {
	    length = newLength;
	  }
	  
	  /** Set a new length for this rectangle */
	  void setWdith(double newWidth) {
	    width = newWidth;
	  }
}// SimpleRectangle Class