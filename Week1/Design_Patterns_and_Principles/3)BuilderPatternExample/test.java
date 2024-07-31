class test{
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder("AMD Ryzen 5 5600H",8,512).Build();
        System.out.println("CPU : "+basicComputer.Cpu);
        System.out.println("RAM : "+basicComputer.Ram+"GB");
        System.out.println("Storage : "+basicComputer.Storage+"GB");
        System.out.println("***************************");
        Computer basicComputer2 = new Computer.Builder("AMD Ryzen 9 9600H",64,2000).Build();
        System.out.println("CPU : "+basicComputer2.Cpu);
        System.out.println("RAM : "+basicComputer2.Ram+"GB");
        System.out.println("Storage : "+basicComputer2.Storage+"GB");
    }
}