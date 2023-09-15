package main;

/**
 * my stack implementation
 * of the stack data structure
 */
public class MyStack {

    // stack is where all the data is.
    private char[] stack;
    // top shall be the nearest index of an element in the array which is empty
    private int top=0;
    private static int MAX=100;

    public MyStack(){

        stack = new char[100];

    }

    /**
     * adds data to the top of the stack
     * @param data
     */
    public void push(char data){
        if (top == MAX) {
            System.out.println("Stack is full!");
            return;
        }

        stack[top] = data;
        top++;

    }

    /**
     * returns and removes the last element from the stack
     * @return
     */
    public char pop(){

        //stack is empty
        if(top == 0)
            return '#';


        // char c will be stack[top -1], then top will decrement by one
        char c = stack[top-- -1];

        //reset value to 0
        stack[top] = 0;
        // return previously retrieved value
        return c;

    }

    @Override
    public String toString(){
        String out = "Stack:\n";
        for(int i = 0; i < top; i ++){
            out = out + "[" + i + "]\t\t" + stack[i] + "\n";
        }
        return out;
    }
}
