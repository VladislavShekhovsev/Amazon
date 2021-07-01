package amazon.utilities;

public class BrowserUtils {

    public static void sleep(int seconds){
     seconds*=1000;
     try{
Thread.sleep(seconds);
     } catch (InterruptedException e) {
         System.out.println("something wrong with the time method");
        }
    }
}
