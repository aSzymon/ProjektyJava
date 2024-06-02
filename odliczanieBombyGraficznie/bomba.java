/** aSzymon - gtihub */

package odliczanieBombyGraficznie;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

public class bomba {

    JPanel tlo;
    JLabel liczba;
    JLabel zdjecieBooom;

    public bomba() {

        for (int i = 10; i >= 0; i--) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(i);

            JFrame frame = new JFrame("BOMBA");
            frame.setSize(300, 300);
            frame.setLayout(null);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(3);
            frame.setVisible(true);

            tlo = new JPanel(null);
            tlo.setBounds(0, 0, 300, 300);
            tlo.setBackground(new Color(150, 61, 61));
            frame.add(tlo);

            liczba = new JLabel();
            liczba.setText(String.valueOf(i));
            liczba.setBounds(0,0,290,235);
            liczba.setFont(new Font("Arial",Font.BOLD,110));
            liczba.setHorizontalAlignment(JLabel.CENTER);
            liczba.setVisible(true);
            tlo.add(liczba);

            ImageIcon boom = new ImageIcon("src/odliczanieBombyGraficznie/zdjeciaBomby/boomGif.gif");

            zdjecieBooom = new JLabel(boom);
            zdjecieBooom.setBounds(0, 0, 300, 300);
            zdjecieBooom.setBackground(new Color(140, 122, 255));
            zdjecieBooom.setVisible(false);
            tlo.add(zdjecieBooom);

            if (i == 0) {

                liczba.setVisible(false);

                zdjecieBooom.setVisible(true);

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                frame.dispose();

            }

            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            frame.dispose();

//            if (i == 10){frame.setVisible(false);}
//            if (i == 9){frame.setVisible(false);}
//            if (i == 8){frame.setVisible(false);}
//            if (i == 7){frame.setVisible(false);}
//            if (i == 6){frame.setVisible(false);}
//            if (i == 5){frame.setVisible(false);}
//            if (i == 4){frame.setVisible(false);}
//            if (i == 3){frame.setVisible(false);}
//            if (i == 2){frame.setVisible(false);}
//            if (i == 1){frame.setVisible(false);}
        }

    }

}

