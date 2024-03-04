package cubes;

public class Engine {

	public double capacity;
	public int power;
	public String typeOfPetrol;
	
	public Engine(double capasity, int power, String typeOfPetrol) {
		this.capacity = capasity;
		this.power = power;
		this.typeOfPetrol = typeOfPetrol;
	}
	
	public int addPower(int addToPower) {
		this.power += addToPower;
		return power;
	}
	
	public void returnInformations() {
		System.out.println("Engine capacity: " + capacity + "; Engine power: " + power + "; Type of Gas: " + typeOfPetrol + ".");
	}
	
}
