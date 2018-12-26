package Classfiveb;
                            //POLYMORPHISM//
public class AreaOfLand {
public int landCalculator(int a , int b) {
	int total = a+b;
	return total;
}
public int landCalculator(int a , int b, int c) {
	int total = a+b+c;
	return total;
}
public int landCalculator(int a , int b,int c, int d) {
	int total = a+b+c+d;
	return total;
}
public int landCalculator(int a , int b,int c, String landName) {
	int value = Integer.parseInt(landName);
	int total = a+b+c+value;
	return total;
}
}
