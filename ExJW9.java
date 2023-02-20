//ExJW9.java (dialog)

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ExJW9 extends JFrame implements ActionListener 
{
    JLabel L1,L2;
    JButton B1,B2,B3;

    public static void main(String[] args)
    {
        JFrame Janela = new ExJW9();
        Janela.setVisible(true);
    }

    ExJW9()
    {
        setBackground(Color.cyan);
        setTitle("Caixas de Dialogo");
        setSize(400,450);
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));

        L1 = new JLabel("");
        L2 = new JLabel("Resposta: ");

        B1 = new JButton("Sim e Não");
        B1.addActionListener(this);

        B2 = new JButton("Sim,Não e Cancelar");
        B2.addActionListener(this);

        B3 = new JButton("OK e Cancelar");
        B3.addActionListener(this);

        getContentPane().add(B1);
        getContentPane().add(B2);
        getContentPane().add(B3);
        getContentPane().add(L2);
        getContentPane().add(L1);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        int resp = 0;

        if(e.getSource()==B1)
        resp = JOptionPane.showConfirmDialog(null, "Erro ao acessar arquivo. Tente Novamente", "Erro de Arquivo", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);

        if(e.getSource()==B2)
        resp = JOptionPane.showConfirmDialog(null, "Deseja salvar as alterações?", "Salvar Arquivo", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);

        if (e.getSource()==B3) 
        resp = JOptionPane.showConfirmDialog(null, "Deseja Abrir Arquivo?", "Abrir Arquivo", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        switch(resp)
        {
            case 0:
            L1.setText("Pressionado o botão Yes/ok");
            break;

            case 1:
            L1.setText("Pressionado o botão No");
            break;

            case 2:
            L1.setText("Pressionado o botão Cancel");
            break;
        }
            
    }
}
