package designerprinciple;
public class Computer {
    private final String CPU;
    private final int RAM;
    private final int Storage;
    private final boolean hasGraphicsCard;
    private final boolean hasWiFi;
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
        this.hasGraphicsCard = builder.hasGraphicsCard;
        this.hasWiFi = builder.hasWiFi;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU +
                ", RAM=" + RAM +
                ", Storage=" + Storage +
                ", hasGraphicsCard=" + hasGraphicsCard +
                ", hasWiFi=" + hasWiFi;
    }
    public static class Builder {
        private final String CPU;
        private final int RAM;
        private int Storage = 0;
        private boolean hasGraphicsCard = false;
        private boolean hasWiFi = false;
        public Builder(String CPU, int RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }
        public Builder setStorage(int Storage) {
            this.Storage = Storage;
            return this;
        }
        public Builder setGraphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }
        public Builder setWiFi(boolean hasWiFi) {
            this.hasWiFi = hasWiFi;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
}

