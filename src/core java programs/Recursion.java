public class Recursion {
    // factorial(0)=1
    // factorial(5)= 5*4*3*2*1=120;
    //factorial(n)= n * n-1 * .....1
    //factorial(n)= n* factorial(n-1)

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int x = 4;
        int z=5;
        System.out.println("the value of factorial x is " + factorial(x));
        System.out.println("the value of factorial z is "+ factorial_iterative(z));

    }

    static int factorial_iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else{
            int fact=1;
            for(int i=1;i<=n;i++){
                fact*= i;
            }
            return fact;
        }

    }
}