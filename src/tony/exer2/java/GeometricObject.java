package tony.exer2.java;

public class GeometricObject {
	protected String color;
	protected double weight;
	
	protected GeometricObject(){
		
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	protected GeometricObject(String color, double weight){
		super();
		this.color = color;
		this.weight = weight;
	}
	
	public double findArea(){
		return 0;
	}
}
