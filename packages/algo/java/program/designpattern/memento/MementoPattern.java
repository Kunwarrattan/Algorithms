package packages.algo.java.program.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

//Purpose: Save and restore an object’s internal state without violating encapsulation. Commonly used in undo/redo, checkpoints, snapshots.
// Memento
class TextMemento {
    private final String content;

    public TextMemento(String content) {
        this.content = content;
    }

    public String getSavedContent() {
        return content;
    }
}

// Originator
class TextEditor {
    private String content = "";

    public void write(String text) {
        content += text;
    }

    public String getContent() {
        return content;
    }

    public TextMemento save() {
        return new TextMemento(content);
    }

    public void restore(TextMemento memento) {
        content = memento.getSavedContent();
    }
}

// Caretaker
class History {
    private final List<TextMemento> mementoList = new ArrayList<>();

    public void save(TextMemento memento) {
        mementoList.add(memento);
    }

    public TextMemento undo() {
        if (mementoList.size() > 1) {
            mementoList.remove(mementoList.size() - 1); // Remove current
            return mementoList.get(mementoList.size() - 1); // Return previous
        }
        return mementoList.get(0); // fallback to first
    }
}

public class MementoPattern {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.write("Hello ");
        history.save(editor.save()); // snapshot 1

        editor.write("World");
        history.save(editor.save()); // snapshot 2

        editor.write("!");
        System.out.println("Current: " + editor.getContent());

        editor.restore(history.undo()); // undo last
        System.out.println("After Undo: " + editor.getContent());

        editor.restore(history.undo()); // undo again
        System.out.println("After Undo Again: " + editor.getContent());
    }
}
