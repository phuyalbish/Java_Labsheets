package Lab_5;
import java.util.*;
public class E04_SquareFunction {

    static void Square(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number to Square:");
        int x = s.nextInt();
        s.close();
        System.out.println("The Square is :"+x*x);
    }
    public static void main(String[] args) {
        Square();
    }
}
