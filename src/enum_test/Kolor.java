package enum_test;

public enum Kolor {

    CZERWONY(false),
    ZIELONY(true),
    NIEBIESKI(true);

    boolean ladny;

    private Kolor(boolean czyLadny) {
        ladny = czyLadny;
    }
}