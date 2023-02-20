package threads;

import javax.swing.JOptionPane;

// Tarefa_3.java

class Tarefa_3 extends Thread {
    public Tarefa_3(String nome) {
        super(nome);
    }

    public void run() {
        String resp = "Tem fluxo do programa 3: ";
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        String A = getName();
        resp += "\nNome da Thread = " + A + "";
        int b = getPriority();
        resp += "\nUma Thread de prioridade = " + b + "\n";
        for (int i = 50; i <= 60; i++) {
            resp += " - " + i;
        }
        JOptionPane.showMessageDialog(null, resp, "Resposta", -1);
    }
}