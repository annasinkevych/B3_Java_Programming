package day33_b_encapsulation.day35_inheritance.book;


import my_utilities.StringUtil;

public class Author {

    private String name;

    private int age;

    public Author(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        String result = "";
        //.split(" ") - returns a String Array of 2 words in this case
        for(String each: name.split(" ")){
            result+= StringUtil.fixFormat(each) + " ";
        }
        //result = = "Anna Nicol_" - use trim() to remove the spaces
        this.name = result.trim();

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 10)
            this.age = age;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
