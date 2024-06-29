package day13_string;

public class StringImmutable {

    public static void main(String[] args) {

        String str1 = "loop"; //stored in string pool in the heap

        str1 = str1 + "camp"; //using concatenation we've created another string in the string pool in the heap, so str1 now only points to loopcamp, loop has lost its pointer variable and it ends up in garbage collection that gets rid og the unused data in the memory

        String str2 = "loop"; //it creates a brand new one in the string pool in the heap

    }
}
