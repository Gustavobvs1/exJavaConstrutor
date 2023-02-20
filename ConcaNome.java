//ConcaNome.java
/**
 * 
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ConcaNome extends JFrame implements ActionListener
{
    JLabel L1,L2,L3,L4;
    JTextField T1,T2,T3,T4;
    JButton B1,B2,B3;

    public static void main(String[] args)
    {
        JFrame  Janela = new ConcaNome();
        Janela.setVisible(true);
    }

    ConcaNome()
    {
        //setBackground(Color.cyan);
        setTitle("Concatenação de Strings");
        setSize(450,200);

        //Labels
        L1 = new JLabel("Digite seu Primeiro Nome: ");
        L1.setForeground(Color.red);

        L2 = new JLabel("Digite seu nome do meio: ");
        L2.setForeground(Color.blue);

        L3 = new JLabel("Digite seu Sobrenome: ");
        L3.setForeground(Color.black);

        L4 = new JLabel("Nome Completo: ");
        L4.setForeground(Color.black);

        //Campos
        T1 = new JTextField(23);
        T2 = new JTextField(23);
        T3 = new JTextField(23);

        T4 = new JTextField(25);
        T4.setEditable(false);

        //Buttons
        B1 = new JButton("Concatenar");
        B1.setForeground(Color.black);
        B1.addActionListener(this);

        B2 = new JButton("Limpar");
        B2.setForeground(Color.black);
        B2.addActionListener(this);

        B3 = new JButton("Sair");
        B3.setForeground(Color.black);
        B3.setSize(20,30);
        B3.addActionListener(this);

        getContentPane().setBackground(Color.cyan);
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        getContentPane().add(L1); getContentPane().add(T1); 
        getContentPane().add(L2); getContentPane().add(T2);
        getContentPane().add(L3); getContentPane().add(T3);
        getContentPane().add(B1); getContentPane().add(B2); getContentPane().add(B3);
        getContentPane().add(L4); 
        getContentPane().add(T4);

    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==B2)
        {
            T1.setText("");
			T2.setText("");
			T3.setText("");
            T4.setText("");
			return;
        }
        if(e.getSource()==B3)
        System.exit(0);

        if(e.getSource()==B1)
        {
           T4.setText(T1.getText()+" "+T2.getText()+" "+T3.getText());
        }
    }
}
