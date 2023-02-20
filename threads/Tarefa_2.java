package threads;

import javax.swing.JOptionPane;

// Tarefa_1.java

class Tarefa_2 extends Thread {
    public Tarefa_2(String nome) {
        super(nome);
    }

    public void run() {
        String resp = "Tem fluxo do programa 2: ";
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        String A = getName();
        resp += "\nNome da Thread = " + A + "";
        int b = getPriority();
        resp += "\nUma Thread de prioridade = " + b + "\n";
        for (int i = 10; i >= 0; i--) {
            resp += " - " + i;
        }
        JOptionPane.showMessageDialog(null, resp, "Resposta", -1);
    }
}