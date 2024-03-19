import java.util.Scanner;
class MaxNumber{
    int a[]= new int[10];
    void input(){
        Scanner scanner= new Scanner(System.in);

        int i;

        for (i=0;i<a.length;i++){
            System.out.println("Enter elements of the array");
            a[i]= scanner.nextInt();
        }

    }
    void maximum() {
        int max;
        max = a[0];      // for minimum element in an array; min=a[i];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)                 // if (a[i]<min
                                            // min=a[i]
                max = a[i];

        }
        System.out.println("maximum element in the array is " + max);
    }

}
class ArrayMaxElement{
    public static void main(String[] args) {
        MaxNumber aa= new MaxNumber();
        aa.input();
        aa.maximum();
    }
}



