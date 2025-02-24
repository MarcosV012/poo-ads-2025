package exe3;

import javax.swing.JOptionPane;

public class Produto {
    public int id, qtde;
    public String descricao;
    public float preco;

    public Produto(){
        this.descricao = "descrição não definida";
    }

    public Produto(int id, String descricao, int qtde, float preco){
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }

    public void comprar(int x){
        this.qtde += x;
        System.out.println("Compra realizada com sucesso");
    }

    public void vender(int x){
        if (this.qtde - x >= 0){
            this.qtde -= x;
            System.out.println("Venda realizada com sucesso");
        }
        else {
            System.out.println("Venda não realizada, quantidade insuficiente");   
        }
    }

    public void subir(float x){
        this.preco += x;
        System.out.println("Preço atualizado com sucesso");
    }

    public void descer(float x){
        if (this.preco - x >= 0){
            this.preco -= x;
            System.out.println("Preço atualizado com sucesso");
        }
        else {
            System.out.println("Preço não atualizado, valor inválido");   
        }
    }

    public void exibeDetalhes(){
        JOptionPane.showMessageDialog(null,
                "ID: " + this.id +
                "\nDescrição: " + this.descricao +
                "\nQuantidade: " + this.qtde +
                "\nPreço: " + this.preco);
    }
}
