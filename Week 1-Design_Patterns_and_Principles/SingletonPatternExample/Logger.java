public class Logger {
    // class names Logger with a private static instance of itself
    private static Logger loggerInstance;

    // private constructor
    private Logger() {
    }

    // public static method to get instance of the class
    public static Logger getInstance() {
        if (loggerInstance == null) {
            synchronized (Logger.class) {
                if (loggerInstance == null) {
                    loggerInstance = new Logger();
                }
            }
        }
        return loggerInstance;
    }

    // sample logging method
    public void log(String msg) {
        System.out.println("LOG: " + msg);
    }
}