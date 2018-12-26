package ClassThreeKeyword;
public class TestDriveway {
	public static void main(String[] args) {
         Driveway dwy = new Driveway();   
         dwy.setDriveWaySize(6);  
         System.out.println(dwy.getDriveWaySize());
         Driveway hwy =new Driveway();
         hwy.setDriveWaySize(7);
         System.out.println(hwy.getDriveWaySize());
         System.out.println(dwy.getDriveWaySize()); 
         Driveway.buildDriveWay();
	}
	
}
