public class EnumTest{

    public enum Kolor {

        CZERWONY(false),
        ZIELONY(true),
        NIEBIESKI(true);

        boolean ladny;

        private Kolor(boolean czyLadny) {
            ladny = czyLadny;
        }
    }

    public static void main(String[] args) {

        Kolor kolor = EnumTest.Kolor.CZERWONY;
        System.out.println("Kolor czerwony jest "+czyLadny(kolor));

        kolor = EnumTest.Kolor.ZIELONY;
        System.out.println("Kolor zielony jest "+czyLadny(kolor));

    }

    public static String czyLadny(Kolor kolor) {
        return (kolor.ladny) ? "ladny" : "brzydki";
    }

}