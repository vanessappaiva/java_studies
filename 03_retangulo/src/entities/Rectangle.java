package entities;
import java.lang.Math;

public class Rectangle {
	public double width;
	public double heitght;
	
	public double area() {
		return width*heitght;
	}
	
	public double perimeter() {
		return (2*width) + (2*heitght);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2.0) +  Math.pow(heitght, 2.0));			
	}
	
	public String toString() {
		return String.format("AREA = %.2f%nPERIMETER = %.2f%nDIAGONAL = %.2f%n", area(), perimeter(), diagonal());
	}
}
