package ClassSix;

public class Weekday {
Week day;
 static String  wkplnt;
public Weekday() {}
public Weekday(Week day) {
	this.day = day;
}
public Weekday(String  wkplnt) {
       this .wkplnt = wkplnt;
}
public void whatShouldIDoToday() {
	switch(day) {
	case Monday:
		System.out.println("Monday is frist day");
		break;
	case Tuesday:
		System.out.println("Tuesday is second day");
		break;
	case Wednesday:
		System.out.println("Wednesday is third day");
		break;
	case Thursday:
		System.out.println("Thursday is fourth day");
		break;
	case Friday:
		System.out.println("Friday is fifth day");
		break;
	case Saturday:
		System.out.println("Saturday is sixth day");
		break;
	case Sunday:
		System.out.println("Sunday is seventh day");
		break;
	case Noday:
		System.out.println("No  day is her");
		break;
	}
}
	public static  void  weekPlaneet() {
		switch(wkplnt) {
		case "Monday":
			System.out.println("This is String monday");
			break;
		case "Tuesday":
			System.out.println("This is String tuesday");
			break;
		case "Wednesday":
			System.out.println("This is String wednesday");
			break;
		case "Thursday":
			System.out.println("This is String thursday");
			break;
		case "Friday":
			System.out.println("This is String friday");
			break;
		case "Saturday":
			System.out.println("This is String saturday");
			break;
		case "Sunday":
			System.out.println("This is String saturday");
			break;
		}
	}
}


