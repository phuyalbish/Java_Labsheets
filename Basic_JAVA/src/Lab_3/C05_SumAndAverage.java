//WAP to display the sum and average of nthnumber input by the users.

package Lab_3;
import java.util.Scanner;
public class C05_SumAndAverage {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number for its addition:");
        int num = s.nextInt();
        int add=0;
        for(int i=1; i<=num; i++){
           add +=i;
        }
        System.out.println("Addition is "+add+"\nAverage is"+(add/num));
        s.close();
    }
    
}