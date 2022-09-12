package Lab_5;
import java.util.Scanner;
public class E03_IntrestFunction {
    static float intrest(int p,float t,float r){
        return (p*t*r)/100;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Princ:");
        int princ = s.nextInt();
        System.out.print("Enter Time:");
        float time = s.nextFloat();
        System.out.print("Enter Rate:");
        float rate = s.nextFloat();
        float intr = intrest(princ,time,rate);
        System.out.println("The Intrest is "+ intr);
        s.close();
    }
}
