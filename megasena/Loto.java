package megasena;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Loto extends JFrame implements ActionListener {
    int num = 60;
    JTextField t1 = new JTextField(12);
    JButton b1 = new JButton("Sortear");
    JButton b2 = new JButton("Limpar");
    JButton b3 = new JButton("Sair");

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            if (!t1.getText().equals("")) {
                t1.setText("");
            }
            for (int i = 0; i < 6; i++) {
                if (i != 0) {
                    t1.setText(t1.getText() + "-");
                }
                t1.setText(t1.getText() + String.valueOf((int) (Math.random() * (num - 1 + 1) + 1)));
            }
        } else if (e.getSource() == b2) {
            t1.setText("");
        } else if (e.getSource() == b3) {
            this.setVisible(false);
        }
    }

    Loto(int x) {
        num = x;
        if (x == 60) {
            setTitle("Mega");
            getContentPane().setBackground(new Color(102, 140, 255));
            setLocation(400,300);
        } else if (x == 80) {
            setTitle("Quina");
            getContentPane().setBackground(new Color(0, 204, 0));
            setLocation(600,450);
        } else if (x == 50) {
            setTitle("Dupla");
            getContentPane().setBackground(new Color(255, 128, 213));
            setLocation(800,300);
        }
        //setLocationRelativeTo(null);
        setSize(450, 80);
        setLayout(new FlowLayout(FlowLayout.CENTER));

        t1.setEditable(false);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        add(t1);
        add(b1);
        add(b2);
        add(b3);

        setVisible(true);
        setResizable(false);
    }
}
