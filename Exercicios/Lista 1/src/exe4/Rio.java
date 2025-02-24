package exe4;

import javax.swing.JOptionPane;

public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;

    public Rio(){
        this.nome = "Rio não definido";
    }

    public Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public void chover(float x){
        this.nivel += x;
        System.out.println("Chuva realizada com sucesso");
    }

    public void ensolarar(float x){
        if (this.nivel - x >= 0){
            this.nivel -= x;
            System.out.println("Evaporação realizada com sucesso");
        }
        else {
            System.out.println("Evaporação não realizada, nível insuficiente");   
        }
    }

    public void limpar(){
        this.poluido = false;
        System.out.println("Limpeza realizada com sucesso");
    }

    public void sujar(){
        this.poluido = true;
        System.out.println("Poluição realizada com sucesso");
    }

    public void exibeDetalhes(){
       JOptionPane.showMessageDialog(null,
               "Nome: " + this.nome +
               "\nNível: " + this.nivel +
               "\nPoluído: " + this.poluido);
    }
}
