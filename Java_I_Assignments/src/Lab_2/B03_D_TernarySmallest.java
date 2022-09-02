
package Lab_2;

import java.util.*;

class B03_D_TernarySmallest{
		 
        public static void main(String[] args){
        System.out.println("Enter Four number to find Smallest:");
            Scanner s = new Scanner(System.in);
            int s1 = s.nextInt();
            int s2 = s.nextInt();
            int s3 = s.nextInt();
            int s4 = s.nextInt();
            int l1,l2,l3;
            l1 = (s1<s2)?s1:s2;
            l2 = (s4<s3)?s4:s3;
            l3 = (l1<l2)?l1:l2;
            System.out.println("Smallest is "+l3);
            s.close();
    
    }
        
       
}
