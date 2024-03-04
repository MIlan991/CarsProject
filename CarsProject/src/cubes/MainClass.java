package cubes;

public class MainClass {

	public static void main(String[] args) {
		
		Car car1 = new Car("peugeot", "206", 2003, "", 5, "blue", new Engine(1.4, 50, "diesel"));
		car1.paint("green");
		car1.register("bg2098df");
		car1.engine.addPower(10);
		car1.returnInformations();
		
		Car car2 = new Car("renault", "clio", 2020, "", 5, "red", new Engine(1.6, 90, "gasoline"));
		car2.paint("blue");
		car2.register("ns4851jr");
		car2.engine.addPower(30);
		car2.returnInformations();
		
		Car car3 = new Car("fiat", "punto", 2010, "", 3, "gray", new Engine(1.9, 90, "diesel"));
		car3.paint("black");
		car3.register("pp4971fr");
		car3.engine.addPower(100);
		car3.returnInformations();
	}

}