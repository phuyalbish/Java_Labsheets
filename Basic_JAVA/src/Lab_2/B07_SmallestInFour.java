
package Lab_2;

import java.util.*;

class B07_SmallestInFour{
		 
        public static void main(String[] args){
        System.out.println("Enter Three number to find Smallest:");
            Scanner s = new Scanner(System.in);
            int s1 = s.nextInt();
            int s2 = s.nextInt();
            int s3 = s.nextInt();
            int s4 = s.nextInt();
            int l1,l2,l3;


            if(s1<s2) l1=s1;
            else l1=s2;
            if(s4<s3) l2=s4;
            else l2=s3;
            if(l1<l2) l3=l1;
            else l3=l2;
            System.out.println("Smallest is "+l3);
            
            s.close();
    }
        
       
}
