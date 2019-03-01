package Wydarzenia;

public class Events {

    private String nazwa;
    private int dzien;
    private int miesiac;


    public Events(String nazwa, int dzien, int miesiac){
        this.nazwa = nazwa;
        this.dzien = dzien;
        this.miesiac = miesiac;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getDzien() {
        return dzien;
    }

    public int getMiesiac() {
        return miesiac;
    }

    //ctrl+ /
//    public String toString() {
//        return "nazwa: " + nazwa + "opis: " + dzien;
//    }


}
