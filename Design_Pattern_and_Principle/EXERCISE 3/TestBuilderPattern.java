package designerprinciple;

public class TestBuilderPattern {
    public static void main(String[] args) {
         Computer basicComputer = new Computer.Builder("Intel i5", 8).build();
        System.out.println("Basic Computer: " + basicComputer);
        Computer gamingComputer = new Computer.Builder("AMD Ryzen 7", 16)
                .setStorage(512)
                .setGraphicsCard(true)
                .setWiFi(true)
                .build();
        System.out.println("Gaming Computer: " + gamingComputer);
        Computer officeComputer = new Computer.Builder("Intel i7", 16)
                .setStorage(256)
                .build();
        System.out.println("Office Computer: " + officeComputer);
    }
}
