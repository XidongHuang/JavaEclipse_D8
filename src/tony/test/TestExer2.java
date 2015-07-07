package tony.test;

import tony.exer2.java.*;

public class TestExer2 {
	public static void main(String[] args) {
		Circle c =  new Circle(2.6, "red", 1.4);
		MyRectangle t = new MyRectangle(2.5, 3.6, "blue", 5);
		TestExer2 test = new TestExer2();
		
		System.out.println("These two objects' area are equal? "+test.equalsArea(c, t));
		System.out.println("The first object's area is: " + test.dispalyGeometricObject(c));
		System.out.println("The second object's area is: " + test.dispalyGeometricObject(t));
	
		
	}
	
	public boolean equalsArea(GeometricObject c, GeometricObject t){
		if(c.findArea() == t.findArea()){
			return true;
		} else {
			return false;
		}
	}
	
	public double dispalyGeometricObject(GeometricObject c){
		return c.findArea();
	}
}
