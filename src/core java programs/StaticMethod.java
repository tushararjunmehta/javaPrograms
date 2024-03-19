class StaticMethod1 {
    int x=0,y=1;
    static int c=3;
    static void display() {
        System.out.println("My college name is GGSIPU");
      //  System.out.println(x);   this will give an error as static method can have only static data members
        System.out.println(c);
    }
}

public class StaticMethod{
    public static void main(String[] args) {
        StaticMethod1.display();
    }
}