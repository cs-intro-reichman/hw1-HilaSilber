// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String sMinutes, sHours, format;

		//System.out.println(hours);
		//System.out.println(minutes);
		if (minutes < 10){
			sMinutes = "0" + minutes;
		}
		else{
			sMinutes = "" + minutes;
		}
		if (hours >=0 & hours<=11){
			sHours = "" + hours;
			format = "AM";
			
		}
		else if (hours == 12){
			sHours = "" + hours;
			format = "PM";
		}
		else {
			sHours = "" + (hours - 12);
			format = "PM";
		}
		System.out.printf("%s:%s %s", sHours, sMinutes, format);

			}
		
		}