package commands;

import diagram.DiagramCanvas;
import diagram.DiagramComponent;

public class DrawRectangle implements DrawCommand {
    private DiagramCanvas canvas;
    private DiagramComponent addedComponent;

    public DrawRectangle(DiagramCanvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public void execute() {
        addedComponent = new DiagramComponent();
        canvas.addComponent(addedComponent);
    }

    @Override
    public void undo() {
        canvas.removeComponent(addedComponent);
    }
}
