import javax.swing.*;

public class Aufgabe3_1810653260 {
    public static void main(String[] args){

        String eingabe = JOptionPane.showInputDialog("geben Sie ihr Alter ein");
        double alter = Double.parseDouble(eingabe);
        JOptionPane.showMessageDialog(null, alter); //kommadarstellung

        int alter2 = Integer.parseInt(eingabe);
        JOptionPane.showMessageDialog(null, alter2); //normale zahl

        boolean alter3 = Boolean.parseBoolean(eingabe);
        JOptionPane.showMessageDialog(null, alter3); //true oder false

        long alter4 = Long.parseLong(eingabe);
        JOptionPane.showMessageDialog(null, alter4); //unterscheidet sich von int dass dahinter ein L kommt

        char alter5 = eingabe.charAt(0);
        JOptionPane.showMessageDialog(null, alter5); // nur ein zeichen kein text

        byte alter6 = Byte.parseByte(eingabe);
        JOptionPane.showMessageDialog(null, alter6); //wertebereich ist kleiner als int bit

        short alter7 = Short.parseShort(eingabe);
        JOptionPane.showMessageDialog(null, alter7); //wertebereich ist mittelgross 16bit

        float alter8 = Float.parseFloat(eingabe);
        JOptionPane.showMessageDialog(null, alter8); //unterscheidet sich von double dass dahinter ein f kommt

        String alter9 = String.valueOf(alter);
        JOptionPane.showMessageDialog(null, alter9);//alter wird als String wert ausgegeben
    }
}
