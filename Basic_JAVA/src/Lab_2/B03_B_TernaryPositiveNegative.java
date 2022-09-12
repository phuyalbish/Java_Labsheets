
package Lab_2;
import java.util.*;

class B03_B_TernaryPositiveNegative
{
	public static void main(String [] args)
	{
		Scanner s =new Scanner(System.in);
		int number;
		System.out.println("Enter any number:");
		number=s.nextInt();
		String r = (number>0) ?  "Positive Number" : (number<0) ? "Negative Number" : "Zero";
		System.out.println(r);
		s.close();
	}
}
