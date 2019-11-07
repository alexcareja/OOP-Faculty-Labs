package Task1;

import java.util.Objects;

public class CandyBox {
    private String flavor;
    private String origin;

    CandyBox(){
        this(null, null);
    }

    CandyBox(String flavor, String origin){
        this.flavor = flavor;
        this.origin = origin;
    }

    float getVolume(){
        return 0;
    }

    @Override
    public String toString(){
        return this.flavor + " " + this.origin;
    }

    String getFlavor(){
        return flavor;
    }

    String getOrigin(){
        return origin;
    }

    void printDim(){
        System.out.println("No candy here");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandyBox candyBox = (CandyBox) o;
        return Objects.equals(flavor, candyBox.flavor) &&
                Objects.equals(origin, candyBox.origin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, origin);
    }
}
