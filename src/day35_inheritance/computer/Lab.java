package day35_inheritance.computer;

public class Lab {

    public static void main(String[] args) {
        Computer newComp = new Computer("Linux", 128);

        Windows w1 = new Windows("Windows 10", 512, 48);
        System.out.println(w1);

        Mac m1 = new Mac("Mac OS", 512);
    }
}
