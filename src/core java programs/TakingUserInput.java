import java.util.Scanner;
public class TakingUserInput {
    public static void main(String [] args){
        System.out.println("Taking Input from the user");
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2= sc.nextInt();
        int sum=num1+num2;
        System.out.println("Sum of two numbers is "+ sum);

    }
}
