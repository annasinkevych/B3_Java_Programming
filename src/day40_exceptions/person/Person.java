package day40_exceptions.person;

public class Person {

    private  String name;
    private  int age;

    public String getName() {
        return name;
    }
    public void setName(String name) throws Exception {
        if(name == null || name.isEmpty()){
            throw new Exception("Name cannot be null or empty");
        }
        else
            this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        if(age< 0 || age > 120){
            throw new IllegalArgumentException("Age must be between 0 and 120");
        }
        else
            this.age = age;
    }
}
