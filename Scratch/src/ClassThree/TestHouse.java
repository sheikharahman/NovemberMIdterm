package ClassThree;

public class TestHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     House myHouse = new House(8511,"Jackson Heights");
     House ourHouse = new House(11372,"Jackson village");
     String houseLocation = myHouse.getHouseLocation();
     ourHouse.getHouseBasement();
     System.out.println(houseLocation);
     
	}

}
