class test{
    public static void main(String[] args) {
        Logger logger1= Logger.getInstance();
        Logger logger2= Logger.getInstance();
        if(logger1==logger2){
            System.out.println("both objects uses same reference so single pattern follows");
        }
        else {
            System.out.println("both objects uses different reference so single pattern does not follows");
        }
    }
}