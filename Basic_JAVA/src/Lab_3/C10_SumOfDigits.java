
package Lab_3;
//WAP to input the number and find the sum of each digits.
import java.util.Scanner;
public class C10_SumOfDigits {

    public static void main(String[] args){
        System.out.println("Enter numbers to Perform math:");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int sum=0;
            while(n!=0){
                sum += n%10;
                n/=10;
            }
            System.out.println("Sum of each digit is"+sum);
            s.close();
        }
}