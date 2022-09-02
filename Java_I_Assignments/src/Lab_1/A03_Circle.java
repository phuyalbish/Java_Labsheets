
package Lab_1;
import java.util.*;

class A03_Circle{

        public static void main(String[] args){
        System.out.println("Enter radius of circle:");
            Scanner s = new Scanner(System.in);
            int r = s.nextInt();
            float area,per;
            final float pi = 3.1415F;
            
            area = pi*r*r;
            per = 2*pi*r;
        System.out.println("Area of circle having radius "+r+" is "+area);
        System.out.println("Perimeter of circle having radius "+r+" is "+per+"\n");
        s.close();
    }
        
        
}
