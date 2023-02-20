//ExJW2.java;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ExJW2 extends JFrame implements ActionListener
{
	//Declarando as labels e Botoes
	JLabel L1, L2, L3, L4;
	JButton B1;
	JTextField T1;

ExJW2()
{
	//Montando a estrutura da janela
	setTitle("Janela com Labels e Botao");
	setSize(600,500);
	setLocation(50,50);
	setResizable(true);
	getContentPane().setBackground(Color.lightGray);

	//Labels
	L1 = new JLabel("2 Internet E", JLabel.CENTER);
	L1.setForeground(Color.red);
	L1.setFont(new Font("Times New Roman",Font.PLAIN,15));

	L2 = new JLabel ("FITO",JLabel.CENTER);
	L2.setVerticalAlignment(JLabel.TOP);
	L2.setForeground(Color.blue);
	L2.setFont(new Font("Georgia",Font.BOLD,30));

	L3 = new JLabel ("Seu N e seu Nome: ",JLabel.LEFT);
	L3.setForeground(Color.blue);

	L4 = new JLabel ("Labels e Mensagens",JLabel.CENTER);
	L4.setForeground(Color.black);

	//Campos
	T1 = new JTextField();
	T1.setSize(5,3);

	//Buttons
	B1 = new JButton("Sair");
	B1.setForeground(Color.red);
	B1.setBackground(Color.black);
	B1.setFont(new Font("Comic Sans Ms",Font.PLAIN,50));
	B1.addActionListener(this);
	B1.setVerticalAlignment(JButton.BOTTOM);

	//Adicionando os Atributos
	getContentPane().setLayout(new GridLayout(6,1));
	getContentPane().add(L2);
	getContentPane().add(L4);
	getContentPane().add(L1);
	getContentPane().add(L3);
	getContentPane().add(T1);
	getContentPane().add(B1);
}

//Montando a lógica do botao
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==B1)
	System.exit(0);
}

//Imprimindo na tela
public static void main(String[]args)
{
	JFrame Janela = new ExJW2();
	Janela.setVisible(true);
}

}