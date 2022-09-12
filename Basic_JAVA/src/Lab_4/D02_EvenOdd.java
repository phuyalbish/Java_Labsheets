package Lab_4;
import java.util.*;
public class D02_EvenOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the dimension of an array:");
        int n = s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the values of array:");
        
        for(int i=0; i<n; i++){
            a[i] =s.nextInt();
        }
        int even=0,odd=0;
        System.out.println("The Output's are:");
        for(int x : a){
            if(x%2==0) even++;
            else odd++;
        }
        System.out.println("There are "+even+" even number and "+odd+" odd numbers");
        s.close();

    }
}
