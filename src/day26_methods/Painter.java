package day26_methods;

public class Painter {

    public static void main(String[] args) {
        Picture.draw(); //two classes are under the same package so no need to import that package
        Picture.draw("blue");
        Picture.draw("blue", "red");
        //Photo.draw(); //need to import the package and the class name since this class is another package
    }
}
