package com.joaodias.section15;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello from main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread(() -> System.out.println("Hello from anonymous thread.")).start();

        Thread myRunnableThread = new Thread(new MyRunnable());
        myRunnableThread.start();

        new Thread(new MyRunnable()) {
            @Override
            public void run() {
                super.run();
            }
        }.start();


        System.out.println("Hello again from the main thread.");
    }

}
