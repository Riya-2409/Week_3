package stackandqueue.queueusingstack;

//Create the class name QueueMain
public class QueueMain {

    public static void main(String args[]){
            Queue queue = new Queue();
            queue.add(1);
            queue.add(2);
            queue.add(3);
            while(!queue.isEmpty()){
                System.out.println(queue.peek());
                queue.remove();
            }
    }
}
