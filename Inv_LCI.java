public class Inv_LCI extends Conta_Redimento{
    public Inv_LCI(int n_conta, Pessoa titular) {
        super(n_conta, titular);
        setJuros(6);
    }
}
