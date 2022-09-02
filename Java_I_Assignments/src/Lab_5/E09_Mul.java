package Lab_5;
import java.util.Scanner;
public class E09_Mul {
        public static void main(String[] args) {
            System.out.println("Enter a number for its multiplication table:");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            s.close();
            mul(n);
        }
        static void mul(int n){
            for(int i=0; i<10; i++)
                System.out.println(n+"*"+i+"="+n*i);
        }
}
