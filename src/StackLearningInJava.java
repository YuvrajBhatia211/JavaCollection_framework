import java.util.Stack;

public class StackLearningInJava {

    public static void main(String[] args){
        Stack<String> animals = new Stack<>();
        //add elements in stack
        animals.push("tiger");
        animals.push("cow");
        animals.push("crayon");

        //printing elements in stack
        System.out.println("Stack" + animals);
        //peek is used to make share that which element in the stack is at the top
        System.out.println(animals.peek());

        //pop function removes last in first out object
        animals.pop();
        System.out.println(animals);
        System.out.println();
    }
}
