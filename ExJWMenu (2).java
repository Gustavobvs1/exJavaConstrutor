import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExJWMenu extends JFrame implements ActionListener {

    JLabel L1 = new JLabel("Teste");
    JMenuBar MB = new JMenuBar();
    JTextField T1 = new JTextField();
    JMenu mCadastro, mRelatorio;
    JMenuItem miCliente, miFornecedor, miSair, miRcliente, miRFornecedor;

    public static void main(String[] args) {
        new ExJWMenu();
    }

    ExJWMenu() {
        setTitle("Menu");
        setSize(250, 150);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(0, 128, 128));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        WindowListener x = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        addWindowListener(x);

        mCadastro = new JMenu("Cadastro");
        mRelatorio = new JMenu("Relatorios");

        miCliente = new JMenuItem("Cliente");
        miCliente.addActionListener(this);

        miFornecedor = new JMenuItem("Fornecedor");
        miFornecedor.addActionListener(this);

        miSair = new JMenuItem("Sair");
        miSair.addActionListener(this);

        mCadastro.add(miCliente);
        mCadastro.add(miFornecedor);
        mCadastro.add(miSair);

        miRcliente = new JMenuItem("Relação de Clientes");
        miRcliente.addActionListener(this);

        miRFornecedor = new JMenuItem("Relação de Fornecedores");
        miRFornecedor.addActionListener(this);

        mRelatorio.add(miRcliente);
        mRelatorio.add(miRFornecedor);

        MB.add(mCadastro);
        MB.add(mRelatorio);
        setJMenuBar(MB); // define MB como barra de menus padrão
        getContentPane().add(L1);
        getContentPane().add(T1);
        setVisible(true);
    }

    public void ActionPerformed(ActionEvent e) {
        if (e.getSource() == miCliente)
            T1.setText("Você escolheu o item cliente");
        if(e.getSource()== miFornecedor)
            T1.setText("Você escolheu o item fornecedor");
        if(e.getSource()== miRcliente)
            T1.setText("Você escolheu o item \nrelação de clientes");
        if(e.getSource()==miRFornecedor)
            T1.setText("Você escolheu o item \nrelação de fornecedores");
        if(e.getSource()==miSair)
            System.exit(0);
    }
}