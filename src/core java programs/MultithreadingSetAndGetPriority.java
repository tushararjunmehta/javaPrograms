public class MultithreadingSetAndGetPriority {
    public static void main(String[] args) {
        Tushar aa = new Tushar();
        Arjun bb= new Arjun();
        Mehta cc= new Mehta();
        cc.setPriority(Thread.MAX_PRIORITY);
        bb.setPriority(aa.getPriority()+1);
        aa.setPriority(Thread.MIN_PRIORITY);
        System.out.println("thread A started");
        aa.start();
        System.out.println("thread B started");
        bb.start();
        System.out.println("thread C started");
        cc.start();
        System.out.println("main thread ended");

    }
}
class Tushar extends Thread {
    public void run() {
        System.out.println("thread A started");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i=" + i);

        }
        System.out.println("thread A ends here");
    }
}
    class Arjun extends Thread{
        public void run()
        {
            System.out.println("thread B started");
            for(int j=1;j<=5;j++)
            {
                System.out.println("j="+j);

            }
            System.out.println("thread B ends here");
        }
}
    class Mehta extends Thread {
        public void run() {
            System.out.println("thread C started");
            for (int k = 1; k <= 5; k++) {
                System.out.println("k=" + k);

            }
            System.out.println("thread C ends here");
        }
    }