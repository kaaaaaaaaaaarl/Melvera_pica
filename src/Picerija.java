import javax.swing.*;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
public class Picerija {
    private static double pasutit(double cena, ArrayList pasūtījums){

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


                break;}
    return(cena);
    }
    private static void PrintChecku(double cena, ArrayList pasutijumi){




    }



    public static void main(String args[]){
        double cena = 0;
        boolean repeat = true;
        ArrayList<String> jaunaPica = new ArrayList<String>();
        ArrayList<String> pasūtījums = new ArrayList<String>();



        String m = JOptionPane.showInputDialog("Kā jūs sauc? (priekš čeka)");
        m = m+ "-check.txt";

        //setup check:
        try {
            File myObj = new File(m);
            if (myObj.createNewFile()) {
                System.out.println("checks sagatavots: " + myObj.getName());
            } else {
                System.out.println("Checks jau bija.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();}







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
                        cena =  pasutit(cena, pasūtījums);
                        break;
                    case "veidot savu picu":
                        jaunaPica = taisit.newPica(cena);
                        break;

                    case "cenas":
                        JOptionPane.showMessageDialog(null, "Jums šobrīd būtu jāmaksā: "+cena);
                        break;
                    case "gatavs, pasūtīt!":
                        repeat= false;

                        break;
                    case "Neko, pārdomāju!":
                        repeat=false;
                        break;
                    default:

                }


            }while(repeat==true);




    }


    }



