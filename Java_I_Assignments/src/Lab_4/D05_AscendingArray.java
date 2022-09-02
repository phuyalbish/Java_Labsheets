package Lab_4;
import java.util.*;
public class D05_AscendingArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Enter 10 numbers:");
        int i,j;
        for(i=0; i<10; i++){
            a[i] =s.nextInt();
        }
        System.out.println("Before Ascending");
        for(int m:a){
            System.out.println(m);
        }
        int swap;
        for(i=0; i<10; i++){
            for(j=i; j<10; j++){
                if(a[i]>a[j]){
                    swap = a[i];
                    a[i] = a[j];
                    a[j] = swap;
                }
            }
        }
        System.out.println("After Ascending");
        for(int m:a){
            System.out.println(m);
        }
        System.out.println("After Descending");
        for(int m=9; m>=0; m--){
            System.out.println(a[m]);
        }
        s.close();
    }
}
