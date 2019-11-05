package Task1;

import java.awt.*;

public class Baravelli extends CandyBox {
    // cilindru
    private float radius;
    private float height;

    Baravelli(){
        super(null, null);
    }

    Baravelli(String flavor, String origin, float radius, float height){
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }

    @Override
    float getVolume() {
        return radius * radius * (float)Math.PI * height;
    }

    @Override
    public String toString(){
        return  "The " + this.getOrigin() + " " + this.getFlavor() +
                " has volume " + this.getVolume();
    }

    void printBaravelliDim(){
        System.out.println("radius: " + this.radius + "\nheight: " + this.height);
    }
    void printDim(){
        System.out.println("radius: " + this.radius + "\nheight: " + this.height);
    }
}
