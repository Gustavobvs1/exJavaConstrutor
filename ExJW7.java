//ExJW7.java (RadioButton)
/**
 *
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ExJW7 extends JFrame implements ActionListener,ItemListener
{
    JLabel L1,L2;
    JTextField T1,T2;
    JPanel P1,P2;
    JRadioButton R1,R2,R3,R4;
    ButtonGroup radioGroup;
    float N1=0,result=0;

    public static void main(String args[])
    {
        JFrame Janela = new ExJW7();
        Janela.setVisible(true);
    }

    ExJW7()
    {
        setTitle("JRadioButton");
        setSize(340,140);
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        getContentPane().setBackground(new Color(17,166,0));

        //Labels
        L1 = new JLabel("Digite um Valor: ");
        L1.setForeground(Color.blue);
        L1.setFont(new Font("Arial",Font.BOLD,15));

        L2 = new JLabel("% do valor");
        L2.setForeground(Color.blue);
        L2.setFont(new Font("Arial",Font.BOLD,15));

        //Campos
        T1 = new JTextField(5);
        T1.setBackground(new Color(17,166,0));

        T2 = new JTextField(5);
        T2.setBackground(new Color(17,166,0));
        T2.setEditable(false);

        //Paineis
        P1 = new JPanel();
        P2 = new JPanel();

        //RadioButtons
        R1 = new JRadioButton("10% do valor");
        R1.setBackground(new Color(17,166,0));
        R1.addItemListener(this);

        R2 = new JRadioButton("20% do valor");
        R2.setBackground(new Color(17,166,0));
        R2.addItemListener(this);

        R3 = new JRadioButton("30% do valor");
        R3.setBackground(new Color(17,166,0));
        R3.addItemListener(this);

        R4 = new JRadioButton("Sair");
        R4.setBackground(new Color(17,166,0));
        R4.addItemListener(this);

        R1.setMnemonic(KeyEvent.VK_1);
        R2.setMnemonic(KeyEvent.VK_2);
        R3.setMnemonic(KeyEvent.VK_3);

        radioGroup = new ButtonGroup(); // inicialização do objeto radioGroup para conter os radioButtons
        radioGroup.add(R1);radioGroup.add(R2);radioGroup.add(R3);

        //Paineis
        P1.setLayout(new FlowLayout(FlowLayout.CENTER));
        P1.setBackground(new Color(17,166,0));

        P2.setLayout(new GridLayout(2,3));
        P2.setBackground(new Color(17,166,0));

        P1.add(L1); P1.add(T1);
        P2.add(R1); P2.add(R2); P2.add(R3);
        P2.add(L2); P2.add(T2); P2.add(R4);

        getContentPane().add(P1);
        getContentPane().add(P2);
    }

    public void itemStateChanged(ItemEvent e)
    {
        if(T1.getText().length()==0)
        return;

        try
        {
            N1 = Float.parseFloat(T1.getText());
            if(e.getSource()==R1)
            result=(N1*10)/100;

            if(e.getSource()==R2)
            result=(N1*20)/100;

            if(e.getSource()==R3)
            result = (N1*30)/100;

            if(e.getSource()==R4)
            System.exit(0);
        }
        catch(NumberFormatException erro)
        {
            T1.setText("Erro");
            return;
        }

        T2.setText(""+result);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }
}