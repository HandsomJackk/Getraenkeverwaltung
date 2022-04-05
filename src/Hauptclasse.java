import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hauptclasse extends JFrame implements ActionListener {
    

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JPanel pgetranke;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton button20;
    private JPanel panzeige1;
    private JPanel panzeige2;
    private JLabel labelname;
    private JLabel labelpreis;
    private JLabel labelbestand;
    private JLabel labelnames;
    private JLabel labelpreiss;
    private JLabel labelbestands;
    private JPanel pwaren;
    private JPanel pauswahl;
    private JPanel psnack;

    private ArrayList<Getraenk> getraenkl;          //auf dei Arrys zugreifen 
    private ArrayList<Snack> snackl;

    private Getraenk aktuellegetraenk;
    private Snack aktuellerSnack;
    private JButton verkaufeng;
    private AbstractButton verkaufens;
    private JPanel pverkauf;
    private JComponent pverkaufs;
    private JPanel pverkaufa;

    public Hauptclasse(ArrayList<Getraenk> getraenkl, ArrayList<Snack> snackl){       

        this.getraenkl = getraenkl;
        this.snackl = snackl;

        this.setTitle("Getrankeverwaltung");                    //Himtergrund fenster
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1000,600);
        this.setLayout(null);
        
        javax.swing.JOptionPane.showMessageDialog(null, "Getränke übersicht");       //pop up fenster 


        // hir werden die buttens creirt und positionirt

            verkaufeng = new JButton();
            verkaufeng.setBounds(0, 0, 250, 50);
            verkaufeng.addActionListener(this);
            verkaufeng.setText("Verkaufen G");
            verkaufeng.setFocusable(false);
            verkaufeng.setVerticalTextPosition(JButton.CENTER);
            verkaufeng.setHorizontalTextPosition(JButton.LEFT);
            verkaufeng.setFont(new Font("Arial",Font.BOLD, 20));
            verkaufeng.setForeground(Color.WHITE);
            verkaufeng.setBackground(Color.DARK_GRAY);
            verkaufeng.setEnabled(true); 

            verkaufens = new JButton();
            verkaufens.setBounds(0, 0, 250, 50);
            verkaufens.addActionListener(this);
            verkaufens.setText("Verkaufen S");
            verkaufens.setFocusable(false);
            verkaufens.setVerticalTextPosition(JButton.CENTER);
            verkaufens.setHorizontalTextPosition(JButton.LEFT);
            verkaufens.setFont(new Font("Arial",Font.BOLD, 20));
            verkaufens.setForeground(Color.WHITE);
            verkaufens.setBackground(Color.DARK_GRAY);
            verkaufens.setEnabled(true); 


// Alle normalen knöpfe

            button1 = new JButton();            //kann die panels wechseln wenn betätigt
            button1.setBounds(0, 0, 250, 50);
            button1.addActionListener(this);
            button1.setText("Getraenke");
            button1.setFocusable(false);
            button1.setVerticalTextPosition(JButton.CENTER);
            button1.setHorizontalTextPosition(JButton.LEFT);
            button1.setFont(new Font("Arial",Font.BOLD, 20));
            button1.setForeground(Color.WHITE);
            button1.setBackground(Color.DARK_GRAY);
            button1.setEnabled(true);                    // Kann auch uneter actionPerformed eingefügt werden wenn konpf nur einmal drücken kann
            

            button2 = new JButton();
            button2.setBounds(0, 0, 250, 50);
            button2.addActionListener(this);
            button2.setText("Snack");
            button2.setFocusable(false);
            button2.setVerticalTextPosition(JButton.CENTER);
            button2.setHorizontalTextPosition(JButton.LEFT);
            button2.setFont(new Font("Arial",Font.BOLD, 20));
            button2.setForeground(Color.WHITE);
            button2.setBackground(Color.DARK_GRAY);
            button2.setEnabled(true);


            button3 = new JButton();
            button3.setBounds(0, 50, 250, 50);
            button3.addActionListener(this);
            button3.setText("Cola");
            button3.setFocusable(false);
            button3.setVerticalTextPosition(JButton.CENTER);
            button3.setHorizontalTextPosition(JButton.LEFT);
            button3.setFont(new Font("Arial",Font.BOLD, 20));
            button3.setForeground(Color.WHITE);
            button3.setBackground(Color.DARK_GRAY);
            button3.setEnabled(true);

            button4 = new JButton();
            button4.setBounds(0, 100,  250, 50);
            button4.addActionListener(this);
            button4.setText("Mezomix");
            button4.setFocusable(false);
            button4.setVerticalTextPosition(JButton.CENTER);
            button4.setHorizontalTextPosition(JButton.LEFT);
            button4.setFont(new Font("Arial",Font.BOLD, 20));
            button4.setForeground(Color.WHITE);
            button4.setBackground(Color.DARK_GRAY);
            button4.setEnabled(true);

            button5 = new JButton();
            button5.setBounds(0, 150,  250, 50);
            button5.addActionListener(this);
            button5.setText("Brause");
            button5.setFocusable(false);
            button5.setVerticalTextPosition(JButton.CENTER);
            button5.setHorizontalTextPosition(JButton.LEFT);
            button5.setFont(new Font("Arial",Font.BOLD, 20));
            button5.setForeground(Color.WHITE);
            button5.setBackground(Color.DARK_GRAY);
            button5.setEnabled(true);

            button6 = new JButton();
            button6.setBounds(0, 200,  250, 50);
            button6.addActionListener(this);
            button6.setText("Fanta");
            button6.setFocusable(false);
            button6.setVerticalTextPosition(JButton.CENTER);
            button6.setHorizontalTextPosition(JButton.LEFT);
            button6.setFont(new Font("Arial",Font.BOLD, 20));
            button6.setForeground(Color.WHITE);
            button6.setBackground(Color.DARK_GRAY);
            button6.setEnabled(true);


            button7 = new JButton();
            button7.setBounds(0, 250,  250, 50);
            button7.addActionListener(this);
            button7.setText("Gerol");
            button7.setFocusable(false);
            button7.setVerticalTextPosition(JButton.CENTER);
            button7.setHorizontalTextPosition(JButton.LEFT);
            button7.setFont(new Font("Arial",Font.BOLD, 20));
            button7.setForeground(Color.WHITE);
            button7.setBackground(Color.DARK_GRAY);
            button7.setEnabled(true);

            button8 = new JButton();
            button8.setBounds(0, 300,  250, 50);
            button8.addActionListener(this);
            button8.setText("Fritz");
            button8.setFocusable(false);
            button8.setVerticalTextPosition(JButton.CENTER);
            button8.setHorizontalTextPosition(JButton.LEFT);
            button8.setFont(new Font("Arial",Font.BOLD, 20));
            button8.setForeground(Color.WHITE);
            button8.setBackground(Color.DARK_GRAY);
            button8.setEnabled(true);

            button9 = new JButton();
            button9.setBounds(0, 350,  250, 50);
            button9.addActionListener(this);
            button9.setText("Fritz Cola");
            button9.setFocusable(false);
            button9.setVerticalTextPosition(JButton.CENTER);
            button9.setHorizontalTextPosition(JButton.LEFT);
            button9.setFont(new Font("Arial",Font.BOLD, 20));
            button9.setForeground(Color.WHITE);
            button9.setBackground(Color.DARK_GRAY);
            button9.setEnabled(true);

            button10 = new JButton();
            button10.setBounds(0, 400,  250, 50);
            button10.addActionListener(this);
            button10.setText("Beer");
            button10.setFocusable(false);
            button10.setVerticalTextPosition(JButton.CENTER);
            button10.setHorizontalTextPosition(JButton.LEFT);
            button10.setFont(new Font("Arial",Font.BOLD, 20));
            button10.setForeground(Color.WHITE);
            button10.setBackground(Color.DARK_GRAY);
            button10.setEnabled(true);

            button11 = new JButton();
            button11.setBounds(0, 450,  250, 50);
            button11.addActionListener(this);
            button11.setText("Doener Cola");
            button11.setFocusable(false);
            button11.setVerticalTextPosition(JButton.CENTER);
            button11.setHorizontalTextPosition(JButton.LEFT);
            button11.setFont(new Font("Arial",Font.BOLD, 20));
            button11.setForeground(Color.WHITE);
            button11.setBackground(Color.DARK_GRAY);
            button11.setEnabled(true);

//Snack Butten

            button12 = new JButton();
            button12.setBounds(0, 50,  250, 50);
            button12.addActionListener(this);
            button12.setText("Snikers");
            button12.setFocusable(false);
            button12.setVerticalTextPosition(JButton.CENTER);
            button12.setHorizontalTextPosition(JButton.LEFT);
            button12.setFont(new Font("Arial",Font.BOLD, 20));
            button12.setForeground(Color.WHITE);
            button12.setBackground(Color.DARK_GRAY);
            button12.setEnabled(true);

            button13 = new JButton();
            button13.setBounds(0, 100,  250, 50);
            button13.addActionListener(this);
            button13.setText("Baunti");
            button13.setFocusable(false);
            button13.setVerticalTextPosition(JButton.CENTER);
            button13.setHorizontalTextPosition(JButton.LEFT);
            button13.setFont(new Font("Arial",Font.BOLD, 20));
            button13.setForeground(Color.WHITE);
            button13.setBackground(Color.DARK_GRAY);
            button13.setEnabled(true);

            button14 = new JButton();
            button14.setBounds(0, 150,  250, 50);
            button14.addActionListener(this);
            button14.setText("Skitels");
            button14.setFocusable(false);
            button14.setVerticalTextPosition(JButton.CENTER);
            button14.setHorizontalTextPosition(JButton.LEFT);
            button14.setFont(new Font("Arial",Font.BOLD, 20));
            button14.setForeground(Color.WHITE);
            button14.setBackground(Color.DARK_GRAY);
            button14.setEnabled(true);

            button15 = new JButton();
            button15.setBounds(0, 200,  250, 50);
            button15.addActionListener(this);
            button15.setText("Cliffbar");
            button15.setFocusable(false);
            button15.setVerticalTextPosition(JButton.CENTER);
            button15.setHorizontalTextPosition(JButton.LEFT);
            button15.setFont(new Font("Arial",Font.BOLD, 20));
            button15.setForeground(Color.WHITE);
            button15.setBackground(Color.DARK_GRAY);
            button15.setEnabled(true);


            button16 = new JButton();
            button16.setBounds(0, 250,  250, 50);
            button16.addActionListener(this);
            button16.setText("Chips");
            button16.setFocusable(false);
            button16.setVerticalTextPosition(JButton.CENTER);
            button16.setHorizontalTextPosition(JButton.LEFT);
            button16.setFont(new Font("Arial",Font.BOLD, 20));
            button16.setForeground(Color.WHITE);
            button16.setBackground(Color.DARK_GRAY);
            button16.setEnabled(true);

            button17 = new JButton();
            button17.setBounds(0, 300,  250, 50);
            button17.addActionListener(this);
            button17.setText("m&m");
            button17.setFocusable(false);
            button17.setVerticalTextPosition(JButton.CENTER);
            button17.setHorizontalTextPosition(JButton.LEFT);
            button17.setFont(new Font("Arial",Font.BOLD, 20));
            button17.setForeground(Color.WHITE);
            button17.setBackground(Color.DARK_GRAY);
            button17.setEnabled(true);

            button18 = new JButton();
            button18.setBounds(0, 350,  250, 50);
            button18.addActionListener(this);
            button18.setText("Mini Berzel");
            button18.setFocusable(false);
            button18.setVerticalTextPosition(JButton.CENTER);
            button18.setHorizontalTextPosition(JButton.LEFT);
            button18.setFont(new Font("Arial",Font.BOLD, 20));
            button18.setForeground(Color.WHITE);
            button18.setBackground(Color.DARK_GRAY);
            button18.setEnabled(true);

            button19 = new JButton();
            button19.setBounds(0, 400,  250, 50);
            button19.addActionListener(this);
            button19.setText("Twix");
            button19.setFocusable(false);
            button19.setVerticalTextPosition(JButton.CENTER);
            button19.setHorizontalTextPosition(JButton.LEFT);
            button19.setFont(new Font("Arial",Font.BOLD, 20));
            button19.setForeground(Color.WHITE);
            button19.setBackground(Color.DARK_GRAY);
            button19.setEnabled(true);

            button20 = new JButton();
            button20.setBounds(0, 450,  250, 50);
            button20.addActionListener(this);
            button20.setText("Kitkat");
            button20.setFocusable(false);
            button20.setVerticalTextPosition(JButton.CENTER);
            button20.setHorizontalTextPosition(JButton.LEFT);
            button20.setFont(new Font("Arial",Font.BOLD, 20));
            button20.setForeground(Color.WHITE);
            button20.setBackground(Color.DARK_GRAY);
            button20.setEnabled(true);
        
        //Verschidene panels

        pgetranke = new JPanel();
        pgetranke.setBackground(Color.DARK_GRAY);
        pgetranke.setBounds(0, 0, 250, 50);
        pgetranke.setLayout(null);

        pwaren = new JPanel();
        pwaren.setBackground(Color.DARK_GRAY);
        pwaren.setBounds(251, 0, 250, 50);
        pwaren.setLayout(null);

        pauswahl = new JPanel();
        pauswahl.setBackground(Color.DARK_GRAY);
        pauswahl.setBounds(0, 51, 250, 500);
        pauswahl.setLayout(null);
      
        psnack = new JPanel();
        psnack.setBackground(Color.DARK_GRAY);
        psnack.setBounds(0, 51, 250, 500);
        psnack.setLayout(null);
        psnack.setVisible(true);

        //Das mitlere anzeige fenster

        panzeige1 = new JPanel();
        panzeige1.setBackground(Color.DARK_GRAY);
        panzeige1.setBounds(251, 51, 450, 500);
        panzeige1.setLayout(null);
        panzeige1.setVisible(true);

        panzeige2 = new JPanel();
        panzeige2.setBackground(Color.DARK_GRAY);
        panzeige2.setBounds(251, 51, 450, 500);
        panzeige2.setLayout(null);
        panzeige2.setVisible(true);

        //verkaufs panel

        pverkauf = new JPanel();                        //panel für den knopf verkauf getränk
        pverkauf.setBackground(Color.DARK_GRAY);
        pverkauf.setBounds(751, 0, 550, 50);
        pverkauf.setLayout(null);
        pverkauf.setVisible(true);

        pverkaufs = new JPanel();                       //panel für den knopf verkauf snaks
        pverkaufs.setBackground(Color.DARK_GRAY);
        pverkaufs.setBounds(751, 0, 550, 50);
        pverkaufs.setLayout(null);
        pverkaufs.setVisible(true);

        pverkaufa = new JPanel();                       //anzeige der verkauften produkte
        pverkaufa.setBackground(Color.DARK_GRAY);
        pverkaufa.setBounds(751, 50, 550, 500);
        pverkaufa.setLayout(null);
        pverkaufa.setVisible(true);


        // Lables für die einzelen panles
        
        
        JLabel label1 = new JLabel();
        label1.setText("Getraenke");
        label1.setForeground(new ColorUIResource(255, 255, 255));
        label1.setFont(new Font("Arial",Font.BOLD, 20));
        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setBounds(0, 0, 20, 20);
       

        JLabel label2 = new JLabel();
        label2.setForeground(new ColorUIResource(255, 255, 255));
        label2.setFont(new Font("Arial",Font.BOLD, 20));
        label2.setBounds(0, 0, 20, 20);

        
        JLabel label3 = new JLabel();
        label3.setText("Getraenke: "  + getraenkl.size());
        label3.setForeground(new ColorUIResource(255, 255, 255));
        label3.setFont(new Font("Arial",Font.BOLD, 20));
        label3.setBounds(85, 15, 200, 20);

          
        JLabel label4 = new JLabel();
        label4.setText("Snacks: "  + snackl.size());
        label4.setForeground(new ColorUIResource(255, 255, 255));
        label4.setFont(new Font("Arial",Font.BOLD, 20));
        label4.setBounds(85, 15, 200, 20);


        //Getranke Anzeige

        labelname = new JLabel();
        labelname.setText("Name: " + getraenkl.get(0).getName());
        labelname.setForeground(new ColorUIResource(255, 255, 255));
        labelname.setBounds(200, 0, 100, 300);

        
        labelpreis = new JLabel();
        labelpreis.setText("Preis: " + getraenkl.get(0).getPreis());
        labelpreis.setForeground(new ColorUIResource(255, 255, 255));
        labelpreis.setBounds(200, 60, 100, 300);

        
        labelbestand = new JLabel();
        labelbestand.setText("Bestand: " + getraenkl.get(0).getBestand());
        labelbestand.setForeground(new ColorUIResource(255, 255, 255));
        labelbestand.setBounds(200, 120, 100, 300);

        //Snack Anzeige

        
        labelnames = new JLabel();
        labelnames.setText("Name: " + snackl.get(0).getName());
        labelnames.setForeground(new ColorUIResource(255, 255, 255));
        labelnames.setBounds(200, 0, 100, 300);

        
        labelpreiss = new JLabel();
        labelpreiss.setText("Preis: " + snackl.get(0).getPreis());
        labelpreiss.setForeground(new ColorUIResource(255, 255, 255));
        labelpreiss.setBounds(200, 60, 100, 300);

        
        labelbestands = new JLabel();
        labelbestands.setText("Bestand: " + snackl.get(0).getBestand());
        labelbestands.setForeground(new ColorUIResource(255, 255, 255));
        labelbestands.setBounds(200, 120, 100, 300);

// fenster erstellung 

       pgetranke.add(button1);          //die knöfer werden denn panelen zugeordenet
       pwaren.add(button2);

       pauswahl.add(button3);
       pauswahl.add(button4);
       pauswahl.add(button5);
       pauswahl.add(button6);
       pauswahl.add(button7);
       pauswahl.add(button8);
       pauswahl.add(button9);
       pauswahl.add(button10);
       pauswahl.add(button11);

       psnack.add(button12);
       psnack.add(button13);
       psnack.add(button14);
       psnack.add(button15);
       psnack.add(button16);
       psnack.add(button17);
       psnack.add(button18);
       psnack.add(button19);
       psnack.add(button20);


    

        pgetranke.add(label1);      //die Labels werden denn panelen zugerordnet
        pwaren.add(label2);
        pauswahl.add(label3);
        psnack.add(label4);

        panzeige1.add(labelname);
        panzeige1.add(labelpreis);
        panzeige1.add(labelbestand);

        panzeige2.add(labelnames);
        panzeige2.add(labelpreiss);
        panzeige2.add(labelbestands);

        pverkauf.add(verkaufeng);
        pverkaufs.add(verkaufens);

        this.add(pverkaufa);            //werden denn fenster zu gerordenet
        this.add(pverkaufs);
        this.add(pverkauf);
        this.add(panzeige2);
        this.add(panzeige1);
        this.add(pgetranke);
        this.add(pwaren);
        this.add(pauswahl);
        this.add(psnack);
        this.setVisible(true);

       // Butten logik

    }
        public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1) {
            psnack.setVisible(false);
            pauswahl.setVisible(true);
            panzeige1.setVisible(true);
            panzeige2.setVisible(false);
            pverkauf.setVisible(true);
            pverkaufs.setVisible(false);
        }
        
        if(e.getSource()==button2) {
            psnack.setVisible(true);
            pauswahl.setVisible(false);
            panzeige1.setVisible(false);
            panzeige2.setVisible(true);
            pverkauf.setVisible(false);
            pverkaufs.setVisible(true);
        }

        if(e.getSource()==verkaufeng) {
            aktuellegetraenk.verkaufen(1);
        }

        if(e.getSource()==verkaufens) {
            aktuellerSnack.verkaufen(1);
        }

        if(e.getSource()==button3) {
            labelname.setText("Name: " + getraenkl.get(0).getName());
            labelpreis.setText("Preis: " + getraenkl.get(0).getPreis());
            labelbestand.setText("Bestand: " + getraenkl.get(0).getBestand());
            aktuellegetraenk=getraenkl.get(0);
        }
        if(e.getSource()==button4) {
            labelname.setText("Name: " + getraenkl.get(1).getName());
            labelpreis.setText("Preis: " + getraenkl.get(1).getPreis());
            labelbestand.setText("Bestand: " + getraenkl.get(1).getBestand());
            aktuellegetraenk=getraenkl.get(1);
        }
        if(e.getSource()==button5) {
            labelname.setText("Name: " + getraenkl.get(2).getName());
            labelpreis.setText("Preis: " + getraenkl.get(2).getPreis());
            labelbestand.setText("Bestand: " + getraenkl.get(2).getBestand());
            aktuellegetraenk=getraenkl.get(2);
        }
        if(e.getSource()==button6) {
            labelname.setText("Name: " + getraenkl.get(3).getName());
            labelpreis.setText("Preis: " + getraenkl.get(3).getPreis());
            labelbestand.setText("Bestand: " + getraenkl.get(3).getBestand());
            aktuellegetraenk=getraenkl.get(3);
        }
        if(e.getSource()==button7) {
            labelname.setText("Name: " + getraenkl.get(4).getName());
            labelpreis.setText("Preis: " + getraenkl.get(4).getPreis());
            labelbestand.setText("Bestand: " + getraenkl.get(4).getBestand()); 
            aktuellegetraenk=getraenkl.get(4);
        }
        if(e.getSource()==button8) {
            labelname.setText("Name: " + getraenkl.get(5).getName());
            labelpreis.setText("Preis: " + getraenkl.get(5).getPreis());
            labelbestand.setText("Bestand: " + getraenkl.get(5).getBestand());
            aktuellegetraenk=getraenkl.get(5);
        }
        if(e.getSource()==button9) {
            labelname.setText("Name: " + getraenkl.get(6).getName());
            labelpreis.setText("Preis: " + getraenkl.get(6).getPreis());
            labelbestand.setText("Bestand: " + getraenkl.get(6).getBestand());
            aktuellegetraenk=getraenkl.get(6);
        }
        if(e.getSource()==button10) {
            labelname.setText("Name: " + getraenkl.get(7).getName());
            labelpreis.setText("Preis: " + getraenkl.get(7).getPreis());
            labelbestand.setText("Bestand: " + getraenkl.get(7).getBestand());
            aktuellegetraenk=getraenkl.get(7);
        }
        if(e.getSource()==button11) {
            labelname.setText("Name: " + getraenkl.get(8).getName());
            labelpreis.setText("Preis: " + getraenkl.get(8).getPreis());
            labelbestand.setText("Bestand: " + getraenkl.get(8).getBestand());
            aktuellegetraenk=getraenkl.get(8);
        }

