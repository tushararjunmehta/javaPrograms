public class MultithreadingGetIdAndCurrentThread {
    public static void main(String[] args){
        MyThread1 aa = new MyThread1();
        MyThread2 bb = new MyThread2();
        MyThread3 cc = new MyThread3();
        aa.setPriority(Thread.MIN_PRIORITY);
        bb.setPriority(Thread.NORM_PRIORITY);
        cc.setPriority(Thread.MAX_PRIORITY);
        aa.start();
        bb.start();
        cc.start();
        System.out.println(aa.getId());
        System.out.println(bb.getId());
        System.out.println(cc.getId());
        System.out.println("inside main thread");
        System.out.println("current running thread is : " +Thread.currentThread());
        System.out.println("Id of the current running thread is "+Thread.currentThread().getId());
        System.out.println("priority of the current running thread is "+Thread.currentThread().getPriority());
    }
}
class MyThread1 extends Thread {
    public void run() {

        //System.out.println("Thread One");
        System.out.println("inside MyThread1 ");
        System.out.println("current running thread is "+Thread.currentThread());
        System.out.println("Id of the current running thread is "+Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getPriority());
    }
}
class MyThread2 extends Thread {
    public void run() {
        //System.out.println("Inside MyThread2");
        System.out.println("current running thread is : " +Thread.currentThread());
        System.out.println("Id of the current running thread is "+Thread.currentThread().getId());
        System.out.println("priority of the current running thread is "+Thread.currentThread().getPriority());

    }
}
class MyThread3 extends Thread {
    public void run() {
        System.out.println("Inside MyThread3");
        System.out.println("current running thread is : " +Thread.currentThread());
        System.out.println("Id of the current running thread is "+Thread.currentThread().getId());
        System.out.println("priority of the current running thread is "+Thread.currentThread().getPriority());
    }
}