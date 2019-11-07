package Task1;

public class Area {
    private CandyBag bag;
    private int number;
    String street;

    Area(){
        this.bag = new CandyBag();
        this.number = -1;
        this.street = "";
    }

    Area(CandyBag bag, int number, String street){
        this.bag = bag;
        this.number = number;
        this.street = street;
    }

    void getBirthdayCard(){
        System.out.println(this.street + this.number + "\nLa multi ani, mama!");
        for(CandyBox candy : this.bag.getCandies()){
            /*if(candy instanceof Lindt){
                ((Lindt) candy).printLidntDim();
            }
            if(candy instanceof Baravelli){
                ((Baravelli) candy).printBaravelliDim();
            }
            if(candy instanceof  ChocAmor){
                ((ChocAmor) candy).printChocAmorDim();
            }*/
            System.out.println(candy);
            candy.printDim();
        }
    }
}
