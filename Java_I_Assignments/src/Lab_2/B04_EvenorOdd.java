
package Lab_2;

import java.util.*;

class B04_EvenorOdd{
		 
        public static void main(String[] args){
        System.out.println("Enter numbers to To check Even or Odd:");
            Scanner s = new Scanner(System.in);
            int s1 = s.nextInt();
            if(s1%2==1) System.out.println(s1+" is odd");
            else System.out.println(s1+" is even");
        s.close();
    
    }
        
       
}
