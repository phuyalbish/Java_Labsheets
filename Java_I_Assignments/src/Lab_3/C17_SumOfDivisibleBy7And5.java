
package Lab_3;
//WAP to find the number of and sum of all integers greater than 100 and less than 200 that are exactly divisible by 7 but no 5

public class C17_SumOfDivisibleBy7And5 {
    public static void main(String[] args) {
        for(int i=100; i<=200; i++){
            if(i%7==0){
                if(i%5!=0){
                    System.out.println(i);
                   
                }
            }
        }
    }
    
}