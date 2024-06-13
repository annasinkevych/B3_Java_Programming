package day36_inheritance.shapes;

public class Shape {
    String name;

    public Shape (String name){
        super();
        this.name = name;
    }


    // This an area method - general method.
    public double area (){
        return 0.0;
    }


    public double perimeter(){
        return 0.0;
    }


    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}
