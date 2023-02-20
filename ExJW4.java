//ExJW4.java (ListBox)

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class ExJW4 extends JFrame implements ListSelectionListener, ActionListener
{
	JLabel L1;
	JTextField T1;
	JList lista;
	JButton Bquant,Bindice,Blimpar;
	DefaultListModel listModel;

	public static void main (String[]args)
	{
		JFrame Janela = new ExJW4();
		Janela.setVisible(true);
	}

	ExJW4()
	{
		setTitle("JListBox");
		setSize(400,550);
		setLocation(50,50);

		T1 = new JTextField();
		T1.addActionListener(this);

		L1 = new JLabel("Sem Selecao: ");
		L1.setForeground(Color.black);

		Bquant = new JButton("Quantidade de itens: ");
		Bquant.addActionListener(this);

		Bindice = new JButton("Indice selecionado");
		Bindice.addActionListener(this);

		Blimpar = new JButton("Remove item");

		listModel = new DefaultListModel();
		listModel.addElement("Administracao");
		listModel.addElement("Eletronica");
		listModel.addElement("Informatica para Internet");
		listModel.addElement("Desenvolvimento de Sistemas");
		listModel.addElement("Basico");

		//Registra a lista
		lista = new JList(listModel);
		//lista.addActionListener(this);

		//Torna a lista como um painel "rolavel"
		JScrollPane painel = new JScrollPane(lista);

		//Define a ordem da interface
		getContentPane().setLayout(new GridLayout(6,1));
		getContentPane().add(L1);
		getContentPane().add(T1);
		getContentPane().add(painel);
		getContentPane().add(Bquant);
		getContentPane().add(Bindice);
		getContentPane().add(Blimpar);

	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==T1)
		{
			listModel.addElement(T1.getText());
			T1.setText(" ");
		}
		if(e.getSource()==Bquant)
			T1.setText("Quantidade: "+listModel.getSize());

		if(e.getSource()==Bindice)
			T1.setText("Indice Selecionado: "+ lista.getSelectedIndex());

		if(e.getSource()==Blimpar)
		{
			T1.setText("Removido: "+lista.getSelectedValue());
			listModel.remove(0);
		}
	}

	public void valueChanged(ListSelectionEvent e)
	{
		L1.setText("selecionado: "+lista.getSelectedValue());
	}
}
