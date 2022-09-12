package Lab_5;
import java.util.*;
public class E12_Math {
    public static void main(String[] args) {
        System.out.println("Enter two number to do math:");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        s.close();
        int adds = add(a,b);
        int subs = sub(a,b);
        int muls = mul(a,b);
        int divs = div(a,b);
        int rems = rem(a,b);
        System.out.println(a+" + "+ b+" = "+adds);
        System.out.println(a+" - "+ b+" = "+subs);
        System.out.println(a+" * "+ b+" = "+muls);
        System.out.println(a+" / "+ b+" = "+divs);
        System.out.println(a+" % "+ b+" = "+rems);
    }
    static int add(int x,int y){
        return x+y;
    }
    static int sub(int x,int y){
        return x-y;
    }
    static int mul(int x,int y){
        return x*y;
    }
    static int div(int x,int y){
        return x/y;
    }
    static int rem(int x,int y){
        return x%y;
    }
}
