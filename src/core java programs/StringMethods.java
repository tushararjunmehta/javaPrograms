public class StringMethods {
    public static void main(String[] args) {
        String a = "Arjun";
        String a1= new String("Tushar");
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a.length());
        System.out.println(a1.length());
        String name = "Mehta";
        int value= name.length();
        System.out.println(value);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String s= new String("JAVA");
        String strlen= s.toLowerCase();
        System.out.println(strlen);
        System.out.println(s);
        s= s.toLowerCase();
        System.out.println(s);

        String nonTrimmedString= new String();
        nonTrimmedString= "                Tushar            ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());
        System.out.println(s.substring(2));
        System.out.println(name.replace('e','a'));
        System.out.println(s.contains("VA"));
        System.out.println(s.contains("va"));
        System.out.println(s.startsWith("a"));
        System.out.println(s.endsWith("va"));
        System.out.println(s.charAt(2));
        System.out.println(s.indexOf('v'));
        System.out.println(s.replace("ja", "Pa"));
        String ss= "Happy";
        System.out.println(ss.indexOf("pp"));
        System.out.println(s.indexOf('a', 2));
        System.out.println(ss.indexOf("pp",3));
        System.out.println(ss.indexOf("pp", 2));
        System.out.println(ss.equals("Happy"));
        System.out.println(ss.equals("happy"));
        System.out.println(ss.equalsIgnoreCase("happY"));
        System.out.println(ss.lastIndexOf('p'));
        System.out.println(ss.lastIndexOf('p',3));
        System.out.println(ss.lastIndexOf('p',2));
        System.out.println("I am escape sequence \n ");
        String s3= new String();
        s3= "checking for double and           triple spaces";
        System.out.println(s3.contains("  "));
        System.out.println(s3.contains("   "));









    }
}
