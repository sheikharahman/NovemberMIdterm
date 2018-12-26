package ClassThree;

public class House {
public int houseNumber;
public String houseName;
public int zipCode;
public String cityName;
public String houseLocation = "USA";
public House() {}
public House(String houseName,int houseNumber) {
	this.houseName = houseName;
	this.houseNumber=houseNumber;
	System.out.println(houseName+","+ houseNumber);
}
public House(int zipCode,String cityName) {
	this.zipCode = zipCode;
	this.cityName = cityName;
	System.out.println(zipCode+","+cityName);
}
public String getHouseLocation() {
	return houseLocation;
}
void getHouseBasement() {
	System.out.println("This house basement is stuffy");
}
}

