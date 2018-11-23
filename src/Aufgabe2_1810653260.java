import javax.swing.*;

public class Aufgabe2_1810653260 {
    public static void main (String[] args){

        int zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein:"));
        int zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein:"));


        if (zahl2 == zahl1) {
            JOptionPane.showMessageDialog(null, "" + zahl1);
        }


    }
}
