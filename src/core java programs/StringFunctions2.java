import java.sql.SQLOutput;
import java.util.Scanner;
class StringFunctions2{
    public static void main(String[] args) {
        /*String str= new String();
        str= " ram";
        System.out.println(str.toUpperCase());
        System.out.println(str);
        str= str.toUpperCase();
        System.out.println(str);*/

        Scanner sc= new Scanner(System.in);
        String s = new String();
        System.out.println("enter string in lower case");
        s= sc.nextLine();
        System.out.println("entered string is");
        System.out.println(s);
        System.out.println("string in upper case is");
        System.out.println(s.toUpperCase());
        System.out.println(s);
        System.out.println("enter string in upper case");
        String s1= new String();
        s1= sc.nextLine();
        System.out.println("entered string in lower  case is");
        System.out.println(s1.toLowerCase());
        System.out.println(s1);


    }
}


