
package Lab_3;
/*Pattern:
    1
    12
    123
    1234
    12345*/

    public class C20_J_Pattern {

        public static void main(String[] args) {
            for(int i='A'; i<='E'; i++){
                for(int j='A'; j<=i; j++)
                    System.out.print((char)i);
                System.out.println();
    
            }
                
        
        }
    }