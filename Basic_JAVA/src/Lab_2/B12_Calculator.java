
package Lab_2;
import java.util.*;
class B12_Calculator{
    public static void main(String[] args) {
        System.out.println("Enter two number to calculate:\n");
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int res;
        System.out.println("Select:\na. Add\tc.Multiply\nb.Difference\td.Division\nEnter one:");
        char sel = s.next().charAt(0);
        switch(sel){
            case 'a':
                res = num1+num2;
                System.out.println(num1+"+"+num2+"="+res);
                break;
            case 'b':
            res = num1-num2;
            System.out.println(num1+"-"+num2+"="+res);
            break;
            case 'c':
            res = num1*num1;
            System.out.println(num1+"*"+num2+"="+res);
            break;
            case 'd':
            res = num1/num2;
            System.out.println(num1+"/"+num2+"="+res);
            break;
            default:
                System.out.println("Wrong Input;");

        }
        s.close();
    }
   
}