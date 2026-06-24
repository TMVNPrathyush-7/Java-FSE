public class SingletonPattern {

    public static void main(String[] args) {

        AppLogger loggerA = AppLogger.getLogger();
        AppLogger loggerB = AppLogger.getLogger();

        loggerA.writeLog("Application Started");

        System.out.println(loggerA == loggerB);
    }
}

class AppLogger {

    private static AppLogger instance;

    private AppLogger() {
        System.out.println("Logger Object Created");
    }

    public static AppLogger getLogger() {

        if (instance == null) {
            instance = new AppLogger();
        }

        return instance;
    }

    public void writeLog(String message) {
        System.out.println(message);
    }
}