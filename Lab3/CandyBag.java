package Task1;

import java.util.ArrayList;

public class CandyBag {
    private ArrayList<CandyBox> candies;

    CandyBag(){
        this.candies = new ArrayList<>();
    }

    void addCandy(CandyBox c){
        candies.add(c);
    }
    int getBagSize(){
        return this.candies.size();
    }

    ArrayList<CandyBox> getCandies(){
        return this.candies;
    }

    CandyBox getCandy(int index) {
        return this.candies.get(index);
    }
}
