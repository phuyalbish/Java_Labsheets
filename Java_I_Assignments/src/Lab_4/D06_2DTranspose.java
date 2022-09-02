package Lab_4;
import java.util.*;
public class D06_2DTranspose {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a[]=new int[2][2];
        System.out.println("Enter 2*2 array values:");
        int x,y;
        for(x=0; x<2; x++)
            for(y=0; y<2; y++)
                a[x][y] = s.nextInt();
                System.out.println("Before Transpose");
                for(int i[]: a){
                    for(int j:i){
        
                        System.out.print(j+"\t");
                    }
                    System.out.println("");
                }
                System.out.println("After Transpose");
                for(x=0; x<2; x++){
                    for(y=0; y<2; y++){
                        System.out.print(a[y][x]+"\t");
                    }
                    System.out.println("");
                }
                


    }       
}
