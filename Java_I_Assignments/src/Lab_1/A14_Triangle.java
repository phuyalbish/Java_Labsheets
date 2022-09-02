
package Lab_1;
import java.util.Scanner;

class A14_Triangle{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter height of triangle:");
		int height = s.nextInt();
		System.out.println("Enter base of triangle:");
		int base = s.nextInt();
		int area;
		area = (height*base)/2;
		
		System.out.println("The area of the triangle is "+area);
		s.close();
	}
}
