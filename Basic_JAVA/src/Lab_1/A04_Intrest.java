
import java.util.*;

class A04_Intrest{

        public static void main(String[] args){
        System.out.println("Enter Principal:");
            Scanner s = new Scanner(System.in);
            int princ = s.nextInt();
        System.out.println("Enter rate:");
            float rate = s.nextFloat();
        System.out.println("Enter time in year:");
            float time = s.nextFloat();
            float intrest;
            intrest = (princ*time*rate)/100;
            
        System.out.println("Simple Intres having "+princ+" principal is "+intrest);
        s.close();
    }
        
        
}
