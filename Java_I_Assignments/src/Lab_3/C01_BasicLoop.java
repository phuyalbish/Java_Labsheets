
package Lab_3;
class C01_BasicLoop{
    public static void main(String[] args) {
        System.out.println("Using For Loop.");
        int i;
        for(i=0;i<10;i++){
            System.out.println("Java Programming");
        }
        System.out.println("\nUsing While Loop.");
        while(i>0){
            System.out.println("Java Programming");
            i--;
        }
        System.out.println("\nUsing do While Loop.");
        do{
            System.out.println("Java Programming");
            i++;
        }while(i<9);
    }
}