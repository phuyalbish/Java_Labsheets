
package Lab_2;

import java.util.*;

class B02_FourDigit{
		 
        public static void main(String[] args){
        System.out.println("Enter numbers to Perform math:");
            Scanner s = new Scanner(System.in);
            int s1 = s.nextInt();
            int s2=s1;
            int sum=0,rev=0;
            System.out.println("a.Display each digit seperately:\n");
            while(s2!=0){
                System.out.println((s2%10)+"\n");
                sum += s2%10;
                rev = (rev*10)+s2%10; 
                s2/=10;
            }
            System.out.println("b; The sum of digits: "+sum);
            System.out.println("c. Reverse digit: "+rev);
            System.out.println("d. Square of the sum:"+ sum*sum);
        s.close();
    
    }
        
       
}
