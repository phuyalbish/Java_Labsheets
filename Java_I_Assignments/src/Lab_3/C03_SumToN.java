//WAP that asks an integer n and calculate sum of all natural numbers from 1 to n using all available loops.


package Lab_3;
import java.util.*;
public class C03_SumToN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number for its addition:");
        int num = s.nextInt();
        int add=0;
        for(int i=1; i<=num; i++) add +=i;
        System.out.println("Sum upto "+num+" is "+add);
        s.close();
    }
    
}
