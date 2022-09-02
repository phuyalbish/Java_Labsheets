
package Lab_1;
import java.util.*;

class A07_Cuboid{

        public static void main(String[] args){
        System.out.println("Enter length of Cuboid:");
            Scanner s = new Scanner(System.in);
            float len = s.nextFloat();
        System.out.println("Enter bredth of Cuboid:");
        float bre = s.nextFloat();
        System.out.println("Enter height of Cuboid:");
        float heig = s.nextFloat();
            float vol;
            
           vol = len*bre*heig;
        System.out.println("Volune of Cuboid is "+vol);
        s.close();
        }
        
        
}
