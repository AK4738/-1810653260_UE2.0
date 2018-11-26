import javax.swing.*;

public class Aufgabe5_1810653260 {
    public static void main(String[] args){

        forSchleife(5);
        forSchleife(10);
        whileSchleife(5);
        whileSchleife(10);


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
            i += 2;
        }
    }



}