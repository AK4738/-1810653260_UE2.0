import javax.swing.*;

public class Aufgabe4_1810653260 {
    public static void main (String[] args){
        for (int i = 1; i < 11; i++){//wenn man eine Vaiable hat wo der wert inkrementiert wird
            System.out.println("Der Schleifenzähler ist: " + i);

        int f =0;
        while (f < 10){//wenn man eine Variable hat wo die bedingung erfüllt werden muss
            f++;
            System.out.println("Der Schleifenzähler ist: " + f);
        }

        int a=0;
        do {// führt etwas so weit aus bis die abbruchbedingung erfüllt ist
            a++;
            System.out.println("Der Schleifenzähler ist: " + a);
        }
        while (a < 10);
        }
    }
}
