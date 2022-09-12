
package Lab_3;
/*Pattern:
    1
    12
    123
    1234
    12345*/

    public class C20_G_Pattern {

        public static void main(String[] args) {
            for(int i='E'; i>='A'; i--){
                for(int j='A'; j<=i; j++)
                    System.out.print((char)j);
                System.out.println();
    
            }
                
        
        }
    }