
package Lab_2;
import java.util.*;
class B14_ASCII{
    public static void main(String[] args) {
        System.out.println("Enter the character:\n");
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        String str= "";
        if(c>=0 && c<=9) str = "Digit";
        else if((c>64 && c<=90) || (c>96 && c<123))str = "Alphabet";
        else str = "Special Character";
        System.out.println("Given character \'"+c+"\' is "+str);
        s.close();
    }
   
}