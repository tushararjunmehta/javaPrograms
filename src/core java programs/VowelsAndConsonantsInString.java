//calculating number of vowels and consonants in a user entered string
import java.util.Scanner;
class VowelsAndConsonantsInString{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= new String();
        System.out.println("enter string");
        s= sc.nextLine();
        s=s.toUpperCase();
        int vov=0; int cons=0;
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                    vov++;
                else
                    cons++;

            }
        }
        System.out.println("number of vovels in the string are "+vov);
        System.out.println("number of consonants in the string are "+cons);

    }
}