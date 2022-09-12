
package Lab_3;
//WAP to find the leap year between 1800-2000
public class C14_LeapyYearBetween {

    public static void main(String[] args) {
        for(int year=1900; year<=2000; year++){
            if(year%4 == 0)
            System.out.print(year+"\t");
            else if(year%100 == 0) if(year%400 == 0) System.out.print(year+"\t");
        }


        }
}