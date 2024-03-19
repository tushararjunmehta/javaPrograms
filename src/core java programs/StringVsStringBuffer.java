// String class is used to store string objects for storing string values, but these values are immutable i.e these string object values cannot be changed once declared.
//StringBuffer class creates an object and stores values in it which can be changed/altered at any point of time i.e StringBuffer objects are mutable
public class StringVsStringBuffer {
    public static void main(String[] args) {
     /*   String s= new String("Tushar Arjun");
      // s.concat(" Mehta");
        System.out.println(s);
       // s=s.concat(" Mehta");
        String s1= new String();
        s1= s.concat(" Mehta");
        System.out.println(s1); */
//That means string  objects are not mutable
        StringBuffer sb= new StringBuffer("Tushar Arjun");
        sb.append(" Mehta");
        System.out.println(sb);

        //This proves that StringBuffer objects are mutable
    }
}
