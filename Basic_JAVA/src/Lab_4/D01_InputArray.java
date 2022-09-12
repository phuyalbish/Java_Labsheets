
package Lab_4;
import java.util.*;
public class D01_InputArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the dimension of an array:");
        int n = s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the values of array:");
        
        for(int i=0; i<n; i++){
            a[i] =s.nextInt();
        }
        System.out.println("The Output's are:");
        for(int x : a){
            System.out.print(x);
        }
        s.close();

    }
}
