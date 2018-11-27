import javax.swing.*;

public class Aufgabe4_1810653260 {
    public static void main (String[] args){
        for (int i = 1; i < 11; i++){//wenn man eine Vaiable hat wo der wert inkrementiert wird
            System.out.println("Der Schleifenzähler ist: " + i);

        int f =0;
        while (f < 10){//while-Schleifen wiederholen Anweisungen, solange die Bedingung true liefert.
                        // Wenn die Bedingung bei der ersten Abfrage nicht true liefert, wird die while-Schleife gar nicht erst ausgeführt.
            f++;
            System.out.println("Der Schleifenzähler ist: " + f);
        }

        int a=0;
        do {// Die Anweisungen werden einmal durchgeführt, bevor die Bedingung geprüft wird.
            // Wenn die Bedingung true liefert, werden die Anweisungen erneut ausgeführt.
            a++;
            System.out.println("Der Schleifenzähler ist: " + a);
        }
        while (a < 10);
        }
    }
}
