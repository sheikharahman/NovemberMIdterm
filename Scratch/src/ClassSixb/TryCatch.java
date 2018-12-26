package ClassSixb;
import java.io.*;
public class TryCatch {

	public static void main(String[] args) /*throws IOException */{
		// TODO Auto-generated method stub
       String path ="C:\\Users\\Sheikh\\Desktop\\files.txt";//For windows we need to use \\back slash
       FileReader fr  = null;
       BufferedReader br = null;// here we assign null because we did not assign anything to the object. 
       try {
		fr = new FileReader(path);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.println("We could not find the file");
	}
       br = new BufferedReader(fr);
       String data = "";
       try {
		while((data =  br.readLine()) !=null) {
			   System.out.println(data);
		   }
	} catch (IOException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.println("We could not read the file");
	}
       finally {
    	   if(fr != null) {
    		   fr=null;
    	   }
    	   if(br != null) {
    		   br=null;
    	   }
       }
	}

	}

