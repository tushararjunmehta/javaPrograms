

import java.util.Scanner;
class PyramidStarPattern4{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of rows to print");
        int n,i,s,j;
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(s=1;s<=n-i;s++) {
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}