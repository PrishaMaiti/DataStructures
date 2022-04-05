package LinkedLists;

public class StackTester {

    static private void testCase1() {
        Stack<Integer> myStack = new Stack<Integer>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.printStack();
        System.out.println("Now will pop one item...");
        Integer top = myStack.pop();
        System.out.println("Popped: " + top);
        myStack.printStack();
    }

    static private void testCase2() {
        // Start with a Queue, and use Stack to reverse the Queue
        Integer[] numbers = new Integer[] { 1, 2, 3, 4};
        QueueManager<Integer> qmgrNums = new QueueManager<Integer>("My Integer Q1", numbers );
        qmgrNums.printQueue();
        
        Stack<Integer> myStack = new Stack<Integer>();
        Queue<Integer> origQ = qmgrNums.getQueue(); 
        while(origQ.getCount() > 0) {
            Integer data = origQ.delete(); // extract head of Q
            myStack.push(data);
        }
        myStack.printStack();

        // Integer[] reversedNumbers = new Integer[numbers.length];
        // for(int i=0; i<numbers.length; i++) {
        //     reversedNumbers[i] = myStack.pop();
        // }
        // QueueManager<Integer> qmgrNums2 = new QueueManager<Integer>("My Integer Q2", reversedNumbers );
        // qmgrNums2.printQueue();

        Queue<Integer> newQ = new Queue<Integer>();
        Integer data = myStack.pop();
        while(data != null) {
            newQ.add(data);
            data = myStack.pop();
        }
        newQ.print();

    }

    public static void main(String[] args) {
        testCase2();

    }
}