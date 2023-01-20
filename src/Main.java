public class Main {
    static class Ronaldo implements Runnable
    {
        @Override
        public void run()   {
            for (int i = 0; i < 5; i++) {
                System.out.println("Ronaldo");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    //main is the single thread until you create a second
    public static void main(String[] args) throws InterruptedException {
        Ronaldo r=new Ronaldo();

        Thread t=new Thread(r);
        t.start();
        //the above 2 lines when you are using runnable interface to create new thread


        //class ronaldo should extends to Thread.-> as we are creating new thread.
        //start is the method to start the thread, it will directly send to run method
//        r.start();

        for(int i=0;i<5;i++)
        {
            System.out.println("Messi");
            Thread.sleep(1);

        }
    }
}