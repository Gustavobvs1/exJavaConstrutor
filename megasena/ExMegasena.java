package megasena;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExMegasena extends JFrame implements ActionListener {

    JLabel l1 = new JLabel("Selecione a loteria:");
    JButton b1 = new JButton("Mega");
    JButton b2 = new JButton("Quina");
    JButton b3 = new JButton("Dupla");
    JButton b4 = new JButton("Sair");
    JPanel p1 = new JPanel();

    public static void main(String[] args) {
        new ExMegasena();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            new Loto(60);
        } else if (e.getSource() == b2) {
            new Loto(80);
        } else if (e.getSource() == b3) {
            new Loto(50);
        } else if (e.getSource() == b4) {
            System.exit(0);
        }
    }

    ExMegasena() {
        l1.setFont(new Font("Arial", Font.BOLD, 12));

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(420, 83);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        getContentPane().setBackground(Color.yellow);
        setResizable(false);

        p1.setBackground(new Color(210, 77, 255));

        b1.setBackground(new Color(102, 140, 255));
        b2.setBackground(new Color(0, 204, 0));
        b3.setBackground(new Color(255, 128, 213));

        b4.setForeground(Color.white);
        b4.setBackground(Color.red);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        p1.add(l1);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);

        add(p1);

        setVisible(true);
    }
}
