//class MultithreadingUsingRunnableInterface implements Runnable {
//    public void run() {
//        int i = 0;
//        while (i <= 50) {
//            System.out.println("I am class one loop");
//            i = i + 1;
//        }
//
//    }
//}
//   class MyThread implements Runnable{
//        public void run(){
//            int i=0;
//            do{
//                System.out.println("I am class two loop");
//                i=i+1;
//            }while(i<=50);
//        }
//
//    }
//
//public class Demo4{
//    public static void main(String[] args) {
//        MultithreadingUsingRunnableInterface aa= new MultithreadingUsingRunnableInterface();
//        MyThread bb= new MyThread();
//        aa.start();
//        bb.start();
//    }
//}
