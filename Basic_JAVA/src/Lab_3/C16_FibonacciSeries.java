
package Lab_3;
//WAP to find the Fibonacci series upto 10thterm

public class C16_FibonacciSeries {
public static void main(String[] args) {
    int n1=1,n2=0,n3=0;
for(int i=1; i<=10; i++){
    n3=n1+n2;
    System.out.println(n3);
    n1=n2;
    n2=n3;
}
}
    
}