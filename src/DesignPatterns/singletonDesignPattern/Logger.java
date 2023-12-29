package DesignPatterns.singletonDesignPattern;

public class Logger {
    private static Logger logger;

    private Logger(){

    }
    public static Logger getInstance(){
        if(null == logger){
            synchronized (Logger.class){
                if(null == logger){
                    logger = new Logger();
                }
            }
        }
        return logger;
    }
    public void log(){
        System.out.println("Logged successfully...");
    }
}
