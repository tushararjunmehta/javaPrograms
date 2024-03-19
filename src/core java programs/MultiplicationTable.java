public class MultiplicationTable {
    static void multiplication(int n){
        for(int i=1;i<=10;i++){
        //    System.out.println(n +"x"+ i +"="+ n*i);
            System.out.format("%d X %d = %d \n", n,i, n*i);
        }
    }
    public static void main(String[] args) {
        multiplication(9);
        System.out.println();
        MultiplicationTable.multiplication(3);
    }
}
