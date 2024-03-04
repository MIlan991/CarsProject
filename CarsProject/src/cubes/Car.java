package cubes;

public class Car {
	
	public String brand;
	public String model;
	public int year;
	public String regPlate;
	public int numberOfDoors;
	public String color;
	public Engine engine;
	
	public Car(String brand, String model, int year, String regPlate, int numberOfDoors, String color, Engine engine) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.regPlate = regPlate;
		this.numberOfDoors = numberOfDoors;
		this.color = color;
		this.engine = engine;
	}
	
	public String paint(String newColor) {
		this.color = newColor;
		return this.color;
	}
	
	public String register(String registration) {
		this.regPlate = registration;
		return this.regPlate;
	}
	
	public void returnInformations() {
		System.out.println("Brand: " + brand + "; Model: " + model + "; Year: " + year + "; Registration plate: " + regPlate + "; Number of Doors: " + numberOfDoors + "; Color: " + color + "; Engine capacity: " + engine.capacity + "; Engine power: " + engine.power + "; Type of Petrol: " + engine.typeOfPetrol + ".");
	}
	
}