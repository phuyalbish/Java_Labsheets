
package Lab_3;

//WAP to read a number and display the multiplication table of that number.
import java.util.Scanner;
public class C06_MultiplicationTable {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a number for its multiplication table:");
            int n = s.nextInt();
            for(int i=1; i<=10; i++)
                System.out.println(n+"*"+i+"="+(n*i));
            s.close();
        }
    
}