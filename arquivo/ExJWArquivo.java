package arquivo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class ExJWArquivo extends JFrame implements ActionListener {

    JLabel L1 = new JLabel("Texto a ser editado:");
    JLabel L2 = new JLabel("Status do Arquivo: ");
    JTextArea TA1 = new JTextArea(8, 40);
    JButton Gravar, Abrir, Limpar, Sair;
    JTextField T1 = new JTextField(35);
    JPanel P1, P2, P3, P4, P5;
    JScrollPane Sb1 = new JScrollPane(TA1);
    FileDialog fileSave, fileOpen;
    PrintWriter fileWriter;
    Scanner fileReader;

    public static void main(String[] args) {
        new ExJWArquivo();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Limpar) {
            TA1.setText("");
            T1.setText("");
        }
        if(e.getSource()==Gravar){
            try{
                fileSave = new FileDialog(new Dialog(this), "Salvando arquivo", FileDialog.SAVE);
                fileSave.setVisible(true);

                fileWriter = new PrintWriter(fileSave.getDirectory()+ fileSave.getFile());
                fileWriter.print(TA1.getText());
                fileWriter.close();
                T1.setText("Arquivo salvo com sucesso");
                T1.setForeground(Color.blue);
            } catch (Exception ex){
                T1.setText(String.valueOf(ex));
            }
        }
        if(e.getSource()==Abrir){
            try{
                fileOpen = new FileDialog(new Dialog(this), "Abrindo arquivo", FileDialog.LOAD);
                fileOpen.setVisible(true);

                fileReader = new Scanner(new FileReader(fileSave.getDirectory() + fileSave.getFile()));
                if(TA1.getText()!=""){
                    TA1.setText("");
                }
                while (fileReader.hasNextLine()){
                    TA1.setText(TA1.getText() + fileReader.nextLine() + "\n");
                }
                fileReader.close();
                T1.setText("Arquivo aberto com sucesso!");
                T1.setForeground(Color.red);
            }catch( Exception ex){
                T1.setText(String.valueOf(ex));
            }
        }

    }

    ExJWArquivo() {
        setTitle("App arquivo");
        setSize(500, 350);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.yellow);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER));

        L1.setFont(new Font("Arial", Font.BOLD, 16));
        L2.setFont(new Font("Arial", Font.BOLD, 16));

        T1.setEditable(false);

        Gravar = new JButton("Gravar");
        Gravar.addActionListener(this);
        Gravar.setPreferredSize(new Dimension(100, 30));

        Abrir = new JButton("Abrir");
        Abrir.addActionListener(this);
        Abrir.setPreferredSize(new Dimension(100, 30));

        Limpar = new JButton("Limpar");
        Limpar.addActionListener(this);
        Limpar.setPreferredSize(new Dimension(100, 30));

        Sair = new JButton("Sair");
        Sair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        Sair.setPreferredSize(new Dimension(100, 30));

        P1 = new JPanel();
        P2 = new JPanel();
        P3 = new JPanel();
        P4 = new JPanel();
        P5 = new JPanel();

        P1.add(L1);
        P1.setLayout(new FlowLayout(FlowLayout.CENTER));
        P1.setBackground(Color.YELLOW);

        P2.add(Sb1);
        P2.setLayout(new FlowLayout(FlowLayout.CENTER));

        P3.add(Gravar);
        P3.add(Abrir);
        P3.add(Limpar);
        P3.add(Sair);
        P3.setLayout(new FlowLayout(FlowLayout.CENTER));
        P3.setSize(30, 20);
        P3.setOpaque(false);

        P4.add(L2);
        P4.setLayout(new FlowLayout(FlowLayout.CENTER));
        P4.setBackground(Color.YELLOW);
        P4.setAlignmentY(BOTTOM_ALIGNMENT);

        P5.add(T1);
        P5.setLayout(new FlowLayout(FlowLayout.CENTER));
        P5.setAlignmentY(BOTTOM_ALIGNMENT);

        getContentPane().add(P1);
        getContentPane().add(P2);
        getContentPane().add(P3);
        getContentPane().add(P4);
        getContentPane().add(P5);
        setVisible(true);
    }
}
