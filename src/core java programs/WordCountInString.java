// counting number of words in a user entered string
import java.util.Scanner;
class WordCountInString{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String s= new String();
        s= sc.nextLine();
        int wordCount=1;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
                wordCount++;
        }
        System.out.println("number of words in the entered string is "+wordCount);
    }
}