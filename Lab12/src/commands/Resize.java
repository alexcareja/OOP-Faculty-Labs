package commands;

import diagram.DiagramCanvas;

public class Resize implements DrawCommand {
    private float procent;
    private DiagramCanvas canvas;
    private int id;
    private int oldHeight;
    private int oldWidth;

    public Resize(DiagramCanvas canvas, int id, float procent) {
        this.procent = procent;
        this.canvas = canvas;
        this.id = id;
    }

    @Override
    public void execute() {
        this.oldHeight = canvas.getComponent(this.id).getHeight();
        this.oldWidth = canvas.getComponent(this.id).getWeight();
        canvas.getComponent(this.id).setHeight(Math.round(canvas.getComponent(this.id).getHeight()
                * procent));
        canvas.getComponent(this.id).setWeight(Math.round(canvas.getComponent(this.id).getWeight()
                * procent));
    }

    @Override
    public void undo() {
        canvas.getComponent(this.id).setHeight(this.oldHeight);
        canvas.getComponent(this.id).setWeight(this.oldWidth);
    }
}
