package Lab_4;
import java.util.*;
public class D08_MatrixMultiplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[][],b[][],c[][];
        a = new int[2][3];
        b = new int[3][2];
        c = new int[2][2];
        System.out.println("Enter 2*3 array values for A:");
        int x,y;
        for(x=0; x<2; x++)
            for(y=0; y<3; y++)
                a[x][y] = s.nextInt();
        System.out.println("Enter 3*2 array values for B:");
        for(x=0; x<3; x++)
            for(y=0; y<2; y++)
                b[x][y] = s.nextInt();
            System.out.println("Matrix mutiplied");

        for(x=0; x<2; x++){
            for(y=0; y<2; y++){
                for(int z=0; z<3; z++){
                    c[x][y] += a[x][z]*b[z][y];
                }
                System.out.print(c[x][y]+"\t");
            }
            System.out.println();
        }
        s.close();
        }
}
