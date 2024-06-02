/** aSzymon - gtihub */

package LosowanieKoloruRGB;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.Random;

public class losowanieKoloru {

    public JPanel createContentPane() {
        JPanel losowanie = new JPanel();

    Random random = new Random();

    int r = random.nextInt(255);

        for (int i = 0; i < 1; i++){

        System.out.println("");
        System.out.println("kolor red: "+r);

    }

    int g = random.nextInt(255);

        for (int j = 0; j < 1; j++){

        System.out.println("kolor green: "+g);

    }

    int b = random.nextInt(255);

        for (int k = 0; k < 1; k++){

        System.out.println("kolor blue: "+b);
        System.out.println("");

    }

        JPanel tlo = new JPanel(null);
        tlo.setBounds(0, 0, 300, 300);
        tlo.setBackground(new Color(r, g, b));
        losowanie.add(tlo);

        return losowanie;

    }

    public losowanieKoloru() {

        JFrame frame = new JFrame("zmiana koloru tla");
        frame.setContentPane(createContentPane());
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);

    }

}
