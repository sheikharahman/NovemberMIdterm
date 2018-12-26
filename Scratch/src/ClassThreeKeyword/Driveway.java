package ClassThreeKeyword;

public class Driveway {
	public static  int driveWaySize;
	public void setDriveWaySize(int driveWaySize) {
		this.driveWaySize = driveWaySize;
	}
	public int getDriveWaySize() {
		return driveWaySize;
	}
    public static void buildDriveWay() {
    	System.out.println("This is static driveway");
    }
}
