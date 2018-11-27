import javax.swing.*;

public class Aufgabe5_1810653260 {
    public static void main(String[] args){

        forSchleife(5);//werte für die methoden zugewiesen
        forSchleife(10);
        whileSchleife(5);
        whileSchleife(10);
        nutzerschleife();

    }

   public static void forSchleife(int a){
        for (int i = 0; i <= a; i++){
            System.out.println("Ausgabe = " + i);
        }
    }

   public static void whileSchleife(int a){
        int i = 0;

        while(i <= a){
            System.out.println(i);
            i = i + 2;// nur gerade Zahlen
        }
    }

   public static void nutzerschleife(){
        int a = Integer.parseInt(JOptionPane.showInputDialog("1. Zahl eingeben:"));//auffordern eine zahl einzugeben
        int b = Integer.parseInt(JOptionPane.showInputDialog("2. Zahl eingeben:"));
        int c = 0;

        for (int i = 0; i < a; i++){//die innere schleife wiederholen
            for (int j = 0; j < b; j++){
                c++;
                System.out.println("Das ist der " + c + ". Durchlauf der inneren Schleife!");
            }
        }
    }

}