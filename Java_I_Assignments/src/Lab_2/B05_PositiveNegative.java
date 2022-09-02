
package Lab_2;

import java.util.*;

class B05_PositiveNegative{
		 
        public static void main(String[] args){
        System.out.println("Enter numbers to To Positive or Negative:");
            Scanner s = new Scanner(System.in);
            int s1 = s.nextInt();
            if(s1>0) System.out.println(s1+" is Positive Number");
            else System.out.println(s1+" is Negative Number");
        s.close();
    
    }
        
       
}
