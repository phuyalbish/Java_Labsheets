package Lab_5;
import java.util.Scanner;
public class E06_LargestFunction {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two number to get largest:");
        int x = s.nextInt();
        int y = s.nextInt();
        int z = Largest(x,y);
        System.out.println("The largest is "+z);
        s.close();
    }
    static int Largest(int x,int y){
            if(x>=y) return x;
            else return y;
    }
}
