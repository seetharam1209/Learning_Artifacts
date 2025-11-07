package Day1;

public class Vehicle {
	
	
	// variables
	int numberofWheels; // 2 bike, 3 auto, 4 car
	String color;
	int numberOfPassengers;
	String variant;
	String manufacturer;
	
	//methods
	public void display() {
		System.out.println(" this is display method");
	}
	
	
	public void checkEngine() {
		System.out.println(variant + " vehicle is working fine");
	}

}
