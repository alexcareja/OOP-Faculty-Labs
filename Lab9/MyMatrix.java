import java.util.Vector;

public class MyMatrix implements Sumabil<MyMatrix>{

    int[][] matr;

    MyMatrix(){
        this(0, 1, 2, 3);
    }

    MyMatrix(int a, int b, int c, int d){
        matr = new int[4][4];
        for(int i = 0; i < 4; i++) {
            matr[0][i] = a;
            matr[1][i] = b;
            matr[2][i] = c;
            matr[3][i] = d;
        }

    }

    int getVal(int i, int j) {
        return matr[i][j];
    }

    public void addValue(MyMatrix value) {
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                matr[i][j] += value.getVal(i, j);
            }
        }
    }
}
