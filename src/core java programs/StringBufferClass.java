import java.util.Scanner;

// String buffer class
// whenever we want to make changes to our string, we can use StringBuffer class instead of String class
class StringBufferClass{
    public static void main(String[] args) {
        String s1= new String();
        StringBuffer s2= new StringBuffer("Tushar Arjun Mehta");

        System.out.println(s2);
        s2.setCharAt(3,'z');
        System.out.println(s2);
        StringBuffer s3= new StringBuffer("'s code ");
        System.out.print(s2.append(s3));
        System.out.println();
        System.out.println(s2);
        StringBuffer s4= new StringBuffer("Java");
        StringBuffer s5= new StringBuffer("CodeItUp");
        s4.insert(3,s5);
        System.out.println(s4);
        s5.setLength(20);
        System.out.println(s5);
        s5.setLength(5);
        System.out.println(s5);
        StringBuffer s6= new StringBuffer();
        Scanner sc= new Scanner(System.in);
        // this will give an error as this can only accept input of string objects and not string buffer
        //s6= sc.nextLine();
        //so we will use instead
        System.out.println("enter string");
        s6.append(sc.nextLine());
        System.out.println("entered string is "+s6);


    }
}