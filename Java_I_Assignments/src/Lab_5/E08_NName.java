package Lab_5;
import java.util.*;
public class E08_NName {
    public static void main(String[] args) {
        Name();
    }
    static void Name(){
        System.out.println("Enter how many times:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1; i<n; i++)
            System.out.println("Bishal Phuyal");
        s.close();
    }
}
