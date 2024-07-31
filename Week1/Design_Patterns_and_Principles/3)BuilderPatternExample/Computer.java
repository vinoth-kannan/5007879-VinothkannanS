class Computer{
    public final String Cpu;
    int Ram;
    int Storage;
    private Computer(Builder builder){
        this.Cpu=Builder.Cpu;
        this.Ram=Builder.Ram;
        this.Storage=Builder.Storage;
    }

    static class Builder{
        public static String Cpu;
        public static int Ram;
        public static int Storage;
        public Builder(String Cpu,int Ram,int Storage){
            this.Cpu=Cpu;
            this.Ram=Ram;
            this.Storage=Storage;
        }
        public Computer Build(){
            return new Computer(this);
        }
    }
}