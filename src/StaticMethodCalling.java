public class StaticMethodCalling {

    public static void main(String [] ar){
int a = 10;
int b = 20;
int sum = sum(a,b);                              // calling static method sum directly without creating object of class MethodCall
        System.out.println("sum is "+sum);
    }
    public static int sum(int a, int b){
        return a+b;
    }
}

class NonStaticMethodCalling{

    public static void main(String[] args) {
        float a = 50.1f;
        float b = 100.1f;
        NonStaticMethodCalling nonStaticMethodCalling = new NonStaticMethodCalling();     // non static method calling by creating an object
     float result =   nonStaticMethodCalling.sub(a,b);
        System.out.println("result is "+result);
    }

    public float sub(float a, float b){
        return b-a;
    }

}
