class QueueTester {
    public static void main(String[] args)
    {
        // Create iterable Queue of Words
        Object[] words = new String[] { "seven", "slimy", "snakes", "sallying", "slowly", "slithered", "southward"};
        QueueManager<Object> qWords = new QueueManager<Object>("Words", words );
        qWords.printQueue();
        qWords.extractHead();
        qWords.printQueue();

        // The following code is temporarily commented out and are optional to use for testing Queue
        // Create iterable Queue of Integers
        Integer[] numbers = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        QueueManager<Integer> qNums = new QueueManager<Integer>("Integers", numbers );
        qNums.printQueue();
        qNums.extractHead();
        qNums.printQueue();

         
        Animal[] animals = new Animal[] {
            new Animal("Lion", 8, "gold"),
            new Animal("Tiger", 5, "yellow"),
            new Animal("Parrot", 2, "green")
        };
        QueueManager<Animal> qAnimals = new QueueManager<Animal>("My Animals", animals);
        qAnimals.printQueue();
        qAnimals.extractHead();
        qAnimals.printQueue();

        /*
        // Create iterable Queue of Mixed types of data
        QueueManager qMix = new QueueManager("Mixed");
        qMix.queue.add("Start");
        qMix.addList(
                words,
                numbers,
                Alphabet.alphabetData(),
                Animal.animalData(),
                Cupcakes.cupCakeData()
        );
        qMix.queue.add("End");
        qMix.printQueue(); */
    }
}