//Exjwl.java
/**
 * 
 */

import java.awt.*;
import javax.swing.*; //Bibliotecas
//import java.awt.event.*;

class Exjwl extends JFrame
{
	Exjwl()
	{
		setTitle("ExJwl - POO com objetos")	;
		setSize(400,200); //largura e comprimento
		setLocation(400,300); //posi��o do canto esquerdo superior da tela
		setResizable(true); //janela redimensionavel
		getContentPane().setBackground(Color.red);
		}
	public static void main(String[] args) //Metodo main - classe ExJwl � uma classe java executavel
	{
		JFrame Janela = new Exjwl(); //declara��o e instanciando janela
		Janela.setVisible(true); //mostra na janela o objeto janela
	}
}