package commands;

import diagram.DiagramCanvas;
import diagram.DiagramComponent;

public class ChangeText implements DrawCommand {
    private String text;
    private DiagramCanvas canvas;
    private int id;
    private String oldText;

    public ChangeText(DiagramCanvas canvas, int id, String text) {
        this.text = text;
        this.canvas = canvas;
        this.id = id;
    }

    @Override
    public void execute() {
        this.oldText = canvas.getComponent(this.id).getText();
        canvas.getComponent(this.id).setText(this.text);
    }

    @Override
    public void undo() {
        canvas.getComponent(this.id).setText(this.oldText);
    }
}
