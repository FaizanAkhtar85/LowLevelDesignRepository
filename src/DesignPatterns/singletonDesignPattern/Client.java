package DesignPatterns.singletonDesignPattern;

public class Client {

    public static void main(String[] args) {
        new Thread(()->{
           Logger logger = Logger.getInstance();
           logger.log();
        }).start();
        new Thread(()->{
            Logger logger = Logger.getInstance();
            logger.log();
        }).start();
        new Thread(()->{
            Logger logger = Logger.getInstance();
            logger.log();
        }).start();
        new Thread(()->{
            Logger logger = Logger.getInstance();
            logger.log();
        }).start();
    }
}
