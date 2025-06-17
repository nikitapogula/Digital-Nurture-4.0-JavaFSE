public class SingletonTest {
    public static void main(String[] args) {
        // get instances of logger
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();
        // log messages using references
        log1.log("This is test message 1");
        log2.log("This is test message 2");
        // check if they point to the same instance
        if (log1 == log2) {
            System.out.println("Logger instances are same");
        } else {
            System.out.println("Logger instances are not same");
        }
    }
}
