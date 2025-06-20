public class Computer {
    // Required attributes
    private String cpu;
    private String ram;

    // Optional attributes
    private String storage;
    private String gpu;
    private String os;

    // Private constructor
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.os = builder.os;
    }

    // Static nested Builder class
    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;
        private String gpu;
        private String os;

        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGPU(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder setOS(String os) {
            this.os = os;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public void showSpecs() {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("GPU: " + gpu);
        System.out.println("OS: " + os);
        System.out.println("--------------------");
    }
}
