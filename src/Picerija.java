import javax.swing.*;
public class Picerija {

    public static void main(String args[]){
        String[] opcijas = {"Pasūtīt", "veidot savu picu", "vel informacija", "cenas", "Neko, pārdomāju!"};
        String getFavFruit = (String) JOptionPane.showInputDialog(
                null,
                "Laipni lūgti pcas veikalā",
                "Ko darīt?",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcijas,
                opcijas[3]);








    }


}
