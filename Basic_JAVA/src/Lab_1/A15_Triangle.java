
package Lab_1;
import java.util.Scanner;
import java.lang.Math;

class A15_Triangle{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter three sides of triangle:");
		int s1 = s.nextInt();
		int s2 = s.nextInt();
		int s3 = s.nextInt();
		double area,per;
		per = (s1+s2+s3)/2;
		area = Math.sqrt(per*(per-s1)*(per-s2)*(per-s3));
		System.out.println("The area of the triangle is "+area);
		s.close();
		
	}
}
