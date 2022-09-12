
package Lab_3;
//WAP to display all the prime numbers from 100 to 500.
public class C09_PrimeNumber {

    public static void main(String[] args) {
        int c;
        for(int j=100; j<=500; j++){
            c=0;
        for(int i=2; i<=j/2; i++){
            if(j%i==0){
                c++;
                break;
            }

        }   
        if(c==0) System.out.print(j+"\t");
       
        }
    }

}