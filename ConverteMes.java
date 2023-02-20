import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ConverteMes extends JFrame implements ActionListener
{
    JLabel L1,L2;
    JTextField T1,T2;
    JButton Converte,Limpar,Sair;
    JPanel P1,P2;
    int N1;

    public static void main(String[] args)
    {
        JFrame Janela = new ConverteMes();
        Janela.setVisible(true);
    }

    ConverteMes()
    {
        setTitle("Converte Mês");
        setSize(450,170);
        setLocation(50,50);
        setResizable(true);
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        getContentPane().setBackground(Color.cyan);

        //Labels 
        L1 = new JLabel("Digite N° do mês: ");
        L1.setFont(new Font("Courier New",Font.BOLD,13));
        L1.setForeground(Color.black);
        L1.setBackground(Color.red);

        L2 = new JLabel("Mês: ");
        L2.setFont(new Font("Courier New",Font.BOLD,13));
        L2.setForeground(Color.black);
        L2.setBackground(Color.red);

        //Campos
        T1 = new JTextField(5);
        T2 = new JTextField(12);
        T2.setEditable(false);

        //Botoes
        Converte = new JButton("Converte");
        Converte.setFont(new Font("",Font.BOLD,12));
        Converte.addActionListener(this);

        Limpar = new JButton("Limpar");
        Limpar.setFont(new Font("",Font.BOLD,12));
        Limpar.addActionListener(this);

        Sair = new JButton("Sair");
        Sair.setFont(new Font("",Font.BOLD,12));
        Sair.setBackground(Color.red);
        Sair.setForeground(Color.white);
        Sair.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent args)
            {
                System.exit(0);
            }
        });

        //Paineis
        P1 = new JPanel();
        P2 = new JPanel();
        
        P1.add(L1); P1.add(T1); P1.add(L2); P1.add(T2);
        P2.add(Converte); P2.add(Limpar); P2.add(Sair);

        getContentPane().add(P1);
        getContentPane().add(P2);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==Limpar)
        {
            T1.setText("");
            T2.setText("");
        }
        if(e.getSource()==Converte)
        {
            N1 = Integer.parseInt(T1.getText());
            switch(N1)
            {
                case 1:
                T2.setText("Janeiro");
                break;

                case 2:
                T2.setText("Fevereiro");
                break;

                case 3:
                T2.setText("Março");
                break;

                case 4:
                T2.setText("Abril");
                break;

                case 5:
                T2.setText("Maio");
                break;

                case 6:
                T2.setText("Junho");
                break;

                case 7:
                T2.setText("Julho");
                break;

                case 8:
                T2.setText("Agosto");
                break;

                case 9:
                T2.setText("Setembro");
                break;

                case 10:
                T2.setText("Outubro");
                break;

                case 11:
                T2.setText("Novembro");
                break;

                case 12:
                T2.setText("Dezembro");
                break;

                default:
                T2.setText("Mês invalido!");
                break;
            }
        }
    }
}
