package exe2;

import javax.swing.JOptionPane;

public class Cliente {
    public int numeroConta, numeroAgencia;
    public String nome;
    public float saldo;
    
    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo){
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void realizarDeposito(float x){
       this.saldo += x;
       System.out.println("Depósito realizado com sucesso");
    }

    public void realizarSaque(float x){
        if (this.saldo - x >= 0){
            this.saldo -= x;
            System.out.println("Saque realizado com sucesso");
        }
        else {
            System.out.println("Saque não realizado, saldo insuficiente");   
        }
    }

    public void dadosCliente(){
        JOptionPane.showMessageDialog(null,
                "Número conta: " + this.numeroConta +
                "\nNome do cliente: " + this.nome +
                "\nSaldo atual: " + this.saldo );
    }
}
