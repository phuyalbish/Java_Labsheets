//WAP to find sum of odd numbers and even numbers from 1 to 100.

package Lab_3;

public class C04_SumOfOddAndEven {
    public static void main(String[] args) {
        int odd=0;
        int even=0;
        for(int i=1; i<=100; i++){
            if(i%2==0) even +=i;
            else odd +=i;
        }
        System.out.println("Even Addition is "+even+"\nOdd Addition is"+odd);
    }
    
}