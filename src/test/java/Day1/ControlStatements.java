package Day1;

public class ControlStatements {

	public static void main(String[] args) {
	
		int a = 10;
		int b = 15;
		int c = 12;
		
		if(a>b) {
			System.out.println(" a is greater than b");
		} else if(a>c) {
			System.out.println("a is greater than c");
		} else {
			System.out.println(" a is smaller than b and c");
		}
		
		// Find largest of 3 numbers
		
		String day = "Saturday";
		
		if (day == "Sunday") {
			System.out.println("Today is Sunday");
		} else if(day == "Monday") {
			System.out.println( "todau is Mponday");
		} else if(day == "tueday") {
			System.out.println("today is Tuesday");
		}  else if(day == "Wednesday") {
			System.out.println("today is Wed");
		} else if(day == "Thursday") {
			System.out.println("today is Thur");
		} else if(day == "Friday") {
			System.out.println("today is Friday");
		} else if(day == "Saturday") {
			System.out.println("today is Saturd");
		}

		// Switch case default
		
		switch (day.toLowerCase()) {
		case ("sunday"): {
			System.out.println("today is sunday");
			break;
		}
		case ("monday"): {
			System.out.println("today is Monday");
			break;
		}
		case ("tuesday"): {
			System.out.println("today is Tuesday");
			break;
		}
		case ("wednesday"): {
			System.out.println("today is Wed");
			break;
		}
		case ("thursday"): {
			System.out.println("today is Thurs");
			break;
		}
		case ("friday"): {
			System.out.println("today is Friday");
			break;
		}
		case ("saturday"): {
			System.out.println("today is saturday");
			break;
		}
		
		}
		
	}

}
