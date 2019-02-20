/*
firstFree - nazewnictwo może być dowolne. Generalnie jest to najważniejszy element stosu
, tak zwany wierzchołek. Odpowiada za prawidłowe dodawanie, zdejmowanie, generowanie rozmiaru.
Generalnie to taki boss stosowego półświatka.I w tym momencie mamy dwie możliwości.
Albo wskazywać na pierwsze wolne miejsce (jak zrobiłem ja), albo na ostatnio zajęte. Zmiany w obu
przypadkach są kosmetyczne, trzeba tylko być świadomym, który warian implementujemy.

pop, push- elementy są dodawane / zdejmowane, z odpowiedniego miejsca wskazywanego przez wierzchołek,
generalnie żadnej magii. Istotne (najistotniejsze?) jest, aby w wyżej wymienionych metodach
, nie zapomnieć o inkrementacjach / dekrementacjach owej zmiennej wierzchołkowej.

display -Metoda ciekawa, ze względu na to, że aby zachować właściwości stosu, elementy musimy wyświetlać w odwrotnej
kolejności, tak jak ściągamy arkusze blachy, od samej góry, do samego dołu.

clean - również bez czarów. Zerujemy wierzchołek, zerujemy tablicę (choć to niekonieczne. Wartości po prostu będą podmieniane).
*/

package struktury_danych;

public class Stack {

    // Zdefiniowanie tablicy i elementów odpowiedzialnych za wierzchołek.
    double[] tab;
    int firstFree;

    // Konstruktor, który zainicjuje wierzchołek i stos o odpowiedniej
    // wielkości.
    public Stack(int MaxSize) {
        tab = new double[MaxSize];
        firstFree = 0;
    }

    // Metoda zwracająca maksymalny rozmiar stosu
    int getMaximumStackSize() {
        return tab.length;
    }

    // Metoda zwracająca prawdę, jeżeli stos jest pusty
    boolean isEmpty() {
        if (firstFree == 0) {
            return true;
        } else
            return false;
    }

    // Metoda zwracająca rozmiar stosu
    int getSize() {
        return firstFree;
    }

    // Metoda dodająca na stos
    void Push(double E) throws ArrayIndexOutOfBoundsException {
        if (firstFree < tab.length) {
            tab[firstFree] = E;
            firstFree++;

        } else {
            throw new ArrayIndexOutOfBoundsException(
                    "Przepełnienie stosu, operacja nie powiodła się");
        }
    }

    // Metoda zdejmująca ze stosu
    double Pop() throws IndexOutOfBoundsException {
        if (firstFree <= 0) {
            throw new IndexOutOfBoundsException(
                    "Stos jest pusty, operacja nie powiodła się");
        }

        double temp = tab[firstFree - 1];
        firstFree--;
        return temp;
    }

    // Metoda wyświetlająca zawartość stosu
    void display() throws IndexOutOfBoundsException {
        if (firstFree == 0) {
            throw new IndexOutOfBoundsException(
                    "Stos jest pusty, operacja nie powiodła się");
        }

        int temp = firstFree - 1;
        do {
            System.out.println(tab[temp]);
            temp--;
        } while (temp > -1);

    }

    // Metoda wielokrotnego zdjęcia
    void multiPop(int k) {
        if (k < firstFree) {
            for (int i = k; i > 0; i--) {
                System.out.println(Pop());
            }
        }
    }

    // Metoda czyszcząca stos
    void clear() {
        for (int i = 0; i < firstFree; i++) {
            tab[i] = 0.0;

        }

        firstFree = 0;
    }

    // Metoda odwracająca kolejność elementów na stosie
    void reverse() {
        for (int i = 0; i < firstFree / 2; i++) {
            double temp = tab[i];
            tab[i] = tab[firstFree - 1 - i];
            tab[firstFree - 1 - i] = temp;

        }
    }
}