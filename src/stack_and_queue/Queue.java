package stack_and_queue;

import java.util.Stack;

public class Queue {
     Stack<Integer> stackIn;
     Stack<Integer> stackOut;
    public  void push(int a){
        stackIn.push(a);
    }

    public int pop(){
        if(stackOut.isEmpty()){
            while (!stackIn.isEmpty()) stackOut.push(stackIn.pop());
        }
        int result = stackOut.pop();
        return result;
    }

    public int peek(){
        if(stackOut.isEmpty()){
            while (!stackIn.isEmpty()) stackOut.push(stackIn.pop());
        }
        int result = stackOut.peek();
        return result;
    }

    public boolean empty(){
        if(stackOut.isEmpty()&&stackIn.isEmpty()){
            return true;
        }
        return false;
    }


}
