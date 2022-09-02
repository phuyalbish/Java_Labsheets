package Lab_5;
import java.util.*;
public class E01_A_FunctionCube {

    static int CubeFunction(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number to cube:");
        int x = s.nextInt();
        s.close();
        return x*x*x;
    }
    public static void main(String[] args) {
        int x = CubeFunction();
        System.out.println("The Cube is :"+x);
    }
}
