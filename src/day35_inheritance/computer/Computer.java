package day35_inheritance.computer;

public class Computer {

    String os;
    int memory;

    //all child classes need to have their own constructors
    public Computer(String os, int memory) {
        this.os = os;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", memory=" + memory +
                '}';
    }
}
