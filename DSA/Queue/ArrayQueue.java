
public class ArrayQueue {
    static class Queue{
        static int [] queue;
        static int size;
        static int rear;

        public Queue(int n) {
            queue = new int[n];
            size = n;
            rear=-1;
        }

        public  boolean isEmpty(){
            return rear == -1;
        }

        public  void add(int n){
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }
            rear +=1;
            queue[rear] = n;
        }
        public  int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = queue[0];
            for(int i =0;i< rear;i++){
                queue[i] = queue[i+1];
            }
            rear = rear-1;
            return front;
        }

        public int peek(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return queue[0];
        }

        
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
