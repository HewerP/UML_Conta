public class Conta_Poupanca extends Conta_Redimento{

    public Conta_Poupanca(int n_conta, Pessoa titular) {
        super(n_conta, titular);
        setJuros(6);
    }
}
