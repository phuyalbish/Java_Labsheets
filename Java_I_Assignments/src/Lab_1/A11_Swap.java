
package Lab_1;
import java.util.*;

class A11_Swap{

        public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            int swap;
        	System.out.println("Enter X:");
            int x = s.nextInt();
        	System.out.println("Enter Y:");
        	int y = s.nextInt();
       		System.out.println("Before Swap:\nX ="+x+"\nY ="+y);
        	swap = x;
        	x = y;
        	y = swap;
        	System.out.println("\nAfter Swap:\nX ="+x+"\nY ="+y);
			s.close();
        }
        
        
}
