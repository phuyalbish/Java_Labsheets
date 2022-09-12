
package Lab_3;
//WAP to find all the Armstrong numbers between 1-300.
public class C12_ArmstrongNumber {

    
    public static void main(String[] args) {
        int n,sum;    
        for(int i=1; i<=300; i++){
            n=i;
            sum=0;
            while(n!=0){
                sum += (n%10)*(n%10)*(n%10);
                n/=10;
            }
            if(sum==i) System.out.println(i);
        }
    }

}