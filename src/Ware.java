public abstract class Ware {              //Vererbende klasse
    protected String name;
    protected double preis;
    protected int bestand;

    //Konstruktoren
     
    public Ware() {
   
    }
    public Ware(String name, double preis, int bestand) {           // teile der polymorty
        this.name = name;
        this.preis = preis;
        this.bestand = bestand;
     }

     //get-und set-Methoden
     public void setName(String name) {
        this.name = name;
     }
    public void setPreis(double preis) {
        this.preis = preis;
     }
    public void setBestand(int bestand) {
        this.bestand = bestand;
     }

     public String getName()  {
        return name;
     }

     public double getPreis()  {
        return preis;
     }

     public int getBestand()  {
        return bestand;
     }

     //Methoden zur Verwaltung der Getränke
     //Diese Methode erhöht den Bestand um die eingegebene Menge
     public void bestandErhoehen (int menge) {
        bestand = bestand + menge;
     }

     //Diese Methode verringert den Bestand um die Verkaufsmenge, ruft die Methode kassenzettelDrucken() auf und gibt den von ihr als Rückgabewert erhaltenen String zurück
     public String verkaufen (int verkaufsmenge) {
        bestand = bestand - verkaufsmenge;
        String ausgabetext = kassenzettelDrucken(verkaufsmenge);
        return ausgabetext;
     }

     //Diese Methode berechnet den Gesamtpreis und gibt den Kassenzettel als String zurück
     public String kassenzettelDrucken (int verkaufsmenge) {
          String kassenzettel;

        double gesamtpreis;

        gesamtpreis = preis * verkaufsmenge;

        kassenzettel = "Name: " + name + 

        "\nVerkaufsmenge: " + verkaufsmenge+

        "\nPreis in Euro: " + preis +

        "\nGesamtpreis: " + gesamtpreis +     

        "\n";

        return kassenzettel;

    }
     
}    

        

