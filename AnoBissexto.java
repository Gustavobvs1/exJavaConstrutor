//ExAnoBissexto.java

/**
 * 
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnoBissexto extends JFrame implements ActionListener
{
     JLabel L1;
     JButton Limpar, VerAno, Sair;
     JTextField Ano, Bissexto;
     int N1;

     public static void main(String[] args)
     {
         JFrame Janela = new AnoBissexto();
         Janela.setVisible(true);
     }

     AnoBissexto()
     {
        setTitle("VerAno");
        setSize(400,180);
        setLocation(50,50);
        setResizable(false);
        getContentPane().setLayout(new GridLayout(2,3));
        getContentPane().setBackground(Color.cyan);

        //Labels
        L1 = new JLabel("Digite ano: ");
        L1.setFont(new Font("Courier New",Font.BOLD,13));
        L1.setForeground(Color.black);
        L1.setBackground(Color.red);

        //Campos
        Ano = new JTextField(10);
        Bissexto = new JTextField(10);
        Bissexto.setEditable(false);
 
        //Botoes
        Limpar = new JButton("Limpar");
        Limpar.setFont(new Font("",Font.BOLD,12));
        Limpar.addActionListener(this);

        VerAno = new JButton("VerAno");
        VerAno.setFont(new Font("",Font.BOLD,12));
        VerAno.addActionListener(this);

        Sair = new JButton("Sair");
        Sair.setFont(new Font("",Font.BOLD,12));
        Sair.setBackground(Color.red);
        Sair.setForeground(Color.white);
        Sair.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent args)
            {
                System.exit(0);
            }
        });

        getContentPane().add(L1); getContentPane().add(Ano); getContentPane().add(Bissexto);
        getContentPane().add(Limpar); getContentPane().add(VerAno); getContentPane().add(Sair);
     }

     public void actionPerformed(ActionEvent e)
     {
         if(e.getSource()==Limpar)
         {
             Ano.setText("");
             Bissexto.setText("");
         }
         if(e.getSource()==VerAno)
         {
            N1 = Integer.parseInt(Ano.getText());
            if(e.getSource()==VerAno)
            {
                if( (N1%4)==0 & (N1%100)>=1)
                {
                    Bissexto.setText("O ano é bissexto!!!");
                }
                else
                {
                    Bissexto.setText("O ano não é bissexto!!!");
                }
            }
         }
     }
}
