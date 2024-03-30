package day05_variables;

public class CharExamples {

    public static void main(String[] args)
    {
        //declare and assign value to char datatype variable
        char letterOne = 'a';
        char letterTwo = 'Z';
        char letterThree = '9';
        char letterFour = '%';


    System.out.println(letterOne);
    System.out.println(letterTwo);
    System.out.println(letterThree);
    System.out.println(letterFour);


    System.out.println(letterOne + letterTwo); // adds ASCII table values corresponding to the characters provided
        //by adding two characters like that their datatype becomes int
    char letter = 74; //prints J because datatype of this container is char, it finds that value in ASCII table to print the corresponding letter
    System.out.println(letter);// datatype char prints letter J


    System.out.println(letterOne + letterThree + letterFour);//print 191
    System.out.println(letterOne + " " +  letterTwo + " " + letterFour);//concatenation transforms everything into a string
    System.out.println(" " + letterOne + letterThree + letterFour); //first string transformed it to a concatenation










    }
}
