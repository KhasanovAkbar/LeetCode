

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab {
    private static List<String> notes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("Welcome to MobileNotes!");
            System.out.println("1. View Notes");
            System.out.println("2. Add Note");
            System.out.println("3. Edit Note");
            System.out.println("4. Delete Note");
            System.out.println("5. Search Notes");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    viewNotes();
                    break;
                case 2:
                    addNote();
                    break;
                case 3:
                    editNote();
                    break;
                case 4:
                    deleteNote();
                    break;
                case 5:
                    searchNotes();
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting MobileNotes. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void viewNotes() {
        System.out.println("Your Notes:");
        if (notes.isEmpty()) {
            System.out.println("No notes available.");
        } else {
            for (int i = 0; i < notes.size(); i++) {
                System.out.println((i + 1) + ". " + notes.get(i));
            }
        }
    }

    private static void addNote() {
        System.out.print("Enter your note: ");
        String note = scanner.nextLine();
        notes.add(note);
        System.out.println("Note added successfully.");
    }

    private static void editNote() {
        viewNotes();
        System.out.print("Enter the number of the note you want to edit: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (index >= 1 && index <= notes.size()) {
            System.out.print("Enter the updated note: ");
            String updatedNote = scanner.nextLine();
            notes.set(index - 1, updatedNote);
            System.out.println("Note updated successfully.");
        } else {
            System.out.println("Invalid note number.");
        }
    }

    private static void deleteNote() {
        viewNotes();
        System.out.print("Enter the number of the note you want to delete: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (index >= 1 && index <= notes.size()) {
            notes.remove(index - 1);
            System.out.println("Note deleted successfully.");
        } else {
            System.out.println("Invalid note number.");
        }
    }

    private static void searchNotes() {
        System.out.print("Enter search keyword: ");
        String keyword = scanner.nextLine();
        boolean found = false;
        for (String note : notes) {
            if (note.contains(keyword)) {
                System.out.println("- " + note);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching notes found.");
        }
    }
}

