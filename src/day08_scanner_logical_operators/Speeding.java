package day08_scanner_logical_operators;

public class Speeding {

    public static void main(String[] args) {
        int currentSpeed = 60,
               speedLimit = 35;

        //let's say you can go 3 miles more than what is allowed and not be speeding

        boolean speeding = currentSpeed > speedLimit + 3;

        System.out.println("Are you speeding = " + speeding);

    }
}
