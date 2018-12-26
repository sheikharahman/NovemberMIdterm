package ClassFive;

public class Fivetoyota extends Fiveabstract {

	@Override
	public void carStop() {
		// TODO Auto-generated method stub
	System.out.println("carStop method declared in interface and implimented in Fivetoyota class");	
	}

	@Override
	public void carStart() {
		// TODO Auto-generated method stub
		System.out.println(" csrStart Only method declared in interface implimented in concreet class");
	}

	@Override
	public void brakeCar() {
		// TODO Auto-generated method stub
		System.out.println("BrakeCar mehtod  declared in interface implimented in class ");
	}

	@Override
	public void foruWheelDrive() {
		// TODO Auto-generated method stub
		System.out.println("Fourwheeldrive metod decalred in interface impplimented in a concreet class");
	}

	@Override
	public void frontWheelDrive() {
		// TODO Auto-generated method stub
		System.out.println("Front wheel drive method declared in interface");
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("BodyColor mehtod declared in Abstract class. ");
		
	}

}
