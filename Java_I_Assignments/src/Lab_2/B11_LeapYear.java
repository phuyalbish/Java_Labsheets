
package Lab_2;
import java.util.*;
class B11_LeapYear{
    public static void main(String[] args) {
        System.out.println("Enter the Year:\n");
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        if(year%4 == 0){
                System.out.println(year+" is aleap year.");
        }
        else {
            if(year%100 == 0){
                if(year%400 == 0) System.out.println(year+" is a leap year");
                else  System.out.println(year+" is not a leap year");
            }
            else  System.out.println(year+" is not a leap year");
        }
        s.close();

    }
}