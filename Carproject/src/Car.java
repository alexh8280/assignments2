
public class Car {
	
	String color;
	double value;
	String type;
	String carMaker = "Honda";
	
	
	
	public Car(String color, double value, String type, String carMaker) {
		super();
		this.color = color;
		this.value = value;
		this.type = type;
		this.carMaker = carMaker;
		
	}
	
	public double carDepreciation() {
		
		double depreciation = (this.value * .9);
		return depreciation;
		
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", value=" + value + ", type=" + type + ", carMaker=" + carMaker + "]";
	}
	
	
	
	

}
