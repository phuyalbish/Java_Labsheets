
package Lab_1;
import java.util.*;

class A06_Rect{

        public static void main(String[] args){
        System.out.println("Enter length of Rectangle:");
            Scanner s = new Scanner(System.in);
            float len = s.nextFloat();
        System.out.println("Enter length of Rectangle:");
        float bredth = s.nextFloat();
            float area,per;
            
            area = len*bredth;
            per = 2*(len+bredth);
        System.out.println("Area of square having length "+len+" is "+area+"\n");
        System.out.println("Perimeter of square having length "+len+" is "+per+"\n");
        s.close();
        }
        
        
}
