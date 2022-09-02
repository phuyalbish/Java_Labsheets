
package Lab_3;
//WAP to generate the series:
import java.util.Scanner;
import java.lang.Math;
public class C15_NewSeries {

public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number for X in series:");
        int x = s.nextInt();
        System.out.println("Enter number for n in series:");
        int num = s.nextInt();
    int fact;
    for(int j=1; j<=num; j++){
        
        fact=1;
        for(int i=1; i<=j; i++) fact *=i;
        System.out.print((float)Math.pow(x,j)/(float)fact+" + ");
    }
    s.close();
}

}