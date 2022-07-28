import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

abstract class Conta{
    private int n_conta;
    private Pessoa titular;
    private double saldo;
    private ArrayList extrato = null;

    public Conta(int n_conta, Pessoa titular) {
        this.n_conta = n_conta;
        this.titular = titular;
    }

    public int getN_conta() {
        return n_conta;
    }

    public void setN_conta(int n_conta) {
        this.n_conta = n_conta;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void addSaldo(double saldo) {
        if (this.saldo <= saldo){
            this.saldo += saldo;
            if(saldo>=0){
                extrato.add("Depósito de " + saldo + "Reais");
            }else{
                extrato.add("Saque de " + saldo + "Reais");
            }
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }

    public ArrayList getExtrato() {
        return extrato;
    }

    public void setExtrato(ArrayList extrato) {
        this.extrato = extrato;
    }
}