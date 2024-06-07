package day35_inheritance.computer;

public class Windows extends Computer{
//    String os;
    int ram;
    public Windows(String os, int memory, int ram)
    {
        //refers to the super class instance variable os
        //super.os = os;

        //calling the super class constructor and passing the arguments os, memory
        super(os, memory);

        //also refers to the super class instance variable memory if no instance variable of this class was created withe the same name --> otherwise would need to use super keyword
//        this.memory = memory; //or  super.mempory = memory;

        //refers to the instance variable of this class ram
        this.ram = ram;

    }

    @Override
    public String toString() {
        return "Windows{" +
                "os='" + super.os + '\'' +
                ", ram=" + ram + ", memory" + super.memory;
    }
}
