public class MyVector3 implements Sumabil<MyVector3> {
    private double x;
    private double y;
    private double z;

    MyVector3(){
        this(0, 0, 0);
    }

    MyVector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void addValue(MyVector3 value) {
        this.x += value.getX();
        this.y += value.getY();
        this.z += value.getZ();
    }
}
