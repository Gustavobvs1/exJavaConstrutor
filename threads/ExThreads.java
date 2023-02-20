package threads;

//AppExThreads.java
import javax.swing.*;

public class ExThreads {
    public static void main(String args[]) {
        Tarefa_1 T1 = new Tarefa_1("Tarefa_1 contador 0 a 10");
        Tarefa_2 T2 = new Tarefa_2("Tarefa_2 contador 10 a 0");
        Tarefa_3 T3 = new Tarefa_3("Tarefa_3 contador 50 a 60");
        T1.start();
        T2.start();
        T3.start();
    }
}
