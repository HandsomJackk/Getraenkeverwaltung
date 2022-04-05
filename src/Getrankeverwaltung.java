import java.util.ArrayList;

public class Getrankeverwaltung{

    public static ArrayList<Getraenk> getraenkl;
    public static ArrayList<Snack> snackl;

    public static void main(String[] args) {


       snackl = new ArrayList<>();                                  // Arraylist erstellung erstellung
       getraenkl = new ArrayList<>();
       
        getraenkl.add(new Getraenk("Cola",2.75,200));               // die einzelnen daten speicher
        getraenkl.add(new Getraenk("Mezomix",1.59,40));
        getraenkl.add(new Getraenk("Brause",2.59,400));
        getraenkl.add(new Getraenk("Fanta",2.69,40));
        getraenkl.add(new Getraenk("Geroltsteiner",2.89,80));
        getraenkl.add(new Getraenk("Fritz",3.59,880));
        getraenkl.add(new Getraenk("Fritzcola",2.19,90));
        getraenkl.add(new Getraenk("Beer",2.99,200));
        getraenkl.add(new Getraenk("Doener Cola",2.99,200));


        snackl.add(new Snack("Snikers", 1.29, 200));                   //Snack anzeige zählen von 0
        snackl.add(new Snack("Baunti", 1.39, 300));
        snackl.add(new Snack("Skitles", 1.49, 500));
        snackl.add(new Snack("Cliffbar", 1.59, 800));
        snackl.add(new Snack("Chips", 1.69, 500));
        snackl.add(new Snack("m&m", 1.79, 100));
        snackl.add(new Snack("Mini Berzel", 1.89, 900));
        snackl.add(new Snack("Twix", 1.12, 700));
        snackl.add(new Snack("Kitkat", 1.55, 300));
       
       
        Hauptclasse fenster = new Hauptclasse (getraenkl, snackl);
        fenster.setVisible(true);
    }


}