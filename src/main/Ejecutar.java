package main;

import java.util.Scanner;

public class Ejecutar {
    Scanner in;

    public Ejecutar(){

    }

    public void iniciarPrograma(){
        MyQueue queue;
        queue = new MyQueue();

        queue.insert('a');
        queue.insert('x');
        queue.insert('y');
        queue.insert('f');
        queue.insert('g');
        System.out.println(queue);

        System.out.println(queue.delete());
        System.out.println(queue);

        MyStack stack;
        stack = new MyStack();

        stack.push('a');
        stack.push('b');
        stack.push('c');

        System.out.println(stack);

        System.out.println(stack.pop());

        System.out.println(stack);


        in = new Scanner(System.in);




    }

    /**
     * execute only ONCE!
     */
    private void menu(){

        MyQueue queue2 = new MyQueue();
        MyStack stack2 = new MyStack();

        System.out.println("STACKS and QUEUES");
        System.out.println("Add to STACK AND QUEUE\n\t> add a b c d e ...\n");
        System.out.println("Add to STACK \n\t> stack add a b c d e ...\n");
        System.out.println("Add to QUEUE \n\t> queue add a b c d e ...\n\n");

        System.out.println("Print STACK AND QUEUE \n\t> print\n");
        System.out.println("Print STACK \n\t> stack print\n");
        System.out.println("Print QUEUE \n\t> queue print\n");

        System.out.println("Delete from STACK AND QUEUE\n\t> delete a b c d e ...\n");
        System.out.println("Delete from STACK \n\t> stack pop a b c d e ...\n");
        System.out.println("Delete from QUEUE \n\t> queue delete a b c d e ...\n\n");

        System.out.print("> ");

        while(in.hasNext()){
            String input = in.nextLine();
            System.out.println("RAW input is: input\t" + input);
            if(input.startsWith("add ")) {
                //remove string "add "
                input = input.replace("add ", "");
                System.out.println("input is:\t"+ input);
                //String[] data = in.next().split(" ");
                String[] data = input.split(" ");
                for (int i = 0; i < data.length; i++) {
                    queue2.insert(data[i].charAt(0));
                    stack2.push(data[i].charAt(0));
                }
            }
            else if(input.startsWith("stack add ") || input.startsWith("stack push ")) {
                //remove string "add "
                input = input.replace("add ", "");
                System.out.println("input is:\t"+ input);
                //String[] data = in.next().split(" ");
                String[] data = input.split(" ");
                for (int i = 0; i < data.length; i++) {
                    stack2.push(data[i].charAt(0));
                }
            }
            else if(input.startsWith("queue add ")) {
                //remove string "add "
                input = input.replace("add ", "");
                System.out.println("input is:\t"+ input);
                //String[] data = in.next().split(" ");
                String[] data = input.split(" ");
                for (int i = 0; i < data.length; i++) {
                    queue2.insert(data[i].charAt(0));
                }
            }
            else if(input.startsWith("stack pop")){
                System.out.println(stack2.pop());
            }
            else if(input.startsWith("queue delete")){
                System.out.println(queue2.delete());
            }
            else if(input.startsWith("print")){
                System.out.println(queue2);
                System.out.println(stack2);
            }
            else if(input.startsWith("delete")){
                System.out.println("queue delete:\t" + queue2.delete() );
                System.out.println("stack pop:\t" + stack2.pop());
            }


            System.out.print("> ");

        }

        System.out.println(queue2);
        System.out.println(stack2);
    }
}
