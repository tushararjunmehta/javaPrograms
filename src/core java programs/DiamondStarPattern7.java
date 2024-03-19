import java.util.Scanner;
class DiamondStarPattern7 {
    public static void main(String[] args) {
        int n,i,s,j;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of rows to be printed");
        n= sc.nextInt();
        for(i=1;i<=n;i++){
            for(s=1;s<=n-i;s++) {
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        n=n-1;
        for(i=1;i<=n;i++){
            for(s=1;s<=i;s++){
                System.out.print(" ");
            }
            for(j=1;j<=2*(n-i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}