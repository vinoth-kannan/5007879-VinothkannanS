class Logger{
    private static Logger instance;
    private Logger(){
        System.out.println("class Logger is initialized");
    }
    public static Logger getInstance(){
        return instance;
    }
}