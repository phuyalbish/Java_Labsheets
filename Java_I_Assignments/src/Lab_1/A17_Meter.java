
package Lab_1;
import java.util.Scanner;

class A17_Meter{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length in centimeter:");
		float cm = s.nextFloat();
		float m;
		m = cm/100;
		System.out.println("Length of "+cm+"cm is "+m+"m");
		s.close();
	}
}
