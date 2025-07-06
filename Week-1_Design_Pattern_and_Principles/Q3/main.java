public class Main {
    public static void main(String[] args) {
        // Basic computer
        Computer basicComputer = new Computer.Builder("Intel i3", "4GB")
                                        .build();
        basicComputer.showSpecs();

        // Gaming computer
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                                        .setStorage("2TB SSD")
                                        .setGPU("NVIDIA RTX 4090")
                                        .setOS("Windows 11")
                                        .build();
        gamingComputer.showSpecs();

        // Office computer
        Computer officeComputer = new Computer.Builder("Intel i5", "16GB")
                                        .setStorage("1TB HDD")
                                        .setOS("Ubuntu Linux")
                                        .build();
        officeComputer.showSpecs();
    }
}
