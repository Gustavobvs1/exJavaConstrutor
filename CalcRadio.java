//ExJW7.java (RadioButton)
/**
 * 
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalcRadio extends JFrame implements ActionListener,ItemListener
{
    JLabel L1,L2,L3;
    JTextField T1,T2,T3;
    JPanel P1,P2,P3,P4;
    JButton B1;
    JRadioButton R1,R2,R3,R4;
    ButtonGroup radioGroup;
    float N1=0,N2=0,operacao=0;
    String result;

    public static void main(String args[])
    {
        JFrame Janela = new CalcRadio();
        Janela.setVisible(true);
    }

    CalcRadio()
    {
        setTitle("JRadioButton");
        setSize(500,300);
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        getContentPane().setBackground(new Color(17,166,0));

        //Labels
        L1 = new JLabel("Digite o valor do primeiro número: ");
        L1.setForeground(Color.blue);
        L1.setFont(new Font("Arial",Font.BOLD,15));

        L2 = new JLabel("Digite o valor do segundo número:");
        L2.setForeground(Color.blue);
        L2.setFont(new Font("Arial",Font.BOLD,15));
        L2.setAlignmentX(CENTER_ALIGNMENT);

        L3 = new JLabel("Resultado: ");
        L3.setForeground(Color.blue);
        L3.setFont(new Font("Arial",Font.BOLD,15));

        //Campos
        T1 = new JTextField(5);
        T1.setBackground(new Color(17,166,0));

        T2 = new JTextField(5);
        T2.setBackground(new Color(17,166,0));

        T3 = new JTextField(12);
        T3.setBackground(new Color(17,166,0));
        T3.setEditable(false);


        //Paineis
        P1 = new JPanel();
        P2 = new JPanel();
        P3 = new JPanel();
        P4 = new JPanel();
        
        //Botões
        B1 = new JButton("Sair");
        B1.setFont((new Font("Arial",Font.BOLD,11)));
        B1.setBackground(Color.red);
        B1.setForeground(Color.black);
        B1.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent arg0)
			{
				System.exit(0);
			}
		});

        //RadioButtons
        R1 = new JRadioButton("+");
        R1.setBackground(new Color(17,166,0));
        R1.addItemListener(this);

        R2 = new JRadioButton("-");
        R2.setBackground(new Color(17,166,0));
        R2.addItemListener(this);

        R3 = new JRadioButton("*");
        R3.setBackground(new Color(17,166,0));
        R3.addItemListener(this);

        R4 = new JRadioButton("/");
        R4.setBackground(new Color(17,166,0));
        R4.addItemListener(this);

        R1.setMnemonic(KeyEvent.VK_1);
        R2.setMnemonic(KeyEvent.VK_2);
        R3.setMnemonic(KeyEvent.VK_3);
        R4.setMnemonic(KeyEvent.VK_4);

        radioGroup = new ButtonGroup(); // inicialização do objeto radioGroup para conter os radioButtons
        radioGroup.add(R1);radioGroup.add(R2);radioGroup.add(R3);radioGroup.add(R4);

        //Paineis
        P1.setLayout(new FlowLayout(FlowLayout.CENTER));
        P1.setBackground(new Color(17,166,0));

        P2.setLayout(new FlowLayout(FlowLayout.CENTER));
        P2.setBackground(new Color(17,166,0));

        P3.setLayout(new FlowLayout(FlowLayout.CENTER));
        P3.setBackground(new Color(17,166,0));

        P4.setLayout(new GridLayout(1,3));
        P4.setBackground(new Color(17,166,0));

        P1.add(L1); P1.add(T1);
        P2.add(L2); P2.add(T2);
        P3.add(R1); P3.add(R2); P3.add(R3); P3.add(R4);
        P4.add(L3); P4.add(T3); P4.add(B1);

        getContentPane().add(P1);
        getContentPane().add(P2);
        getContentPane().add(P3);
        getContentPane().add(P4);
    }

    public void itemStateChanged(ItemEvent e)
    {
        if(T1.getText().length()==0)
        return;

        try
        {
            N1 = Float.parseFloat(T1.getText());
            N2 = Float.parseFloat(T2.getText());
            if(e.getSource()==R1)
            {
                operacao = N1 + N2;
                result = N1 + " + " + N2 + " = " + operacao;
            }
            if(e.getSource()==R2)
            {
                operacao = N1 - N2;
                result = N1 + " - " + N2 + " = " + operacao;
            }
            if(e.getSource()==R3)
            {
                operacao = N1 * N2;
                result = N1 + " * " + N2 + " = " + operacao;
            }
            if(e.getSource()==R4)
            {
                if(N2 == 0)
                result = "Erro! Div por 0";
                else
                operacao = N1 / N2;
                result = N1 + " / " + N2 + " = " + operacao;
            }
        }
        catch(NumberFormatException erro)
        {
            T1.setText("Erro");
            return;
        }

        T3.setText(""+result);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }
}
