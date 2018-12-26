package Constru;

public class TestHosue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House myHosue = new House("Jackson House Apartment");
		myHosue.getBedroom();
		int houseNumber = myHosue.getHouseNumber();
		System.out.println(houseNumber);
		String houseName = myHosue.getHousName();
		System.out.println(houseName);

	}

}
