public class Main {
    public static void main(String[] args) {
        car defaultCar = new carBuilder().build();
        System.out.println("Default Car Configuration: \n"+defaultCar);
        System.out.println("\n--------------------------\n");

        car customizedCar = new carBuilder()
                .setModelName("Ford Mustang")
                .setEnginType("Diesel")
                .setColor("Red")
                .setTransmission("Automatic")
                .setSunroof(true)
                .setInfotainmentSystem(true)
                .build();

        System.out.println("Customized Car Configuration: \n"+customizedCar);
    }
}