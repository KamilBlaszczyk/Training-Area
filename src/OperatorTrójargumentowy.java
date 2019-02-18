import java.util.Scanner;

public class OperatorTrójargumentowy {

    public static void main (String[] args){

        Scanner load = new Scanner(System.in);

        System.out.println("Podaj n");
        int n = load.nextInt();

        if(n>99){
            System.out.println("Podałeś liczbę więszą od 99");
        }else {
            System.out.println("Podałeś liczbę mniejszą od 99");
        }

        //Zastosowanie operatora tróargumentowego
        int solution = ((n>99) ? 1 : 2);

        System.out.println(solution);

    }
}
