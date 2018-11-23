import javax.swing.*;

public class Aufgabe2_1810653260 {
    public static void main (String[] args){

        int zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein:"));// bitten zahl einzugeben
        int zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein:"));
        int i=0; //schleife fangt bei 0 an
        int durch = 0; // durchlauf fangt bei 0 an

        if (zahl1>zahl2){// wenn zahl1 grösser als zahl2 ist, soll
// while schleife wiederholt so weit bis die bedingung wahr ist
            while (i < zahl1-zahl2){//zahl2 solange addiert werden bis es gleich wie zahl1 ist und durchläufe werden gezählt
                zahl2++;
                durch++;


            }
        }
        else{
            while (i < zahl2-zahl1) {
                zahl1++;
                durch++;
            }
        }

        if (zahl1==zahl2){
            JOptionPane.showMessageDialog(null, "Die zahlen sind" + zahl1 + "\nDurchgang:" + durch);

        }

    }


    }

