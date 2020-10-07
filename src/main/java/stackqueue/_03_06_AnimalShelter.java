package stackqueue;

import java.util.LinkedList;

/**
 * An animal shelter, which holds only dogs and cats, operates on a strictly "first in, first out" basis.
 * People must adopt either the "oldest" (based on arrival time) of all animals at the shelter,
 * or they can select whether they would prefer a dog or a cat (and will receive the oldest animal of that type).
 * They cannot select which specific animal they would like.
 * <p>
 * Create the data structures to maintain this system and implement operations such as
 * enqueue, dequeueAny, dequeueDog, and dequeueCat.
 * <p>
 * You may use the built-in Linked list data structure.
 */
class _03_06_AnimalShelter {
    LinkedList<Animal> dogs = new LinkedList<>();
    LinkedList<Animal> cats = new LinkedList<>();
    int numAnimals  = 0;

    void enqueueDog(int num) {
        dogs.addLast(new Animal(num, numAnimals));
        numAnimals++;
    }

    void enqueueCat(int num) {
        cats.addLast(new Animal(num, numAnimals));
        numAnimals++;
    }

    int dequeueAny() {
        if (cats.size() == 0) {
            return dogs.removeFirst().num;
        }
        if (dogs.size() == 0) {
            return cats.removeFirst().num;
        }
        return cats.getFirst().counter < dogs.getFirst().counter ? cats.removeFirst().num : dogs.removeFirst().num;
    }

    int dequeueDog() {
        return dogs.removeFirst().num;
    }

    int dequeueCat() {
        return cats.removeFirst().num;
    }

    static class Animal {
        int num;
        int counter;

        Animal(int num, int counter) {
            this.num = num;
            this.counter = counter;
        }
    }
}
