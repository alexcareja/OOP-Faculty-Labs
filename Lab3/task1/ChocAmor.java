package Task1;

class ChocAmor extends CandyBox {
    // cub
    private float length;

    ChocAmor(){
        super(null, null);
    }

    ChocAmor(String flavor, String origin, float length){
        super(flavor, origin);
        this.length = length;
    }

    @Override
    float getVolume() {
        return length * length * length;
    }

    @Override
    public String toString(){
        return  "The " + this.getOrigin() + " " + this.getFlavor() +
                " has volume " + this.getVolume();
    }

    void printChocAmorDim(){
        System.out.println("length: " + this.length);
    }
    void printDim(){
        System.out.println("length: " + this.length);
    }
}
