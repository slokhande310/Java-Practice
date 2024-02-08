class QueueUsingArray{

    int front_Q, rear_Q, capacity_Of_Q;
    static int[] q_array;
    QueueUsingArray(int size){
        capacity_Of_Q = size;
        q_array = new int[size];
    }

    // add elements using enqueue method
    void enqueue(int value){
        // checks if capacity full or not
        if (rear_Q == capacity_Of_Q){
            System.out.println("Queue Full");
        } else {
            // add element in array
            q_array[rear_Q] = value;
            rear_Q++;
        }
    }

    // delete element using dequeue method
    void dequeue(){
        // checks if both rear and front are pointing to same location
        if (rear_Q == front_Q) {
            System.out.println("Queue Empty, Nothing to Delete");
        } else {
            // if dequeued, move front by 1 and display that element
            front_Q++;
        }
    }

    void display(){
        // initialize i with front_Q to ignore previous elements
        for (int i = front_Q; i < rear_Q; i++) {
            System.out.print(q_array[i] + " ");
        }
    }
}

public class QueueExample {
    public static void main(String[] args) {
        QueueUsingArray q1 = new QueueUsingArray(5);
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        System.out.print("ITEMS IN QUEUE: ");
        q1.display();
        q1.dequeue();
        q1.dequeue();
        System.out.print("\nITEMS IN QUEUE: ");
        q1.display();
    }
}
