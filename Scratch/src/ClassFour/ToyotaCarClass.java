package ClassFour;

public class ToyotaCarClass extends abstractClass implements interfaceCar,secondInterface {

	@Override
	public void start() {
		// TODO Auto-generated method stub
	System.out.println("Method from interfaceCar class");	
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
	System.out.println("Mehtod from interfaceCar");	
	}
	public void motorCar() {
		System.out.println("Motor car method created in interface");
	}
	public void carMotor() {
		System.out.println(" carMotor method is created ToyotaCarClass not in interfaceCar ");
	}

	@Override
	public void newElectricBattery() {
		// TODO Auto-generated method stub
		System.out.println("newElectricBattery method was declared in ABSTRACT class");
	}

	@Override
	public void buyCar() {
		// TODO Auto-generated method stub
		System.out.println("I do not want to buy a car");
	}

	@Override
	public String carName() {
		// TODO Auto-generated method stub
		return carName;
	}

}
