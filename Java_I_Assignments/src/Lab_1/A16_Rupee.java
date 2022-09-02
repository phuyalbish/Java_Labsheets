
package Lab_1;
import java.util.Scanner;

class A16_Rupee{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter dollar value:");
		float dollar = s.nextFloat();
		float nrs;
		nrs = dollar*(float)116.69;
		System.out.println("Nepales rupee for "+dollar+"$ is Rs."+nrs);
		s.close();
	}
}
