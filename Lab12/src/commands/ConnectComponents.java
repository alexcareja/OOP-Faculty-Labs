package commands;

import diagram.DiagramCanvas;

public class ConnectComponents implements DrawCommand {
    private DiagramCanvas canvas;
    private int id1;
    private int id2;

    public ConnectComponents(DiagramCanvas canvas, int id1, int id2) {
        this.canvas = canvas;
        this.id1 = id1;
        this.id2 = id2;
    }

    @Override
    public void execute() {
        canvas.getComponent(id1).connectTo(canvas.getComponent(id2).toString());
        canvas.getComponent(id2).connectTo(canvas.getComponent(id1).toString());
    }

    @Override
    public void undo() {
        canvas.getComponent(id2).removeConnection(canvas.getComponent(id1).toString());
        canvas.getComponent(id1).removeConnection(canvas.getComponent(id2).toString());
    }
}
