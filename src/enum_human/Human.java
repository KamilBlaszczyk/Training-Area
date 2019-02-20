package enum_human;

public class Human {

    public String name;
    public int old;

    public ColorOfEye colorOfEye;
    public ColorOfHair colorOfHair;

    public Human(String name, int old, ColorOfEye colorOfEye, ColorOfHair colorOfHair) {
        this.name = name;
        this.old = old;
        this.colorOfEye = colorOfEye;
        this.colorOfHair = colorOfHair;
    }

    public String getName() {
        return name;
    }

    public int getOld() {
        return old;
    }

    public ColorOfEye getColorOfEye() {
        return colorOfEye;
    }

    public ColorOfHair getColorOfHair() {
        return colorOfHair;
    }

    @Override
    public String toString() {
        return
                "name=" + name +
                ", old=" + old +
                ", colorOfEye=" + colorOfEye +
                ", colorOfHair=" + colorOfHair;
    }
}
