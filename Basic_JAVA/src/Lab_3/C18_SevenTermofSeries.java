
package Lab_3;
//WAP to add first seven terms of the following series using for loop.
public class C18_SevenTermofSeries {

public static void main(String[] args) {
       
    int fact;
    for(int j=1; j<=7; j++){
        
        fact=1;
        for(int i=1; i<=j; i++) fact *=i;
        System.out.print(((float)j/(float)fact)+" + ");
    }
}

}