
package Lab_1;
import java.util.*;

class A02_Math{
		 
        public static void main(String[] args){
        System.out.println("Enter numbers to perfoem math:");
            Scanner s = new Scanner(System.in);
            int s1 = s.nextInt();
            int s2 = s.nextInt();
            int add,sub,mul,div,rem;
            add = s1+s2;
            sub = s1-s2;
            mul = s1*s2;
            div = s1/s2;
            rem = s1%s2;
        System.out.println( s1 + "+" + s2 + "="+add+"\n");
        System.out.println( s1 + "-" + s2 + "="+sub+"\n");
        System.out.println( s1 + "*" + s2 + "="+mul+"\n");
        System.out.println( s1 + "/" + s2 + "="+div+"\n");
        System.out.println( s1 + "%" + s2 + "="+rem+"\n");
        s.close();
    
    }
        
       
}
