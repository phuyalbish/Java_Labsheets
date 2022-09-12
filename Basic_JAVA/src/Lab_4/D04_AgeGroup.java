package Lab_4;
import java.util.*;
public class D04_AgeGroup {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of an person:");
        int n = s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the ages of person:");
        
        for(int i=0; i<n; i++){
            a[i] =s.nextInt();
        }
        int count=0;
        for(int x : a){
            if(x<=40 && x>=25) count++;
        }
        System.out.println("There are "+count+" person ahving age between 25 and 40.");
        s.close();

    }
}
