package videoTutorial;

import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;

public class multithreading {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Runnable task1 = () -> {
            System.out.println("Thread 1: Starting");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1: Ending");
        };

        Runnable task2 = () -> {
            System.out.println("Thread 2: Starting");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2: Ending");
        };

        executorService.submit(task1);
        executorService.submit(task2);

        executorService.shutdown();
    }
}
