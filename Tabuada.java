//ExTabuada.java

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tabuada extends JFrame implements ActionListener
{
    JLabel L1;
    JButton Tabuada, Limpar, Sair;
    JTextArea TA1;
    JTextField T1;
    JScrollPane JP1;
    JPanel P1,P2,P3;
    float N1;

    public static void main(String[] args)
    {
        JFrame Janela = new Tabuada();
        Janela.setVisible(true);
    }

    Tabuada()
    {
        setTitle("Tabuada");
        setSize(400,300);
        setLocation(50,50);
        setResizable(true);
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        getContentPane().setBackground(Color.cyan);

        //Campos
        T1 = new JTextField(10);

        TA1 = new JTextArea(10,30);
        TA1.setEditable(false);

        JP1 = new JScrollPane(TA1);

        //Buttons
        Tabuada = new JButton("Tabuada");
        Tabuada.setFont(new Font("",Font.BOLD,13));
        Tabuada.addActionListener(this);

        Limpar = new JButton("Limpar");
        Limpar.setFont(new Font("",Font.BOLD,13));
        Limpar.addActionListener(this);

        Sair = new JButton("Sair");
        Sair.setFont(new Font("",Font.BOLD,13));
        Sair.setBackground(Color.red);
        Sair.setForeground(Color.white);
        Sair.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent args)
            {
                System.exit(0);
        }});

        //Labels
        L1 = new JLabel("Digite um Nº");
        L1.setForeground(Color.DARK_GRAY);
        L1.setFont(new Font("Courier New",Font.BOLD,15));

        //Paineis
        P1 = new JPanel();
        P2 = new JPanel();
        P3 = new JPanel();
        P1.setLayout(new FlowLayout(FlowLayout.CENTER));
        P2.setLayout(new GridLayout(1,3));
        P3.setLayout(new FlowLayout(FlowLayout.CENTER));

        P1.add(L1); P1.add(T1); 
        P2.add(Tabuada); P2.add(Limpar); P2.add(Sair);
        P3.add(JP1);

        getContentPane().add(P1);
        getContentPane().add(P2);
        getContentPane().add(P3);
    }

    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==Limpar)
        {
            T1.setText("");
            TA1.setText("");
        }
        if(e.getSource()==Tabuada)
        {
            N1 = Float.parseFloat(T1.getText());
            if(T1.getText().length()==0){
                TA1.setText("Erro! Digite um numero para funcionar");
            }
            else
            TA1.setText(N1+" X 1: "+ N1*1 + "\n"+N1+" X 2: "+N1*2 + "\n"+N1+" X 3: "
            +N1*3+"\n"+N1+" X 4: "+N1*4+"\n"+N1+" X 5: "+N1*5+"\n"+N1+" X 6: "
            +N1*6+"\n"+N1+" X 7: "+N1*7+"\n"+N1+" X 8: "
            +N1*8+"\n"+N1+" X 9: "+N1*9+"\n"+N1+" X 10: "+N1*10);
        }
    }
}