package day33_a_static;

public class UseSong {

    public static void main(String[] args) {

        Song song1 = new Song("Waka Waka");
        System.out.println(song1);
        Song song2 = new Song("Shape of my Heart", 3.0 );
        System.out.println(song2);
        Song song3 = new Song("Rich girl", 3.5, "Gwen Stefani", "pop");
        System.out.println(song3);
    }
}
