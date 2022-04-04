import java.util.Iterator;
import java.util.*;
import java.util.Collection;

// Week 2 Challenge 1: Build a Queue
public class Queue<T> implements Iterable<T> {
    LinkedList<T> head, tail;
    int count = 0;

    /**
     *  Add a new object at the end of the Queue,
     *
     * @param  data,  is the data to be inserted in the Queue.
     */
    public void add(T data) {
        // add new object to end of Queue
        LinkedList<T> newTailNode = new LinkedList<T>(data, null);

        if (head == null)  // initial condition
            this.head = this.tail = newTailNode;
        else {  // nodes in queue
            this.tail.setNextNode(newTailNode); // current tail points to new tail
            this.tail = newTailNode;  // update tail
        }
        this.count++;
    }

    /**
     *  Delete/remove an existing object from the front/head of the Queue,
     */
    public T delete() {
        if (head == null)  // initial condition
            return null;
        else {  // nodes in queue
            T oldHeadData = this.head.getData();
            this.head = this.getHead().getNext();  // update head
            if(this.head != null) {
                this.head.setPrevNode(null);
            }
            this.count--;
            return oldHeadData;
        }
    }

    /**
     *  Returns the head object.
     *
     * @return  this.head, the head object in Queue.
     */
    public LinkedList<T> getHead() {
        return this.head;
    }

    public T getHeadData() {
        return this.head.getData();
    }

    /**
     *  Returns the tail object.
     *
     * @return  this.tail, the last object in Queue
     */
    public LinkedList<T> getTail() {
        return this.tail;
    }

    public T getTailData() {
        return this.tail.getData();
    }

    public int getCount() {
        return this.count;
    }

    /**
     *  Returns the iterator object.
     *
     * @return  this, instance of object
     */
    public Iterator<T> iterator() {
        return new QueueIterator<>(this);
    }

    public void print() {
        System.out.println("Queue count: " + this.count);
        System.out.print("Data: ");
        for (T data : this)
            System.out.print(data + " ");
        System.out.println();
    }
}