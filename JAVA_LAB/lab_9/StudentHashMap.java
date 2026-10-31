import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentHashMap {
    public static void main(String[] args) {
        
        // Initialize HashMap and Scanner
        HashMap<Integer, String> students = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        // 1. Store roll numbers and student names
        students.put(101, "Amit");
        students.put(102, "Sneha");
        students.put(103, "Rahul");
        students.put(104, "Priya");

        // 2. Display all entries
        System.out.println("All Student Entries:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // 3. Retrieve a name using a key
        System.out.print("\nEnter roll number to retrieve name: ");
        int rollNo = sc.nextInt();
        
        if (students.containsKey(rollNo)) {
            System.out.println("Student Name: " + students.get(rollNo));
        } else {
            System.out.println("Student not found.");
        }

        // 4. Remove one entry
        System.out.print("\nEnter roll number to remove: ");
        int removeRollNo = sc.nextInt();
        
        if (students.containsKey(removeRollNo)) {
            students.remove(removeRollNo);
            System.out.println("Entry removed successfully.");
        } else {
            System.out.println("Roll number not found.");
        }

        // Display entries after removal
        System.out.println("\nStudent Entries After Removal:");
        System.out.println(students);

        sc.close();
    }
}