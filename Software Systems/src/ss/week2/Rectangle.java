package ss.week2;

public class Rectangle {
    private int length;
    private int width;
    //@ private invariant length > 0;
    //@ private invariant width > 0;
    
    /**
     * Create a new Rectangle with the specified length and width.
     */

    //@ requires theLength > 0 && theWidth > 0;
    //@ ensures length() == theLength && width() == theWidth;
    public Rectangle(int theLength, int theWidth) {
    	if (theLength > 0 && theWidth > 0) {
        	length = theLength;
        	width = theWidth;
    	}
    	else {
    		length = 0;
    		width  = 0;
    	}

    }
    
    /**
     * The length of this Rectangle.
     */
    //@ ensures \result > 0;
    /*@ pure */
    public int length() {
	return length;
    }

    /**
     * The width of this Rectangle.
     */
    //@ ensures \result > 0;
    /*@ pure */
    public int width() {
	return width;
    }

    /**
     * The area of this Rectangle.
     */
    //@ requires length() > 0 && width() > 0;
    //@ ensures \result == width ()*length ();
    /*@ pure */
    public int area() {
	return width() * length();
    }

    /**
     * The perimeter of this Rectangle.
     */
    //@ requires length() > 0 && width() > 0;
    //@ ensures \result == width ()*2 + length ()*2;
    /*@ pure */
    public int perimeter() {
	return width() * 2 + length * 2;
    }
}
