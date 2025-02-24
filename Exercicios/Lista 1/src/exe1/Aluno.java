package exe1;

import javax.swing.JOptionPane;

public class Aluno {
    public int numeroAluno, idade;
    public String nome;
    public float p1, p2;

    // construtor sem parâmetros
    public Aluno(){
        this.nome = "nome não definido";
    }

    // construtor com parâmetros
    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2){
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    public float notaFinal(){
        return(this.p1 + this.p2)/2;
    }

     public void dadosAluno(){
        JOptionPane.showMessageDialog(null,
                "Número Aluno: " + this.numeroAluno +
                "\nNome: " + this.nome +
                "\nIdade: " + this.idade +
                "\nNota final: " + this.notaFinal() +
                "\nSituação: " + this.passou());
    }

    public String passou(){
        // operador ternário
        return (this.notaFinal() >= 6) ? "Passou" : "Não Passou";
    }
}
