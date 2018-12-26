package ClassSixb;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num = 10;
     try {
     int result = num/0;// we can divide anything by zero
     System.out.println(result);
     }
     catch(Exception ex) {
    	// ex.printStackTrace();
    	 System.out.println("You are not alloed to devide by zero");
     }
     
	}

}
