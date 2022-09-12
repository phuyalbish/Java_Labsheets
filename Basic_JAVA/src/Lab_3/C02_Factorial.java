//WAP to calculate factorial of a number using all available loops.

package Lab_3;
import java.util.Scanner;
class C02_Factorial{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number for its factorial:");
        int num = s.nextInt();
        int fact=1;
        for(int i=1; i<=num; i++) fact *=i;
        System.out.println("Factorial of "+num+" is "+fact);
        s.close();
    }
}