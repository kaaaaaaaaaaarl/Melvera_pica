import javax.swing.*;
import java.util.ArrayList;
public class Picerija {
    private static void pasutit(double cena, ArrayList pasūtījums){

        String[] opcijas1 = {"peperoni +2.50", "hawaii + 3.50", "4 sezonu +4.50", "italiago + 2.50","Pica proscitto +3.00", "Neko, pārdomāju!"};
        String pzzaa = (String) JOptionPane.showInputDialog(
                null,
                "Laipni lūgti pcas veikalā",
                "Ko darīt?",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcijas1,
                opcijas1[3]);
        switch (pzzaa) {
            case "peperoni +2.50":
                cena = cena+ 2.50;
                pasūtījums.add("peperoni");
                break;
            case "hawaii + 3.50":
                cena = cena+ 3.50;
                pasūtījums.add("hawaii");
                break;
            case "4 sezonu +4.50":
                pasūtījums.add("4 sezonu");
                cena = cena+ 4.50;
                break;
            case "italiago + 2.50":
                cena = cena+ 2.50;
                pasūtījums.add("italiago");
                break;
            case "Pica proscitto +3.00":
                cena = cena+ 3;
                pasūtījums.add("Pica proscitto");
                break;
            case "Neko, pārdomāju!":


                break;}}




    public static void main(String args[]){
        double cena = 0;
        boolean repeat = true;
        ArrayList<String> jaunaPica = new ArrayList<String>();
        ArrayList<String> pasūtījums = new ArrayList<String>();










        do {
        String[] opcijas = {"Pasūtīt", "veidot savu picu", "cenas","gatavs, pasūtīt!", "Neko, pārdomāju!"};
        String getFavFruit = (String) JOptionPane.showInputDialog(
                null,
                "Laipni lūgti pcas veikalā",
                "Ko darīt?",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcijas,
                opcijas[3]);


                switch (getFavFruit) {
                    case "Pasūtīt":
                        pasutit(cena, pasūtījums);
                        break;
                    case "veidot savu picu":
                        jaunaPica = taisit.newPica(cena);
                        break;

                    case "cenas":
                        JOptionPane.showMessageDialog(null, "Jums šobrīd būtu jāmaksā: "+cena);
                        break;
                    case "gatavs, pasūtīt!":


                        break;
                    case "Neko, pārdomāju!":
                        repeat=true;
                        break;
                    default:

                }


            }while(repeat==true);




    }


    }



