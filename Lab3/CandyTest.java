package Task1;

public class CandyTest {
    public static void main(String[] args) {
        CandyBag gift = new CandyBag();
        ChocAmor ca1 = new ChocAmor("Cherry", "Germany",(float)5.0);
        ChocAmor ca2 = new ChocAmor("Capuccino", "Italy", (float)3.5);
        ChocAmor ca3 = new ChocAmor("Cherry", "Germany",(float)5.0);
        Lindt l1 = new Lindt("Choco", "Elvetia", (float)10.7, (float)9.5, 10);
        // Baravelli b1 = new Baravelli()
        gift.addCandy(ca1);
        gift.addCandy(ca2);
        gift.addCandy(ca3);
        gift.addCandy(l1);
        if(gift.getCandy(0).equals(gift.getCandy(2))){
            System.out.println(gift.getCandy(0) + " is the same as " +
            gift.getCandy(2));
        }
        if(gift.getCandy(1).equals(gift.getCandy(2))){
            System.out.println(gift.getCandy(1) + " is the same as " +
                    gift.getCandy(2));
        }
        Area mama = new Area(gift, 3, "Nicolae Beldiceanu");
        mama.getBirthdayCard();
    }
}
