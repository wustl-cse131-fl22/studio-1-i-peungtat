package studio1;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter a year");
		int year = input.nextInt();
		boolean w = ((year%4 == 0) && (year%100 != 0)) || (year%400 == 0);
		System.out.println(year+" is a leap year: "+w);
		
	}

}
