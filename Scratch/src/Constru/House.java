package Constru;
public class House {
	public int houseNumber= 8511;;
	public String houseName =" White House";
	public House() {}  // in class teacher shows that we can create multiple constructor  but how. 
	public House(String houseName) {
		this.houseName = houseName;
	System.out.println(houseName);
	
	}
	public String getHousName() {// what takes presidency  constructor or method. I am not able to print anything using method,but constructor;
		return houseName;
	}
	public int  getHouseNumber() {
		return houseNumber;
	}
	
	public void getBedroom() {
		System.out.println("There are three bed room in the hosue.");
	}

}
