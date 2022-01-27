import javax.swing.*;

import java.util.ArrayList;





public class taisit {


    static boolean izv = false;

    public static ArrayList newPica(double cena) {
        String[] opcijas = {"Mozzarella +0.20", "Cheddar +0.25", "Gorgonzola +0.30", "Provolone +0.30", "bez siera"};
        String siers = (String) JOptionPane.showInputDialog(
                null,
                "kādu sieru?",
                "Jūsu paša recepte?",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcijas,
                opcijas[3]);
        ArrayList<String> jaunaPica = new ArrayList<String>();

        switch (siers) {
            case "Mozzarella +0.20":
                jaunaPica.add("Mozzarella");
                cena = +0.2;
                break;
            case "Cheddar +0.25":
                jaunaPica.add("Cheddar");
                cena = +0.25;
                break;
            case "Gorgonzola +0.30":
                jaunaPica.add("Gorgonzola");
                cena = +0.3;
                break;
            case "Provolone +0.30":
                jaunaPica.add("Provolone");
                cena = +0.3;
                break;
            case "bez siera":
                jaunaPica.add("bez siera");
                break;


        }

        do {
            String[] opcijas1 = {"peperoni +0.20", "italijas desa +0.25", "Malta liellopa gaļa +0.50", "bekons +0.50", "bez gaļas"};
            String gala = (String) JOptionPane.showInputDialog(
                    null,
                    "kādu gaļu?",
                    "Jūsu paša recepte?",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcijas1,
                    opcijas1[3]);

            switch (gala) {
                case "peperoni +0.20":
                    jaunaPica.add("peperoni");
                    cena = +0.2;
                    break;
                case "italijas desa +0.25":
                    jaunaPica.add("italijas desa");
                    cena = +0.25;
                    break;
                case "Malta liellopa gaļa +0.50":
                    jaunaPica.add("Malta liellopa gaļa");
                    cena = +0.5;
                    break;
                case "bekons +0.50":
                    jaunaPica.add("bekons");
                    cena = +0.5;
                    break;
                case "bez gaļas":

                    break;


            }

            String[] opcijas2 = {"sēnes +0.15", "chilli +0.45", "tomāti +0.15", "olives +0.30", "bez darzeņiem"};
            String galaa = (String) JOptionPane.showInputDialog(
                    null,
                    "Jūsu paša recepte",
                    "kādu sieru?",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcijas2,
                    opcijas2[3]);

            switch (galaa) {
                case "sēnes +0.15":
                    jaunaPica.add("sēnes");
                    cena = +0.15;
                    break;
                case "chilli +0.45":
                    jaunaPica.add("chilli");
                    cena = +0.45;
                    break;
                case "tomāti +0.15":
                    jaunaPica.add("tomāti");
                    cena = +0.15;
                    break;
                case "olives +0.30":
                    jaunaPica.add("olives");
                    cena = +0.30;
                    break;
                case "bez darzeņiem":

                    break;


            }


            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Vai vēlaties vel uzlikt uz savas picas?", " ", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                izv = true;
            } else {
                izv = false;
            }

        } while (izv == true);


        return (jaunaPica);


    }

    public static String PrintNewPica(ArrayList newPica) {
        String ListString = "";

        for (int i = 0; i < newPica.size();i++)
        {
            ListString = ListString+"\n"+ (newPica.get(i));
        }



        return(newPica.toString() );
    }


}