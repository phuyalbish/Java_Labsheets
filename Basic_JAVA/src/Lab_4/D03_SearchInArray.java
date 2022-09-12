package Lab_4;
import java.util.*;
public class D03_SearchInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the dimension of an array:");
        int n = s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the values of array:");
        int i;
        for(i=0; i<n; i++){
            a[i] =s.nextInt();
        }

        System.out.println("Enter the number to search:");
        int search=s.nextInt();
        for(i=0; i<n; i++){
            if(search == a[i]){
                System.out.println("Index number "+i+" has "+a[i]);
            }
        }

        s.close();
    }
    
}
