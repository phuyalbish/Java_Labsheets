
package Lab_2;
import java.util.*;
class B10_GradeSheet{
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
        
            if(per<=100 && per>=80) res = "A";
            else if(per<80 && per>=60) res = "B";
            else if(per<60 && per>=50) res = "C";
            else if(per<50 && per>=40) res = "D";
            else if(per<40) res = "Fail";
            else res="invalid Marks on one or more subject.";
            
        System.out.println("Student got "+res);
        s.close();
    }
}
