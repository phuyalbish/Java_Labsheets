
package Lab_1;
import java.util.*;

class A09_Temp{

        public static void main(String[] args){
        System.out.println("Enter temperature in celcius:");
            Scanner s = new Scanner(System.in);
            float t = s.nextFloat();
            float temp;
            temp = ((9/5)*t)+32;
        System.out.println("Temperature of "+t+"deg celsius is "+temp+"deg Farenhite.");
        s.close();
        }
        
        
}
