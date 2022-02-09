package dataStructureAndAlgorithm;

import java.util.Stack;

public class StackExample {

    Stack<Integer> stack = new Stack<>();

    boolean empty(){
        return stack.isEmpty();
    }

    boolean pushData(int data){
         stack.push(data);
         return true;
    }

    boolean popData(){
        return !stack.isEmpty();
    }

    int peekData(){
        return stack.peek();
    }

}
