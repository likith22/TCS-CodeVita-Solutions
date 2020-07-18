/*

*/
package tcsCodeVita;
import java.util.Scanner;
public class ClockProblem {

	public static void main(String[] args) {
		int rotation;
		double longitude,hourAngle,minuteAngle,totalAngle;
		Scanner sc = new Scanner(System.in);
		rotation = sc.nextInt();
		longitude = sc.nextDouble();
		double time  =  (rotation*longitude)/360;
		//convert into actual time
		int hours = (int) time;
		int minutes = (int) ((((time*100)%100)*60)/100);
		System.out.println(hours+":"+minutes);
		//finding the minimum angle between the clock:
		hourAngle = 30.00*hours;
		
		hourAngle = hourAngle + (0.5*minutes);//displacement of hour hand
		minuteAngle = 6.00*minutes;
		if(minuteAngle  < hourAngle) {
			totalAngle = hourAngle-minuteAngle;
		}
		else {
			totalAngle = minuteAngle - hourAngle;
		}
		double tempAngle = 360 - totalAngle;
		if(tempAngle < totalAngle)
			System.out.println(tempAngle);
		else
			System.out.println(totalAngle);
		sc.close();
	}
	
	

}
