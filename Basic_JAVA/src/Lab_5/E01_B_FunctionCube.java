package Lab_5;
import java.util.*;
public class E01_B_FunctionCube {

    static int CubeFunction(int x){
        return x*x*x;
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter number to cube:");
        int x = s.nextInt();
        int a = CubeFunction(x);
        System.out.println("The Cube is :"+a);
        s.close();
    }
}
