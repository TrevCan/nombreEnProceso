package main;

/**
 * my implementation of the queue data structure
 */
public class MyQueue {

    int counter = 0;
    private char[] queue;
    // tail is the first index to an empty element
    public int tail = 0;
    private int head = 0;
    private static int MAX = 100;


    public MyQueue(){

        queue = new char[100];

        queue[0] = '#';

    }

    public void insert(char data){

        if(tail == MAX){
            System.out.println("Queue is full!");
            return;
        }
        queue[tail] = data;
        tail++;

    }

    /**
     * returns and deletes first element of queue
     * @return first element
     */
    public char delete(){

        char c = queue[head];

        if(tail == 0){
            System.out.println("QUEUE is empty.");
            return '#';
        }

        for(int i = 0; i < tail -1; i++){
            queue[i] = queue[i+1];
        }
        queue[tail-1] = 0;
        tail--;

        return c;

    }

    void reduceTail(){
        if(--tail == -1)
            tail = 0;

    }

    /**
     * Hecho por Gil Sotomayor
     * y Hector Canizales
     * @return
     */
   private char internalDeleteRecursive(){
        if(tail == 0 || tail == 1){
            reduceTail();
            char v = queue[0];
            queue[head] = '#';
            return v;
        } else{
            counter--;
           char x = queue[0];
           tail--;
           int w;
           head++;
           //w = head;
           queue[head-1] = queue[head];
           System.out.printf("queue[%d-1] = queue[%d] = %c\n", head,head, queue[head]);
           internalDeleteRecursive();
           //tail = head;
           //System.out.println("new tail is: " + tail);
           //head = 0;
           //System.out.println(this);
           return x;
        }

   }

   public char deleteRecursive(){
       int headBefore = head; // should always be 0
       int tailBefore = tail;
       counter = 5;
       char x = internalDeleteRecursive();
       tail = tailBefore - 1;
       head = headBefore;

       return x;
   }

    public String toString(){
//       tail = 4;
//       head = 0;
        String out = "Queue:\n";
        for(int i = 0; i < tail; i ++){
           out = out + "[" + i + "]\t\t" + queue[i] + "\n";
        }
        if( tail == 0) {
            out += "EMPTYYY\n";
        }
        return out;
    }
}
