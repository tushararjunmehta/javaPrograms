// substring(n),substring(n,m),concat(),indexOf('x'), indexOf('x',m)


class StringFunctions4{
    public static void main(String[] args) {
        String s= new String();
        s="Tushar Mehta";
        s=s.substring(2);
        System.out.println(s);
        String s1= new String();
        s1="Harjit Arjun Mehta";
        s1=s1.substring(2,7);
        System.out.println(s1);
        System.out.println(s.concat(s1));
        System.out.println(s1.indexOf('u',2));
        String s2= new String();
        s2= " My name is Tushar Arjun Mehta";
        System.out.println(s2.indexOf('a',4));
        System.out.println(s2.indexOf('h',3));


    }
}
