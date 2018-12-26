package ClassFour;

public class Encaptulation {
	private String stName;
	private int stID;
	private String city;
	private int zipCode;
	public Encaptulation() {}
	public Encaptulation(String stName,int stID,String city,int zipCode) {
		this.stName = stName;
		this.stID = stID;
		this.city = city;
		this.zipCode = zipCode;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getStID() {
		return stID;
	}
	public void setStID(int stID) {
		this.stID = stID;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}


}
