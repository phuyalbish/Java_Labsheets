
package Lab_2;
import java.util.*;

class B01_Reminder{
		 
        public static void main(String[] args){
        System.out.println("Enter numbers to perform Division and Reminder:");
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            int b = s.nextInt();
            int div,rem;
            div = a/b;
            rem = a%b;
            System.out.println("The Division of"+a+" and "+b+" is "+div+" and reminder is "+rem);
        s.close();
    
    }
        
       
}
