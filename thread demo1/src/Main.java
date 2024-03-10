class A extends Thread{
    private int start;
    private int end;

    public A(int start,int end){
        this.start=start;
        this.end=end;
    }
    public void run(){
        for (int i = start; i <=end ; i++) {
            System.out.println(Thread.currentThread().getName()+" : "+i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class Main  {
    public static void main(String[] args) {
        A thread1=new A(1,5);
        A thread2=new A(6,10);

        thread1.start();
        thread2.start();
    }
}