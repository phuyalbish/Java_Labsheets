
package Lab_2;

import java.util.*;

class B03_C_TernaryGreatest{
		 
        public static void main(String[] args){
        System.out.println("Enter Three number to find Greatest:");
            Scanner s = new Scanner(System.in);
            int s1 = s.nextInt();
            int s2 = s.nextInt();
            int s3 = s.nextInt();
            int l1,l2;
            l1 = (s1>s2)?s1:s2;
            l2 = (l1>s3)?l1:s3;
            System.out.println("Greatest is "+l2);
            s.close();
    
    }
        
       
}
