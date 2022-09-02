package Lab_5;
import java.util.Scanner;
public class E05_VolumeFunction {
    static void getVol(){
        System.out.print("Enter the Length,Bredth and Height of Cuboid:");
        Scanner s = new Scanner(System.in);
        float len = s.nextFloat();
        float bred = s.nextFloat();
        float heig = s.nextFloat();
        System.out.println("The Volume is: "+ (len*bred*heig));
        s.close();
    }
    public static void main(String[] args) {
        getVol();
    }
}