// Snacke anzeige durch knopfdruck

        if(e.getSource()==button12) {
            labelnames.setText("Name: " + snackl.get(0).getName());
            labelpreiss.setText("Preis: " + snackl.get(0).getPreis());
            labelbestands.setText("Bestand: " + snackl.get(0).getBestand());
            aktuellerSnack=snackl.get(0);
        }
        if(e.getSource()==button13) {
            labelnames.setText("Name: " + snackl.get(1).getName());
            labelpreiss.setText("Preis: " + snackl.get(1).getPreis());
            labelbestands.setText("Bestand: " + snackl.get(1).getBestand());
            aktuellerSnack=snackl.get(1);

        }
        if(e.getSource()==button14) {
            labelnames.setText("Name: " + snackl.get(2).getName());
            labelpreiss.setText("Preis: " + snackl.get(2).getPreis());
            labelbestands.setText("Bestand: " + snackl.get(2).getBestand());
            aktuellerSnack=snackl.get(2);

        }
        if(e.getSource()==button15) {
            labelnames.setText("Name: " + snackl.get(3).getName());
            labelpreiss.setText("Preis: " + snackl.get(3).getPreis());
            labelbestands.setText("Bestand: " + snackl.get(3).getBestand());
            aktuellerSnack=snackl.get(3);

        }
        if(e.getSource()==button16) {
            labelnames.setText("Name: " + snackl.get(4).getName());
            labelpreiss.setText("Preis: " + snackl.get(4).getPreis());
            labelbestands.setText("Bestand: " + snackl.get(4).getBestand());
            aktuellerSnack=snackl.get(4);

        }
        if(e.getSource()==button17) {
            labelnames.setText("Name: " + snackl.get(5).getName());
            labelpreiss.setText("Preis: " + snackl.get(5).getPreis());
            labelbestands.setText("Bestand: " + snackl.get(5).getBestand());
            aktuellerSnack=snackl.get(5);
        }
        if(e.getSource()==button18) {
            labelnames.setText("Name: " + snackl.get(6).getName());
            labelpreiss.setText("Preis: " + snackl.get(6).getPreis());
            labelbestands.setText("Bestand: " + snackl.get(6).getBestand());
            aktuellerSnack=snackl.get(6);
        }
        if(e.getSource()==button19) {
            labelnames.setText("Name: " + snackl.get(7).getName());
            labelpreiss.setText("Preis: " + snackl.get(7).getPreis());
            labelbestands.setText("Bestand: " + snackl.get(7).getBestand());
            aktuellerSnack=snackl.get(7);
        }
        if(e.getSource()==button20) {
            labelnames.setText("Name: " + snackl.get(8).getName());
            labelpreiss.setText("Preis: " + snackl.get(8).getPreis());
            labelbestands.setText("Bestand: " + snackl.get(8).getBestand());
            aktuellerSnack=snackl.get(8); //
        }
    }
}
