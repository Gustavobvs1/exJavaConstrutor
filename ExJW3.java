//ExJW3.java
/**
 * 
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ExJW3 extends JFrame implements ActionListener //A janela ExJW3 herda as caracteristicas do JFrame e implementa a acao de quando pressiona algum botao
{
	//Declarando Variaveis da janela
	JLabel L1,L2,L3;
	JButton B1,B2,B3,B4,B5,B6;
	JTextField T1,T2,T3;

	//Imprimindo na tela a janela
	public static void main(String[]args)
	{
		JFrame JCalculadora = new ExJW3();
		JCalculadora.setVisible(true);
	}

	//Metodo Construtor
	ExJW3()
	{
		//configuracao inicial
		setTitle("Calculadora");
		setSize(600,500);
		setLocation(50,50);

		//Labels (rotulos)
		L1 = new JLabel (" Numero1: ");
		L1.setForeground(Color.black);//config cor do fundo
		L1.setFont(new Font("Comic Sans MS",Font.BOLD,20)); //config a fonte

		L2 = new JLabel (" Numero2: ");
		L2.setForeground(Color.red);//config cor do fundo
		L2.setFont(new Font("Comic Sans MS",Font.BOLD,20)); //config a fonte

		L3 = new JLabel (" Resultado: ");
		L3.setForeground(Color.blue);//config cor do fundo
		L3.setFont(new Font("Comic Sans MS",Font.BOLD,20)); //config a fonte

		//Buttons (botoes)
		B1 = new JButton("+");
		B1.addActionListener(this);
		B1.setFont(new Font("",Font.PLAIN,18));

		B2 = new JButton("-");
		B2.addActionListener(this);
		B2.setFont(new Font("",Font.PLAIN,18));

		B3 = new JButton("Limpar");
		B3.addActionListener(this);
		B3.setFont(new Font("Comic Sans Ms",Font.PLAIN,16));

		B4 = new JButton("*");
		B4.addActionListener(this);
		B4.setFont(new Font("",Font.PLAIN,18));

		B5 = new JButton("/");
		B5.addActionListener(this);
		B5.setFont(new Font("",Font.PLAIN,18));

		B6 = new JButton("SAIR");
		B6.setForeground(Color.red);
		B6.setBackground(Color.black);
		B6.setFont(new Font("Comic Sans Ms",Font.PLAIN,16));
		B6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				System.exit(0);
			}
		});

		//Campos que servem para o usuario inserir dados ou somente le-los
		T1 = new JTextField();
		T2 = new JTextField();
		T3 = new JTextField();
		T3.setEditable(false); //define que o campo 3 eh somente de leitura

		//Editar o estilo
		getContentPane().setBackground(Color.cyan);
		getContentPane().setLayout(new GridLayout(4,5));

		//Organizar a janela
		getContentPane().add(L1);
		getContentPane().add(T1);
		getContentPane().add(B1);

		getContentPane().add(L2);
		getContentPane().add(T2);
		getContentPane().add(B2);

		getContentPane().add(L3);
		getContentPane().add(T3);
		getContentPane().add(B4);

		getContentPane().add(B5);
		getContentPane().add(B3);
		getContentPane().add(B6);
	}
	public void actionPerformed(ActionEvent e)
	{
		//Declarando que as variaveis n1,n2 e result sao float
		float N1=0,N2=0,Result=0;
		//Declarando o botão Limpar
		if(e.getSource()==B3)
		{
			T1.setText("");
			T2.setText("");
			T3.setText("");
			return;
		}
		//Declarando que os numeros digitados nos campos 1 e 2 sao float
		N1 = Float.parseFloat(T1.getText());
		N2 = Float.parseFloat(T2.getText());
		//soma
		if(e.getSource()==B1)
		{
			Result = N1 + N2;
			T3.setText(" "+Result);
		}
		//subtracao
		if(e.getSource()==B2)
		{
			Result = N1 - N2;
			T3.setText(" "+Result);
		}
		//multiplicacao
		if(e.getSource()==B4)
		{
			Result = N1 * N2;
			T3.setText(" "+Result);
		}
		//divisao
		if(e.getSource()==B5)
		{
			if(N2==0)
			{
				T3.setText("Erro!Div por 0");
				return;
			}
			else
			{
				Result = N1/N2;
				T3.setText(" "+Result);
			}
		}
	}
}
