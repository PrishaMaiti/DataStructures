{% include navigation.html %}
# Tech Talk 0 Data Structures
- There are two main paradigms for programming: imperative which is considered with the state of the program and how it works, and object-oriented which, as the name suggest, is centered around classes and objects.
- We've been working with Java, which is an OOP.
- Procedural programming, a particular type of imperative programming, is NOT the same as functional programming
- Languages like Swift are functional programming languages

# Tech Talk 1: Linked Lists Part 2
- Linked lists make up Stacks and Queues
- Enqueued data adds a tail word to the end of the word phrase: seven slimy snakes sallying slowly slithered southward
- Dequeued data reverses the order: tail remains constant and head changes
- Logic of queues is First In First Out (FIFO)
- Logic of stacks is Last In First Out (LIFO) or Push and Pop
- We have to build our own stack
- The first object in the queue: their previous node would be null, then their next node would be the next object in the queue. That object's previous node would be the previous object and then their next node would be null if there's no next object stacked or the next object if it is stacked
- Each object has to be linked to each other, not just previous to next
- Generic T is a templatized data type that allows the programmer to give a complex data structure a data type without having to worry about figuring out if it's a String, Integer, etc.
- T does not work with primitive types, only reference types like String and wrapper classes like Integer. So an int array would have to be of type Integer in order for it to follow the Generic T protocol.
# Tech Talk 2: Calculator
# Tech Talk 3: Sorts

# Tech Talk 2: Calculator
- We use Reverse Polish Notation (RPN) with string conversion to make computer math easier, since it can be hard to calculate an expression with precedence rules/order of operations
- Operators go into a stack and numbers go into a List
- With appropriate execution of the push and pop functions between the Stack and List once you have the order in RPN, the process will follow the Order of Operations and correctly return the resulting value
- Our task for the week: Build a calculator with basic operators and Power Operator
- Extra Credit: Build variable assignment and evaluation into expressions (ex: a = 2, calculator would evaluate a + 1 returning 3)
- Other extra credit: Add a sqrt function and build a Pythagorean Theorem expression. We might want to look at the Wikipedia article and pseudo code for help
