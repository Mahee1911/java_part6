//PREPARED BY GADHIYA MAHEE 21CE029
// Write a program to create thread which display “Hello World” message.
// A. by extending Thread class
// B. by using Runnable interface.

class MultithreadingDemo extends Thread {
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}