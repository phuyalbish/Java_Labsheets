
package Lab_3;
//WAP to read a number and check whether it is prime or not.
import java.util.Scanner;
public class C08_PrimeOrNot {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a number to check its prime or not:");
            int n = s.nextInt();
            int c=0;
            for(int i=2; i<=n/2; i++){
                if(n%i==0){
                    System.out.println(n+" is a not prime number.");
                    c++;
                    break;
                }

            }
            if(c==0) System.out.println(n+" is a prime number.");
            s.close();
        }


}
