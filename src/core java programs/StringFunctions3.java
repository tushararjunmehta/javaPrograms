
// toUpper and toLower functions in string
// compareTo function in String
import java.util.Scanner;

class StringFunctions3{
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
        System.out.println("enter first string");
        String s2= new String();
        s2= sc.nextLine();
        System.out.println("enter second string");
        String s3= new String();
        s3= sc.nextLine();
        if(s2.compareToIgnoreCase(s3)==0)
            System.out.println("strings are equal");
        else if (s2.compareToIgnoreCase(s3)>0)
            System.out.println("string 1 is greater than string 2");
        else
            System.out.println("string 1 is smaller than string 2");




    }
}


