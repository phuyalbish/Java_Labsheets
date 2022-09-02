package Lab_5;
import java.util.*;
public class E07_CharacterFunction {
    public static void main(String[] args) {
        System.out.println("Enter a character:");
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        s.close();
        character(c);
    }
    static void character(char c){
        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(c+" is vowel.");
                break;
            default:
                System.out.println(c+" is Consonant.");
        }
    }
}
