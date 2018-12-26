package ClassSixa;
// this is a super class 
public class SuperKeyWord{
	
	
String familyName = "habib";
String city = "Jackson Heights";
public SuperKeyWord() {// How did this constructor print its value from main method , I did not call it. //
	System.out.println("this is parent class constructor I am extending it in my subclass Children");
}
public SuperKeyWord(String city) {
	this.city =city;
	//System.out.println("this is a SuperKeyworkd class constructor");
}
public void height() {
	System.out.println( "Parents heights");
}
public void color() {
	System.out.println("Red");
}
}