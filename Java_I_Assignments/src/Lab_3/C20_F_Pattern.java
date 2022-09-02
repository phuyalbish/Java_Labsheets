
package Lab_3;
/*Pattern:
    A
    AB
    ABC
    ABCD
    ABCDE*/

    public class C20_F_Pattern {

        public static void main(String[] args) {
            for(int i='A'; i<='E'; i++){
                for(int j='A'; j<=i; j++)
                    System.out.print((char)j);
                System.out.println();
    
            }
                
        
        }
    }