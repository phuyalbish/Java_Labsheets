
package Lab_3;
//WAP to read the age of 10 persons and count the number of person of the age group 25-50.
import java.util.Scanner;
public class C13_CountAgeGroup {

    public static void main(String[] args) {
        
        System.out.println("Enter 10 persons age:");
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        int count = 0;
        for (int i : a) {
            i = s.nextInt();
            if(i>=25 && i<=50) count++;
            
        }
        System.out.println("There are "+count+" number of people having age grouped 25-50.");
        s.close();

    }
    
}