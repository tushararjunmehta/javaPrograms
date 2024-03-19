public class Multithreading {
    public static void main(String[] args) {
        new A().start();  // creating temporary object of class A
        B bb= new B(); // creating a proper object of the class B. Both the lines for A and B class will do the same work
        bb.start();
        new C().start();
    }
    }
    class A extends Thread {
        public void run() {
            for (int i = 0; i < 5 ;i++){
                System.out.println("i="+i);
            }

        }
    }
    class B extends Thread{
        public void run(){
            for(int j=1; j<=10;j++){
                System.out.println("j="+j);

            }
        }
        }

class C extends Thread{
    public void run(){
        for(int k =1;k<5;k++){
            System.out.println("k="+k);
        }
    }
}


//newborn state
//runnable
//running
//blocked
//dead
