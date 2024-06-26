package day42_a_collection_map.list;

import java.util.Stack;

public class StackObjects {

    public static void main(String[] args) {
        Stack <Character> stack = new Stack<>();
        //push() ----> add()
        //pop() ---> remove()
        //peek() ---> get()

        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        System.out.println(stack);

        System.out.println("Top of my stack: " + stack.peek()); //returns what was added last--> at the TOP of my data structure,


        stack.remove(0); //this will remove the first element added
    }
}
