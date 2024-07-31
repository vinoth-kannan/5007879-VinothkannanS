public class test {
    public static void main(String[] args) {
        Light DiningRoomLight = new Light();
        Light HallAreaLight = new Light();

        Command lightOnDining = new LightOnCommand(DiningRoomLight);
        Command lightOffDining = new LightOffCommand(DiningRoomLight);
        Command lightOnHallArea = new LightOnCommand(HallAreaLight);
        Command lightOffHallArea = new LightOffCommand(HallAreaLight);

        RemoteControl remote = new RemoteControl();

        System.out.println("Status of the Dining Room Light :");
        remote.setCommand(lightOnDining);
        remote.pressButton();

        System.out.println("Status of the Hall Area Light :");
        remote.setCommand(lightOnHallArea);
        remote.pressButton();

        System.out.println("Status of the Dining Room Light :");
        remote.setCommand(lightOffDining);
        remote.pressButton();

        System.out.println("Status of the Hall Area Light :");
        remote.setCommand(lightOffHallArea);
        remote.pressButton();
    }
}