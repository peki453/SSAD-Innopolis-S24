
public class CopyCommand implements Command {
    private TextEditor editor;
    private String backup;

    public CopyCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public boolean execute() {
        backup = editor.getText();
        editor.setClipboard(backup);
        return true;
    }

    @Override
    public void undo() {
        editor.replaceText(backup);
    }
}
