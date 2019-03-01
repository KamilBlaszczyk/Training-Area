package Wydarzenia;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class OptionsEvents {

    public static void addEvent(){
        Scanner load = new Scanner(System.in);

        List<Events> lista = new LinkedList<Events>();

        for(int i=0; i<3; i++) {
            System.out.println("Podaj nazwe");
            String name = load.nextLine();

            System.out.println("Podaj dzien");
            int day = load.nextInt();

            System.out.println("Podaj miesiac");
            int month = load.nextInt();
            load.nextLine(); // fejkowy nextLine, ktory jest pominiety przez nextInt

            lista.add(new Events(name, day, month));
        }

        for(Events e:lista){
            System.out.println(e.getNazwa() + " " + e.getDzien() + "." + e.getMiesiac());
        }
    }

}
