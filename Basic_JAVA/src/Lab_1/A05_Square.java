
package Lab_1;
import java.util.*;

class A05_Square{

        public static void main(String[] args){
        System.out.println("Enter length of Square:");
            Scanner s = new Scanner(System.in);
            float len = s.nextFloat();
            float area,per;
            
            area = len*len;
            per = 4*len;
        System.out.println("Area of square having length "+len+" is "+area+"\n");
        System.out.println("Perimeter of square having length "+len+" is "+per+"\n");   
        s.close();
    }
        
        
}
