package studio1;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter an integer");
		int n1 = input.nextInt();
		System.out.println("please eneter an integer again");
		int n2  = input.nextInt();
		double average = ((double)n1+n2)/2;
		System.out.println(average);

	}

}
