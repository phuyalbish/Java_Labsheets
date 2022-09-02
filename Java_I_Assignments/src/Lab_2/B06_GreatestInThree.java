
package Lab_2;

import java.util.*;

class B06_GreatestInThree{
		 
        public static void main(String[] args){
        System.out.println("Enter Three number to find Greatest:");
            Scanner s = new Scanner(System.in);
            int s1 = s.nextInt();
            int s2 = s.nextInt();
            int s3 = s.nextInt();
            int l1,l2;
            if(s1>s2) l1=s1;
            else l1=s2;
            if(l1>s3) l2=l1;
            else l2=s3;
            System.out.println("Greatest is "+l2);
            s.close();
    
    }
        
       
}
