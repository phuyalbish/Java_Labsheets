package Lab_5;
import java.util.Scanner;
public class E10_Factorial {
        public static void main(String[] args) {
            System.out.println("Enter a number for its factorial:");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            s.close();
            int x = factorial(n);
            System.out.println("The Factorial of "+n+" is "+x);
        }
        static int factorial(int n){
            int a = 1;
            while(n!=1){
                a *= n;
                n--;
            }
            return a;
        }
}
