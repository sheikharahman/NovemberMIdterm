package ClassSixb;

import java.io.*;
//import java.io.FilterReader;
//import java.io.fReader;

public class fileReader {
	//public static void main(String[] args) throws FileNotFoundException
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       String path ="C:\\Users\\Sheikh\\Desktop\\files.txt";
       FileReader fr  = null;
       BufferedReader br = null;
       fr = new FileReader(path);// What is wrong in line 14 , it is showing an error. 6434
       br = new BufferedReader(fr);
       String data = "";
       while((data =  br.readLine()) !=null) {
    	   System.out.println(data);
       }
	}

}
