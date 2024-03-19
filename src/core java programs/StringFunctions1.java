
// string input and using length and chatAt functions
import java.util.Scanner;
class StringFunctions1{
    public static void main(String[] args) {
        String s = new String();
        int len;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        s = sc.nextLine();
        len = s.length();
        System.out.println("the string is " + s);
        System.out.println("the length of the string is " + len);
        System.out.println("the character at index 2 is "+s.charAt(2));
        int i;
        for (i = 0; i < len; i++)
            System.out.println(s.charAt(i));


    }
}
