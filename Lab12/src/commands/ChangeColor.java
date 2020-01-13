package commands;

import diagram.DiagramCanvas;

public class ChangeColor implements DrawCommand {
    private String color;
    private DiagramCanvas canvas;
    private int id;
    private String oldColor;

    public ChangeColor(DiagramCanvas canvas, int id, String color) {
        this.color = color;
        this.canvas = canvas;
        this.id = id;
    }

    @Override
    public void execute() {
        this.oldColor = canvas.getComponent(this.id).getColor();
        canvas.getComponent(this.id).setColor(color);
    }

    @Override
    public void undo() {
        canvas.getComponent(this.id).setColor(this.oldColor);
    }
}
