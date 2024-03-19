import java.util.Scanner;
class StarPattern2 {
    public static void main(String[] args) {
        int n,i,j;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of rows to print");
        n= sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=n;j>=i;j--)
            {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}