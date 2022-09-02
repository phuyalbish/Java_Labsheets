
package Lab_2;
import java.util.*;
class B09_A_WeekDays{
    public static void main(String[] args) {
        System.out.println("Enter the weekday in number:\n");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if(num==1) System.out.println("Sunday");
        else if(num==2) System.out.println("MOnday");
        else if(num==3) System.out.println("Tuesday");
        else if(num==4) System.out.println("Wednesday");
        else if(num==5) System.out.println("Thursday");
        else if(num==6) System.out.println("Friday");
        else if(num==7) System.out.println("Saturday");
        else System.out.println("Invalid number");
        s.close();
    }
   
}
