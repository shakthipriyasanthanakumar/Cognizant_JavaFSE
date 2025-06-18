package Cognizant_JavaFSE.week1.Design_Patterns_and_Principles.SingletonPatternExample.src;
class Main{
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance(); 
        logger1.log("First message.");

        Logger logger2 = Logger.getInstance(); 
        logger2.log("Second message.");

        System.out.println("Are both loggers same? " + (logger1 == logger2)+".");
    }
}