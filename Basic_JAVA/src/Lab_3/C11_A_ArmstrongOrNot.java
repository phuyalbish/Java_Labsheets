
package Lab_3;
//WAP to read a number and find whether it is:
//a.Armstrongor not
import java.util.Scanner;
public class C11_A_ArmstrongOrNot {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to check its Armstrong or not:");
        int num = s.nextInt();
        int n=num;
        int sum=0;
            while(n!=0){
                sum += (n%10)*(n%10)*(n%10);
                n/=10;
            }
            if(sum==num) System.out.println(sum+" is Armstrong.");
            else System.out.println(sum+" is not a Armstrong.");
        s.close();
    }

}