package Task1;

public class Lindt extends CandyBox {
    // paralelipiped dreptunghic
    private float length;
    private float width;
    private float height;

    Lindt(){
        super(null, null);
    }

    Lindt(String flavor, String origin, float length, float width, float height){
        super(flavor, origin);
        this.height = height;
        this.length = length;
        this.width = width;
    }

    @Override
    float getVolume() {
        return length * width * height;
    }

    @Override
    public String toString(){
        return  "The " + this.getOrigin() + " " + this.getFlavor() +
                " has volume " + this.getVolume();
    }

    void printLidntDim(){
        System.out.println("length: " + this.length + "\nwidth: " + this.width +
        "\nheight: " + this.height);
    }
    void printDim(){
        System.out.println("length: " + this.length + "\nwidth: " + this.width +
                "\nheight: " + this.height);
    }
}
