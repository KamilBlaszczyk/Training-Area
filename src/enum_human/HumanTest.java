package enum_human;

public class HumanTest {

    public static void main(String args []){

        Human human1 = new Human("Pola", 22, ColorOfEye.DARK, ColorOfHair.BROWN);
        Human human2 = new Human("Kamil", 25, ColorOfEye.GREEN, ColorOfHair.BROWN);

        System.out.println(human1);
        System.out.println(human2.getName() + " " + human2.getColorOfEye());

    }

}
