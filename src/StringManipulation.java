public class StringManipulation {

    public static void main(String[] args) {
        String s = "Deepanshu";
      String s1 =  s.substring(0,1);
        System.out.println("String s1 is "+s1);
        String s2 = s.substring(2,9);
        System.out.println("S2 is "+s2);
        String finalNameAfterRemovingLetterEIs = s1.concat(s2);
        System.out.println("Final name is "+finalNameAfterRemovingLetterEIs);

    }


    }

