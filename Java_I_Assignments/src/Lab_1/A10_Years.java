
package Lab_1;
import java.util.*;

class A10_Years{

        public static void main(String[] args){
        System.out.println("Enter Years in days:");
            Scanner s = new Scanner(System.in);
            int t = s.nextInt();
            int y,m,d;
            y = t/365;
    		m = (t - y*365)/30;
    		d = t - ((y*365)+(m*30));
        	System.out.println(y+" Years "+m+" Months "+d+" Days.");
            s.close();
         }
        
        
}
