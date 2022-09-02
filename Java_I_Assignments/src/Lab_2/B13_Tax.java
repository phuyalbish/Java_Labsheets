
package Lab_2;
import java.util.*;
class B13_Tax{
    public static void main(String[] args) {
        System.out.println("Enter the Salary of Employee:\n");
        Scanner s = new Scanner(System.in);
        int sal = s.nextInt();
        float tax=0;
        if(sal>100000 && sal<150000) tax = sal*0.15F;
        else if(sal > 150000) tax = sal*0.25F;
        System.out.println("Salary after Tax is: Rs"+(sal+tax));
        s.close();
    }
   
}