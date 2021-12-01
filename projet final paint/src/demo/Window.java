package demo;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;

public class Window extends JFrame implements ActionListener {

    Drawing draw = new Drawing();

    public Window(String Title, int x, int y)
    {
        super(Title);
        this.setSize(x,y);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPanel = this.getContentPane();

        JMenuBar m= new JMenuBar();

        JMenu menu1 = new JMenu("Fichier");
        JMenuItem nouveau = new JMenuItem("Nouveau");
        JMenuItem ouvrir = new JMenuItem("Ouvrir");
        JMenuItem enregistrer = new JMenuItem("Enregistrer");
        JMenuItem fermer = new JMenuItem("Fermer");
        nouveau.addActionListener(this);
        ouvrir.addActionListener(this);
        enregistrer.addActionListener(this);
        fermer.addActionListener(this);
        menu1.add(nouveau);
        menu1.add(ouvrir);
        menu1.add(enregistrer);
        menu1.add(fermer);
        m.add(menu1);

        JMenu menu2 = new JMenu("A Propos");
        JMenuItem createur = new JMenuItem("Créateur");
        createur.addActionListener(this);
        menu2.add(createur);
        m.add(menu2);

        JMenu menu3 = new JMenu("Aide");
        JMenuItem aide = new JMenuItem("Instructions");
        aide.addActionListener(this);
        menu3.add(aide);
        m.add(menu3);




        JPanel SouthPanel = new JPanel();
        SouthPanel.setLayout(new GridLayout(2,6));
        JButton noir = new JButton("Noir");
        noir.addActionListener(this);
        JButton rouge = new JButton("Rouge");
        rouge.addActionListener(this);
        JButton jaune = new JButton("Jaune");
        jaune.addActionListener(this);


        JButton bleu = new JButton("Bleu");
        bleu.addActionListener(this);
        JButton rectangle = new JButton("Rectangle");
        rectangle.addActionListener(this);
        JButton rose = new JButton("Rose");
        rose.addActionListener(this);
        JButton magenta = new JButton("Magenta");
        magenta.addActionListener(this);
        JButton orange = new JButton("Orange");
        orange.addActionListener(this);
        JButton ellipse = new JButton("Ellipse");
        ellipse.addActionListener(this);
        JButton cercle = new JButton("Circle");
        cercle.addActionListener(this);
        JButton vert = new JButton("Vert");
        vert.addActionListener(this);
        JButton carre = new JButton("Square");
        carre.addActionListener(this);

        contentPanel.add(draw,"Center");

        noir.setBackground(Color.BLACK);
        rouge.setBackground(Color.RED);
        orange.setBackground(Color.ORANGE);
        rose.setBackground(Color.PINK);
        magenta.setBackground(Color.MAGENTA);
        jaune.setBackground(Color.YELLOW);
        bleu.setBackground(Color.BLUE);
        vert.setBackground(Color.GREEN);

        SouthPanel.add(noir);
        SouthPanel.add(rouge);
        SouthPanel.add(orange);
        SouthPanel.add(rose);
        SouthPanel.add(rectangle);
        SouthPanel.add(carre);
        SouthPanel.add(vert);
        SouthPanel.add(jaune);
        SouthPanel.add(magenta);
        SouthPanel.add(bleu);
        SouthPanel.add(ellipse);
        SouthPanel.add(cercle);

        contentPanel.add(SouthPanel, "South");

        setJMenuBar(m);
        SouthPanel.setVisible(true);
        this.setVisible(true);
        contentPanel.add(SouthPanel,"South");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        switch (cmd) {
            case "Noir":
                draw.setColor(Color.black);
                break;
            case "Rouge":
                draw.setColor(Color.red);
                break;
            case "Orange":
                draw.setColor(Color.orange);
                break;
            case "Jaune":
                draw.setColor(Color.yellow);
                break;
            case "Magenta":
                draw.setColor(Color.magenta);
                break;
            case "Rose":
                draw.setColor(Color.pink);
                break;
            case "Bleu":
                draw.setColor(Color.blue);
                break;
            case "Vert":
                draw.setColor(Color.green);
                break;

            case "Rectangle":
                draw.setNameFigure("Rectangle");
                break;
            case "Square":
                draw.setNameFigure("Square");
                break;
            case "Ellipse":
                draw.setNameFigure("Ellipse");
                break;
            case "Circle":
                draw.setNameFigure("Circle");
                break;


            case "Nouveau":
                this.draw.nouveau();
                break;
            case "Ouvrir":
                this.draw.ouvrir();
                break;
            case "Enregistrer":
                this.draw.enregistrer();
                break;
            case "Fermer":
                this.dispose();
                break;
            case "Créateur":
                JOptionPane Createur = new JOptionPane();
                JOptionPane.showInternalMessageDialog(Createur, "Créateur : Gabriel Baranes", "Information Créateur", 1);
                break;
            case "Instructions":
                JOptionPane AIDE = new JOptionPane();
                JOptionPane.showInternalMessageDialog(AIDE, "Pour tracer une figure veuillez selectionner une couleur et la figure de votre choix. Cliquez sur l'écran et étirer la figure pour obtenir la taille que vous souhaitez", "Aide", 1);
                break;
        }
    }


    public static void main(String[] args) {
        Window win = new Window("Paint", 800,600);
    }



}

