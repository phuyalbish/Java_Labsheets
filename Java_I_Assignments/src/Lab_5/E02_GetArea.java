package Lab_5;
import java.util.Scanner;
public class E02_GetArea {
    static void getArea(){
        System.out.print("Enter the Length and bredth of rectangle:");
        Scanner s = new Scanner(System.in);
        float len = s.nextFloat();
        float bred = s.nextFloat();
        System.out.println("The Area is: "+ (len*bred));
        s.close();
    }
    public static void main(String[] args) {
        getArea();
    }
}
