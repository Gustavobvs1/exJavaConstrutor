//ExJW8.java (TextArea)

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ExJW8 extends JFrame implements ActionListener
{
    JTextField T1;
    JLabel L1;
    JTextArea TA1,TA2;
    JButton B1,B2,B3,B4;
    JScrollPane painel1,painel2;

    public static void main(String[] args)
    {
        JFrame Janela = new ExJW8();
        Janela.setVisible(true);
    }
    ExJW8()
    {
        setTitle("JtextArea - Meu Pequeno Editor de Texto");
        setSize(480,280);
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));

        T1 = new JTextField(22);
        T1.addActionListener(this);

        L1 = new JLabel("Aperte ENTER para inserir a string");

        B1 = new JButton("Copia Tudo");
        B1.addActionListener(this);

        B2 = new JButton("Copia Selecionado");
        B2.addActionListener(this);

        B3 = new JButton("Limpa Tudo");
        B3.addActionListener(this);

        B4 = new JButton("Sair");
        B4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				System.exit(0);
			}
		});

        //TextAreas
        TA1 = new JTextArea(5,40); // 5 linhas e 40 colunas do TextArea
        TA1.setEditable(false);
        TA2 = new JTextArea(5,40);
        TA2.setEditable(false);

        JScrollPane painel1 = new JScrollPane(TA1);
        JScrollPane painel2 = new JScrollPane(TA2);

        getContentPane().add(painel1);
        getContentPane().add(T1); getContentPane().add(L1);
        getContentPane().add(B1); getContentPane().add(B2);
        getContentPane().add(B3); getContentPane().add(B4);
        getContentPane().add(painel2);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==T1) // ao pressionar ENTER  no JTextField
        {
            TA1.append(T1.getText()); // append insere o conteudo do T1 no TA1
            T1.setText("");
        }
        if(e.getSource()==B1) // copia o conteudo do TA1 em TA2
        TA2.setText(TA1.getText());

        if(e.getSource()==B2) // copia selecionado
        TA2.setText(TA1.getSelectedText());

        if(e.getSource()==B3) // limpa conteudo TA1 e TA2
        {
            TA1.setText("");
            TA2.setText("");
        }
    }
}
