class Cpu {
    private final int price; 
    public Cpu(int price) {
        this.price = price;
    }
    class Processor {
        int core;
        String name;
        Processor(int core, String name) {
            this.core = core;
            this.name = name;
        }
        void display() {
            System.out.println("CPU Price: " + price);
            System.out.println("Processor Cores: " + core);
            System.out.println("Processor Manufacturer: " + name);
        }
    }
    static class Ram {
        int size;
        String name;
        Ram(int size, String name) {
            this.size = size;
            this.name = name;
        }
        void display() {
            System.out.println("RAM Size: " + size + "GB");
            System.out.println("RAM Manufacturer: " + name);
        }
    }
}
public class inner {
    public static void main(String[] args) {
        Cpu c = new Cpu(60000);
        Cpu.Processor p = c.new Processor(16, "Intel");
        p.display();
        Cpu.Ram r = new Cpu.Ram(16, "Adata");
        r.display();
    }
}
