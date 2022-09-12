
package Lab_3;
//WAP to read two numbersand calculate its power. (x^y)
import java.util.Scanner;
public class C07_Power {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two number for base and exponent for its power:");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num=1;
        for(int i=1; i<=num2; i++)
            num*=num1;
        System.out.println(num1+"^"+num2+"="+num);
        s.close();
    }
}