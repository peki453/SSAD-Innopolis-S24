
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CommandHistory history = new CommandHistory();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String input = scanner.nextLine();
        editor.addText(input);

        // Assume user wants to copy and then paste
        Command copy = new CopyCommand(editor);
        Command paste = new PasteCommand(editor);

        copy.execute(); // Copy current text
        paste.execute(); // Paste text
        history.push(copy);
        history.push(paste);

        System.out.println("Current text: " + editor.getText());

        // Undo last command
        if (!history.isEmpty()) {
            history.pop().undo();
            System.out.println("Text after undo: " + editor.getText());
        }
    }
}
