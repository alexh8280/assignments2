
public class CarMain {

	public static void main(String[] args) {
		
		Car[] carArray = new Car[4];
		
		Car c1 = new Car("gold", 23000, "sedan", "honda");
		carArray[0] = c1;
	
		Car c2 = new Car("Red", 19000, "Suv", "Honda");
		carArray[1] = c2;
		
		Car c3 = new Car("Blue", 24400, "Coupe", "Honda");
		carArray[2] = c3;
		
		Car c4 = new Car("Silver", 18600, "Sedan", "Honda");
		carArray[3] = c4;
		
		//System.out.println(c1.carDepreciation());
	
		for (int i = 0; i <= (carArray.length -1); i++) {
			System.out.println(carArray[i]);
		}
		
	}
}
