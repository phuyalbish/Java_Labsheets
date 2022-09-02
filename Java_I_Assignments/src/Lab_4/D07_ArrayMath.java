package Lab_4;
import java.util.*;
public class D07_ArrayMath {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[][],b[][],c[][],d[][],e[][],f[][];
        a=new int[2][3];
        b=new int[2][3];
        c=new int[2][3];
        d=new int[2][3];
        e=new int[2][3];
        f=new int[2][3];
        System.out.println("Enter 2*3 array values for A:");
        int x,y;
        for(x=0; x<2; x++)
            for(y=0; y<3; y++)
                a[x][y] = s.nextInt();
        System.out.println("For B:");
        for(x=0; x<2; x++)
            for(y=0; y<3; y++)
                b[x][y] = s.nextInt();
        for(x=0; x<2; x++)
            for(y=0; y<3; y++){
            c[x][y] = a[x][y] + b[x][y];
            d[x][y] = a[x][y] - b[x][y];
            e[x][y] = a[x][y] * b[x][y];
            f[x][y] = 2*(a[x][y] + b[x][y]);
            }

            System.out.println("C=A+B");
            for(x=0; x<2; x++){
                for(y=0; y<2; y++){
                    System.out.print(c[y][x]+"\t");
                }
                System.out.println("");
            }
            System.out.println("D=A-B");
            for(x=0; x<2; x++){
                for(y=0; y<2; y++){
                    System.out.print(d[y][x]+"\t");
                }
                System.out.println("");
            }
            System.out.println("E=A*B");
            for(x=0; x<2; x++){
                for(y=0; y<2; y++){
                    System.out.print(e[y][x]+"\t");
                }
                System.out.println("");
            }
            System.out.println("F=2*(A+B)");
            for(x=0; x<2; x++){
                for(y=0; y<2; y++){
                    System.out.print(f[y][x]+"\t");
                }
                System.out.println("");
            }
            s.close();
        }

}   
