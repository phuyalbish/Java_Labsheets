
package Lab_1;
import java.util.Scanner;

class A18_Minute{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter time in hour:");
		float hour = s.nextFloat();
		float min;
		min = hour*60;
		System.out.println(hour+"hour has "+min+"minutes");
		s.close();
	}
}
