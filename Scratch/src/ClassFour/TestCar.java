package ClassFour;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        interfaceCar ifcr = new ToyotaCarClass();
        //or ToyotaCarClass ifcr = new ToyotaCarClass();
        ifcr.start();
        ifcr.motorCar();
        ifcr.stop();
        ToyotaCarClass tcl =  new ToyotaCarClass();
        tcl.carMotor();
        tcl.start();
        tcl.stop();
        tcl.motorCar();
        tcl.newElectricBattery();
        tcl.hyBridBattery();
        tcl.electricBattery();
        String carName = tcl.carName();
        System.out.println(carName);
        tcl.buyCar();
        abstractClass asv = new ToyotaCarClass();
        asv.electricBattery();
        asv.hyBridBattery();
        asv.newElectricBattery();
	}

}
