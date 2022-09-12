package Lab_5;
import java.util.*;
public class E11_PrimeOrNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            System.out.println("Enter a number to check its prime or not:");
            int n = s.nextInt();
            int x = prime(n);
            s.close();
            if(x==1) System.out.println(n+" is Prime");
            else System.out.println(n+" is not Prime");
    }
    static int prime(int n){
        int c=0;
            for(int i=2; i<=n/2; i++){
                if(n%i==0){
                    c++;
                    break;
                }

            }
            return c;
    }
}
