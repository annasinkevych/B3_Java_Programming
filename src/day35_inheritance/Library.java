package day35_inheritance;

public class Library {

    public static void main(String[] args) {
        Book obj1 = new Book();
        //obj1 has access to 5 instance variables of the class

        AudioBook ab1 = new AudioBook();
        //ab1 - has access to 7 instance variables(5 from Parent+ 2 from itself) and 1 instance method from itself

        EBook eb1 = new EBook();
        //eb1 - has access to 7 instance variables(5 from Parent+ 2 from itself) and 1 instance method from itself


        Author author1 = new Author("Anna Nicol", 30);

        Book b1 = new Book();

        b1.author = new Author("Gabriel Garcia", 80);
        System.out.println(b1.author);
        AudioBook audioBook = new AudioBook();
        audioBook.author = new Author("Thomas Jefferson", 78);
        System.out.println(audioBook.author.getName());

        Book book2 = new AudioBook();

    }
}
