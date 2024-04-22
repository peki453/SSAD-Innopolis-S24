
public class TextEditor {
    private String text = "";
    private String clipboard = "";

    public void addText(String newText) {
        text += newText;
    }

    public void replaceText(String newText) {
        text = newText;
    }

    public String getText() {
        return text;
    }

    public void setClipboard(String text) {
        clipboard = text;
    }

    public String getClipboard() {
        return clipboard;
    }
}
