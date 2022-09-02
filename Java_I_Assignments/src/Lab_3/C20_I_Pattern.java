
package Lab_3;
/*Pattern:
    1
    12
    123
    1234
    12345*/

    public class C20_I_Pattern {

        public static void main(String[] args) {
            for(int i='E'; i>='A'; i--){
                for(int k='E'; k>=i; k--) System.out.print(" ");
                for(int j='A'; j<=i; j++)
                    System.out.print((char)i);
                System.out.println();
    
            }
                
        
        }
    }