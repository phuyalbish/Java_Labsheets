
package Lab_1;
import java.util.*;

class A12_prefix{

        public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            
        	System.out.print("Enter a number:");
        	int y = s.nextInt();
        	System.out.println("Post-Increment: "+(y)++);
        	System.out.println("After Statement: "+y);
        	System.out.println("Post-Decrement: "+(y--));
        	System.out.println("After Statement: "+y);
        	System.out.println("Pre-Increment: "+(++y));
        	System.out.println("After Statement: "+y);
        	System.out.println("Pre-Decrement: "+(--y));
        	System.out.println("After Statement: "+y);
			s.close();
        }
        
        
}
