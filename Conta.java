abstract class Conta{
    private int n_conta;
    private Pessoa titular;
    private double saldo;

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
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }
}