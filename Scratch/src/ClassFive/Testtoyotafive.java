package ClassFive;

public class Testtoyotafive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fiveinterface fvs = new Fivetoyota();
		fvs.carStart();
		fvs.carStop();
		fvs.brakeCar();
		//fvs.shape(); // why i don't have access  "public static void shape"  method 
		Fiveinterfacetwo fvst = new Fivetoyota();
		fvst.foruWheelDrive();
		fvst.frontWheelDrive();
		Fiveabstract fvast = new Fivetoyota();
		fvast.bodyColor();
		fvast.brakeCar();
		fvast.carStart();
		fvast.carStop();
		fvast.foruWheelDrive();
		fvast.frontTwoWheelDrive();
		fvst.frontWheelDrive();
		Fivetoyota fvt = new Fivetoyota();
		fvt.foruWheelDrive();
		fvt.interiorColor(); // this a static method which is created in abstract class in implemented. 
		//fvt.shape
	
		
		
	}

}
