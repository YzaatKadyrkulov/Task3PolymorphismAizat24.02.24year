import java.util.Arrays;
import java.util.Scanner;

public class Note extends MyPhone {
    private String[] notes = new String[100];
    private static int notesCount = 0;

    public String[] getNotes() {
        return notes;
    }

    public void setNotes(String[] notes) {
        this.notes = notes;
    }

    public static int getNotesCount() {
        return notesCount;
    }

    public static void setNotesCount(int notesCount) {
        Note.notesCount = notesCount;
    }
    public void addNote(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write words: ");
        String note = scanner.next();
        notes[notesCount] = note;
        System.out.println("The words were added");
    }
    public void meaningWord(){
        System.out.println("Word list: ");
        for (int i = 0; i <notesCount; i++) {
            System.out.println(i+1 + ". " + notes[i]);

        }
    }
    public void deleteNote(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What words do you wanna delete?");
        int indexToDelete = scanner.nextInt();
        if(indexToDelete > 0 && indexToDelete <= notesCount){
            for (int i = indexToDelete - 1; i <notesCount - 1; i++) {
                notes[i] = notes[i+1];
            }
            notesCount--;
            System.out.println("The word deleted.");
        } else {
            System.err.println("You gave number wrong. ");
        }
    }
    public void getNote(){
        NoteWhile:
        while(true){
            System.out.println("""
                    1)Add
                    2)OutputWords
                    3)Delete
                    4)Exit""");
            int number = new Scanner(System.in).nextInt();

            switch(number){
                case 1:
                    addNote();
                    break;
                case 2:
                    meaningWord();
                case 3:
                    deleteNote();
                case 4: break NoteWhile;
                default:
                    System.err.println("Error");

            }
        }
    }
}