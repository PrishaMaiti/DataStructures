package LinkedLists;

import java.util.*;

// Week 2 Challenge 3: Build a Stack
public class Stack<T> {
    LinkedList<T> top, bottom;
    int count = 0;

    /**
     *  Add a new object at the top of the Stack,
     *
     * @param  data,  is the data to be inserted in the Stack.
     */
    public void push(T data) {
        // push new object to top of Stack
        LinkedList<T> newTopNode = new LinkedList<T>(data, null);

        if (top == null)  // initial condition
            this.top = this.bottom = newTopNode;
        else {  // nodes exist in Stack
            LinkedList<T> oldTopNode = this.top;
            this.top.setNextNode(newTopNode); // current top points to new top
            this.top = newTopNode;  // update top
            this.top.setPrevNode(oldTopNode);
        }

        count++;
    }

    /**
     *  Delete/remove an existing object from the top of the Stack,
     *
     * @param  data, is the data to be found & popped off from the Stack.
     */
    public T pop() {
        if (top == null)  // initial condition
            return null;
        else {  // nodes in Stack
            LinkedList<T> retNode = this.getTop();
            this.top = this.getTop().getPrevious();  // update top
            if(this.top != null) {
                this.top.setNextNode(null);
            }
            count--;
            return retNode.getData();
        }
    }

    /**
     *  Returns the top object.
     *
     * @return  this.top, the top object in Queue.
     */
    public LinkedList<T> getTop() {
        return this.top;
    }

    /**
     *  Returns the bottom object.
     *
     * @return  this.bottom, the last object in Queue
     */
    public LinkedList<T> getBottom() {
        return this.bottom;
    }

    public int numItems() {
        return this.count;
    }

    /**
     * Print any array objects from stack
     */
    public void printStack() {
        System.out.println("Stack: " + " count: " + this.count);
        System.out.print("Data: (top <- .. <- bottom) ");
        LinkedList<T> node = this.top;
        while(node != null) {
            System.out.print(node.getData() + " <- ");
            node = node.getPrevious();
        }
        System.out.println();
    }
}