public class GrabinskiJamesGE22 {

	private static int findMaxLength(SimpleRectangle[] rectArr) {
		double longestLength = rectArr[0].getLength();
		int index = 0;
		for (int i = 1; i < rectArr.length; i++) {
			if (rectArr[i].getLength() > longestLength) {
				index = i;
				longestLength = rectArr[i].getLength();
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		

		//construct a new rectangle from the simple rectangle class blue print
		SimpleRectangle rectangle1 = new SimpleRectangle();
		rectangle1.setLength(8.5);
		rectangle1.setWidth(5.2);
		System.out.printf("Rectangle width: %.1f and height: %.1f\n",
				rectangle1.getWidth(), rectangle1.getLength());
	    System.out.println("The area of the rectangle 1 is " + rectangle1.getArea());
	    System.out.println("The perimeter of the rectangle 1 is " + rectangle1.getPerimeter());
		System.out.println("Number of rectangles: " + SimpleRectangle.getNumberOfRectangles());
		//construct a new rectangle from the simple rectangle class blue print
		SimpleRectangle rectangle2 = new SimpleRectangle(4, 5);
	    System.out.println("The area of the rectangle 2 is " + rectangle2.getArea());
	    System.out.println("The perimeter of the rectangle 2 is " + rectangle1.getPerimeter());
	    System.out.println("Number of rectangles: " + SimpleRectangle.getNumberOfRectangles());
	    
	    SimpleRectangle rectangle3 = new SimpleRectangle(8.9, 3.5);
	    SimpleRectangle[] rectangles;
	    rectangles = new SimpleRectangle[3];
	    rectangles[0] = rectangle1;
	    rectangles[1] = rectangle2;
	    rectangles[2] = rectangle3;
	    System.out.println(rectangles[2].getPerimeter());
	    rectangles[2].setWidth(10);
	    System.out.println(rectangles[2].getPerimeter());
	    
	    int maxLengthRectangleIndex = findMaxLength(rectangles);
	    System.out.println(
	    				"The rectangle in rectangles[] array is at index " + 
	    				maxLengthRectangleIndex + " with length " + 
	    				rectangles[maxLengthRectangleIndex].getLength()
	    			);
	}// end main
	
} //end TestSimpleRectangle Class	
	
	
// Define the circle class with two constructors
class SimpleRectangle {
	
	  private double length = 1;
	  private double width = 1;
	  
	  private static int numberOfRectangles = 0;
	
	  /** Construct a rectangle with length 1 and width 2 */
	  public SimpleRectangle() {
		  numberOfRectangles++;
	  }
	
	  /** Construct a circle with a specified length and width */
	  public SimpleRectangle(double arglength, double argwidth) {
		  this.length = arglength;
		  this.width = argwidth;
		  numberOfRectangles++;
	  }
	
	  /** Return the area of this rectangle */
	  public double getArea() {
	    return length * width;
	  }
	
	  /** Return the perimeter of this rectangle*/
	  public double getPerimeter() {
	    return 2* (width + length);
	  }
	
	  /** Set a new length for this rectangle */
	  public void setLength(double arglength) {
		  this.length = arglength;
	  }
	  
	  /** Set a new length for this rectangle */
	  public void setWidth(double argwidth) {
		  this.width = argwidth;
	  }
	  
	  /** Return length */
	  public double getLength() {
	    return length;
	  }
	  
	  /** Return width */
	  public double getWidth() {
	    return width;
	  }

	  
	  /** Return numberOfRectangles */
	  public static int getNumberOfRectangles() {
	    return numberOfRectangles;
	  } 
	  
	  
}// SimpleRectangle Class