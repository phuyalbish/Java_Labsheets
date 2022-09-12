//WAP to read a number and find whether it is:
//b.Palindrome or not
import java.util.Scanner;
public class C11_B_PalindromeOrNot {

        public static void main(String[] args) {
            System.out.println("Enter numbers to Perform math:");
            Scanner s = new Scanner(System.in);
            int s1 = s.nextInt();
            int s2=s1;
            int rev=0;
            while(s2!=0){
                rev = (rev*10)+s2%10; 
                s2/=10;
            }
            if(s1==rev) System.out.println(s1+" is a palindrome.");
            else System.out.println(s1+" is not a palindrome.");
            s.close();
        }
}