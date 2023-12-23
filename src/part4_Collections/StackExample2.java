package part4_Collections;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {

        Stack <String> stack1 = new Stack<>();
        stack1.push("Sofi");
        stack1.push("Viki");
        stack1.push("Angi");
        stack1.push("Nast");
        System.out.println(stack1);

        while (!stack1.isEmpty()){
            System.out.println(stack1.pop());
            System.out.println(stack1);
        }
    }
}
