
package Lab_2;

import java.util.*;

class B03_A_TernaryEvenOdd{
		 
        public static void main(String[] args){
        System.out.println("Enter numbers to To check Even or Odd:");
            Scanner s = new Scanner(System.in);
            int s1 = s.nextInt();
            String x = (s1%2 == 0)?"Even":"Odd";
            System.out.println(s1+" is "+x);
        s.close();
    
    }
        
       
}
