import exe1.Aluno;

import javax.swing.*;

public class MainAluno {
    public static void main(String[] args) {
        Aluno obj1 = new Aluno();
        obj1.numeroAluno = Integer.parseInt(JOptionPane.showInputDialog("Numero Aluno: "));
        obj1.nome = JOptionPane.showInputDialog("Nome: ");
        obj1.idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
        obj1.p1 = Float.parseFloat(JOptionPane.showInputDialog("P1: "));
        obj1.p2 = Float.parseFloat(JOptionPane.showInputDialog("P2: "));
        obj1.dadosAluno();

        Aluno obj2 = new Aluno(19, "Fulano", 16, 5, 8.5f);
        obj2.dadosAluno();
        // System.out.println(obj1.nome + " " + obj1.passou());

        Aluno obj3 = new Aluno();
        obj3.dadosAluno();

    }
}
