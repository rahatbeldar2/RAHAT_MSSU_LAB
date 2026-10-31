import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {

        // 1. Creation: Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // 2. Add elements: Dynamically grows as items are appended
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        // ArrayLists allow duplicate values and maintain insertion order
        fruits.add("Apple");
        System.out.println("Initial List: " + fruits);
        // Initial List: [Apple, Apple, Banana, Mango, Orange, Apple]

        // 3. Access elements: O(1) constant-time random access via index
        String secondFruit = fruits.get(1);
        System.out.println("Element at index 1: " + secondFruit);

        // 4. Update elements
        fruits.set(4, "Blueberry"); // Replaces "Orange" at index 4
        System.out.println("After update: " + fruits);
        // [Apple, Apple, Banana, Mango, Blueberry, Apple]
        
        // 5. Remove elements: Shifts remaining elements left (O(n))
        fruits.remove(3); // Removes "Mango" by index
        fruits.remove("Banana"); // Removes "Banana" by object reference
        System.out.println("After removals: " + fruits);
        // [Apple, Apple, Blueberry, Apple]

        // 6. Check size and existence
        System.out.println("List size: " + fruits.size());
        System.out.println("Contains 'Mango'? " + fruits.contains("Mango"));

        // 7. Iteration: Loop through the list using an enhanced for-loop
        System.out.print("Iterating through elements: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 8. Sorting: Use the Collections utility class to sort alphabetically
        Collections.sort(fruits);
        System.out.println("Sorted List: " + fruits);

        // 9. Clear the list
        fruits.clear();
        System.out.println("Is list empty after clear?: " + fruits.isEmpty());

        // --- Re-adding elements to demonstrate the Iterator below ---
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        // -------------------------------------------------------------

        // 10. Obtain the Iterator object
        Iterator<String> fruitIterator = fruits.iterator();
        
        // 11. Loop through the fruits using the iterator
        System.out.println("\nScanning fruit basket:");
        while (fruitIterator.hasNext()) {
            String fruit = fruitIterator.next();
            System.out.println("Checking: " + fruit);

            // 12. Safely remove a fruit during iteration
            if (fruit.equals("Banana")) {
                fruitIterator.remove();
                System.out.println(" -> Removed Banana from the list!");
            }
        }

        // 13. Display the final list
        System.out.println("Final List: " + fruits);
    }
}