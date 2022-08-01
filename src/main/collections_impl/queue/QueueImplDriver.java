package collections_impl.queue;

public class QueueImplDriver {
    public static void main(String args[]){
        Queue queue = new Queue();
        queue.add(34);
        queue.add(54);
        System.out.println("Size : " + queue.size());
        queue.add(7);

        System.out.println("Peeking : " + queue.peek());
        queue.poll();
        System.out.println("Peeking after removing : " + queue.peek());

    }
}
