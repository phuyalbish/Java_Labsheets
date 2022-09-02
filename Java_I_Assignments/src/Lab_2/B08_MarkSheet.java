
package Lab_2;
import java.util.*;
class B08_MarkSheet{
    public static void main(String[] args) {
        System.out.println("Enter the marks of:\n");
        Scanner s = new Scanner(System.in);
        System.out.println("Math:");
        int math = s.nextInt();
        System.out.println("CO:");
        int co = s.nextInt();
        System.out.println("Java:");
        int java = s.nextInt();
        System.out.println("Statistics:");
        int stat = s.nextInt();
        System.out.println("Account:");
        int ac= s.nextInt();
        float per;
        String res="";
        per = (math+co+java+stat+ac)/5;
        System.out.println(per);
        
        if(co>=32 && math>=32 && java>=32 && stat>=32 && ac>=32){
            if(per<=100 && per>=80) res = "Distinction";
            else if(per<80 && per>=60) res = "First Division";
            else if(per<60 && per>=45) res = "Second Division";
            else if(per<45 && per>=32) res = "Distinction";
            else if(per<32) res = "Fail";
            else res="invalid Marks on one or more subject.";
        }
        else res = "Fail in one or more Subject"; 
        System.out.println("Student got "+res);
        s.close();
    }
}
